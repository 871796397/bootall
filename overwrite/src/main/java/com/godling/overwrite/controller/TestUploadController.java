package com.godling.overwrite.controller;

import io.minio.MinioClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.net.URLConnection;

/**
 * Created with 87179
 * Description: 上传测试
 * Date: 2020-03-10
 * Time: 18:10
 * Project: study_boot
 *
 * @author 87179
 */
@RestController
@RequestMapping("/test")
public class TestUploadController {

    @PostMapping("/upload")
    public String upload(@RequestParam("picFile") MultipartFile multipartFile) {
        try {
            // Create a minioClient with the MinIO Server name, Port, Access key and Secret key.
            MinioClient minioClient = new MinioClient("http://oss.jwt.com",
                    "W5Z3I1N9IVH5FXW38D11",
                    "BLjyXAjVTGLxkA79EtqImrM0mTP2gpXSFabOaRSX");

            // Check if the bucket already exists.
            boolean isExist = minioClient.bucketExists("video");
            if (isExist) {
                System.out.println("Bucket already exists.");
            } else {
                // Make a new bucket called asiatrip to hold a zip file of photos.
                minioClient.makeBucket("video", "ap-east-1", false);
            }
            minioClient.putObject("video", multipartFile.getOriginalFilename(),
                    multipartFile.getInputStream(), multipartFile.getSize(),
                    null, null, URLConnection.guessContentTypeFromName(multipartFile.getOriginalFilename()));
            minioClient.setBucketPolicy("video","{\n" +
                    "    \"Statement\":[\n" +
                    "        {\n" +
                    "            \"Effect\":\"Allow\",\n" +
                    "            \"Principal\":\"*\",\n" +
                    "            \"Action\":\"s3:GetObject\",\n" +
                    "            \"Resource\":\"arn:aws:s3:::video/*\"\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}");
            System.out.println("/home/user/Photos/asiaphotos.zip is successfully uploaded as asiaphotos.zip to `asiatrip` bucket.");
        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
        }
        return "success";
    }
}
