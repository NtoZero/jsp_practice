package learn.jsp_practice.init.jsp_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out =  resp.getWriter();
        out.print("<html>");
        out.print("<head><title>Request  정보 출력  Servlet</title></head>");
        out.print("<body>");
        out.print("<h3>네트워크 관련  요청  정보</h3>");
        out.print("Request Scheme   :   "  +  req.getScheme() +  "<br/>");
        out.print("Server Name   :    "  +  req.getServerName()  +  "<br/>");
        out.print("Server Address  :   "  + req.getLocalAddr()  +  "<br/>");
        out.print("Server Port  :    "  + req.getServerPort() +  "<br/>");
        out.print("Client Address  :   "  + req.getRemoteAddr() +  "<br/>");
        out.print("Client Host  :    "  +  req.getRemoteHost() +  "<br/>");
        out.print("Client Port  :    "  + req.getRemotePort() +  "<br/>");
        out.print ("</body></html>");
        out.close();
    }
}
