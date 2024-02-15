package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Board2FrontController extends HttpServlet implements Servlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/boardWrite.nhn")) {
			/// 웹브라우저로부터 전송된 값을 디비에 저장
			BoardWriteService action = new BoardWriteService();
			action.execute(req);
			resp.sendRedirect("boardList.naver");
		}
	}
}
