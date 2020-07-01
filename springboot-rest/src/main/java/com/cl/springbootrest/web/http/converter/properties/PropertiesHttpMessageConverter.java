package com.cl.springbootrest.web.http.converter.properties;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.ObjectUtil;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * @program: bootall
 * @description: HttpMessageConverter实现
 * @author: 曹凌
 * @create: 2020-06-30 10:51
 **/
public class PropertiesHttpMessageConverter extends AbstractGenericHttpMessageConverter<Properties> {
    public PropertiesHttpMessageConverter() {
        super(new MediaType("text", "properties"));
    }

    @Override
    protected void writeInternal(Properties properties, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        //字节输出流
        OutputStream body = outputMessage.getBody();
        //字符流 -> 字符编码 从请求头Content-Type中获取字符编码
        MediaType contentType = outputMessage.getHeaders().getContentType();
        //获取字符编码
        Charset charset = ObjectUtil.defaultIfNull(contentType.getCharset(), CharsetUtil.defaultCharset());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(body, charset);
        properties.store(outputStreamWriter,"From PropertiesHttpMessageConverter");
    }

    @Override
    protected Properties readInternal(Class<? extends Properties> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        Properties properties = new Properties();
        //字节流
        InputStream inputStream = inputMessage.getBody();
        //字符流 -> 字符编码 从请求头Content-Type中获取字符编码
        MediaType contentType = inputMessage.getHeaders().getContentType();
        //获取字符编码
        Charset charset = ObjectUtil.defaultIfNull(contentType.getCharset(), CharsetUtil.defaultCharset());
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        properties.load(inputStreamReader);
        return properties;
    }

    @Override
    public Properties read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return readInternal(null, inputMessage);
    }
}
