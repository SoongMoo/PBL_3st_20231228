package servletTest.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		//a, location.href, 
		// <a href="test.html"></a>
		// location.href = "test.html"
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=UTF-8");
		// 쿼리스트링 (http://localhost:8080/member?where=main	)
		String str = req.getParameter("where"); // next
		PrintWriter out = resp.getWriter();
		if(str.equals("main")) {
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset='UTF-8'>");
			out.print("<title>Insert title here</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("안녕하세요.. 오기영입니다.");
			out.print("<a href='member?where=next'>다음페이지로 이동</a>");
			out.print("</body>");
			out.print("</html>");
		}else if(str.equals("next")) {
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset='UTF-8'>");
			out.print("<title>Insert title here</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<a href='member?where=main'>이전페이지로 이동</a>");
			out.print("</body>");
			out.print("</html>");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		//<form method="post"></form> 
		super.doPost(req, resp);
	}
}


