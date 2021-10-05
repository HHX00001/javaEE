package hhx02.myservlet;

/**
 * 字符集问题
 * @author hhxStellar
 * @date 2021/9/10-22:45
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //get的数据在请求头，tomcat在8？版本之后不用设置编码
        System.out.println("get方法" + request.getParameter("username"));

        //一、通过响应头设置浏览器也为utf-8
        //response.setHeader("Content-Type", "text/html; charset=UTF-8");

        //二、设置服务器、客户端和响应头都是utf-8
        System.out.println("设置前服务器编码为" + response.getCharacterEncoding());
        response.setContentType("text/html; charset=UTF-8");
        System.out.println("设置后服务器编码为" + response.getCharacterEncoding());
        PrintWriter pw = response.getWriter();
        pw.print(request.getParameter("username"));

        request.getRequestDispatcher("/encode").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("post方法" + request.getParameter("username"));
        System.out.println(request.getCharacterEncoding());
        //获取请求参数之前调用
        request.setCharacterEncoding("utf-8");
        System.out.println(request.getCharacterEncoding());

        response.setContentType("text/html; charset=UTF-8");

        System.out.println("post方法" + request.getParameter("username"));

        PrintWriter pw = response.getWriter();
        pw.print(request.getParameter("username"));

        request.getRequestDispatcher("/encode").forward(request,response);
    }
}
