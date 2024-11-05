package learn.jsp_practice.init.jsp_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");

        System.out.println("req.getScheme() : " + req.getScheme());
        System.out.println("req.getServerName() : " + req.getServerName());
        System.out.println("req.getRemoteAddr() : " + req.getRemoteAddr());

        PrintWriter out = resp.getWriter();
        out.println("<h1>좋은 하루!</h1>");
        out.close();
    }
}
