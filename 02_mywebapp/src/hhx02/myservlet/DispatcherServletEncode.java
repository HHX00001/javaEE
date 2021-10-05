package hhx02.myservlet;

/**
 * 转发过后字符集不变
 * @author hhxStellar
 * @date 2021/9/11-10:36
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class DispatcherServletEncode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("---------------");
        System.out.println("get转发方法" + request.getParameter("username"));
        PrintWriter pw = response.getWriter();
        pw.print(request.getParameter("username"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("---------------");
        System.out.println("post转发方法" + request.getParameter("username"));
        PrintWriter pw = response.getWriter();
        pw.print(request.getParameter("username"));
    }
}
