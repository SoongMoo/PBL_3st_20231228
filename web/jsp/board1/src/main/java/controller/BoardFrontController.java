package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardFrontController extends HttpServlet implements Servlet{
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI(); //  /board/boardList.naver
		String contextPath = request.getContextPath();// /board
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/boardList.naver")) {
			BoardListService action = new BoardListService();
			action.execute(request);
			 RequestDispatcher dispatcher =
					 request.getRequestDispatcher("/board/boardList.jsp");
			 dispatcher.forward(request, response);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doPost(req, resp);
	}
}
