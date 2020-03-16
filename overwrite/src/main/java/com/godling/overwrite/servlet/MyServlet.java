package com.godling.overwrite.servlet;//package com.cl.study.web.servlet;
//
//import javax.servlet.AsyncContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Created with 87179
// * Description: 测试Servlet
// * Date: 2020-03-10
// * Time: 0:11
// * Project: study_boot
// *
// * @author 87179
// */
////如果要开启异步Servlet,需要修改asyncSupported为true
//@WebServlet(urlPatterns = "/my/shit",asyncSupported = true)
//public class MyServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //同步上下文
////        resp.getWriter().println("piece of shit~");
//        AsyncContext asyncContext = req.startAsync();
//        asyncContext.start(() -> {
//            try {
//                resp.getWriter().println("fuck them all");
//                //显式的调用完成
//                asyncContext.complete();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//
//    }
//
//
//
//}
