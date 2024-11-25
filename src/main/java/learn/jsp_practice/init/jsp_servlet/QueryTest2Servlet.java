package learn.jsp_practice.init.jsp_servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryTest2")
public class QueryTest2Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 응답 콘텐츠 타입 설정
        resp.setContentType("text/html;charset=UTF-8");

        // PrintWriter 객체 생성
        PrintWriter out = resp.getWriter();

        // HTML 출력 시작
        out.print("<html><head><title>Query 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>POST 방식 질의 문자열 추출</h1>");

        // 요청 본문 읽기
        ServletInputStream input = req.getInputStream(); // 요청정보의 몸체와 서블릿 프로그램 간에 연결된 입력스트림을 생성하여 반환
        int len = req.getContentLength();   // 요청정보의 몸체에 담겨있는 문자열의 길이를 반환
        if (len > 0) {
            byte[] buf = new byte[len]; // 바이트 배열을 메모리에 생성, 이때 생성하는 배열의 개수는 len 변수의 값 만큼
                                        // 요청정보 몸체 의 길이만큼 byte 배열을 생성한 다음 배열의 시작 주솟값을 buf 변수에 저장
            input.read(buf, 0, len);    //  input 입력스트림으로부터 줄 단위로 데이터를 읽어 들이기
                                            //  첫 번째 인자는 한 줄 읽어 들인 문자열을 저장할 바이트 배열을 지정. 두 번째 인자는 저장소(바이트 배열)에 저장할 시작 위치를 의미. 세 번째 인자는 저장할 문자열의 길이

            String s = new String(buf, "UTF-8"); //  buf 배열의 데이터를 String 타입의 데이터로 새로 생성, 새로 생성한 String의 시작주소를 String 타입의 변수 s에 저장
            out.print("전체 문자열 : " + s);
        } else {
            out.print("요청 본문이 비어 있습니다.");
        }

        // HTML 출력 종료
        out.println("</body></html>");
        out.close();
    }
}
