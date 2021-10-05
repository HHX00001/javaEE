package hhx02.myservlet;

/**
 * @author hhxStellar
 * @date 2021/9/11-9:09
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/a/b/c.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
