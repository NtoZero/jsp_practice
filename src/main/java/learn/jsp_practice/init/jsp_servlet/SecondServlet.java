package learn.jsp_practice.init.jsp_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        System.out.println("SecondServlet doGet!");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Test</title></head>");
        out.println("<body><h1>have a nice day!</h1></body");
        out.println("</html>");
        out.close();
    }
}
