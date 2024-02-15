package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Board1FrontController extends HttpServlet implements Servlet{
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/boardWrite.bd")) {
			RequestDispatcher dispatcher = 
					req.getRequestDispatcher("/board/boardForm.jsp");
			dispatcher.forward(req, resp);
		}else if(command.equals("/boardDetail.bd")) {
			BoardDetailService action = new BoardDetailService();
			action.execute(req);
			
			RequestDispatcher dispatcher = 
					req.getRequestDispatcher("/board/boardDetail.jsp");
			dispatcher.forward(req, resp);
		}else if(command.equals("/boardModify.bd")) {
			BoardDetailService action = new BoardDetailService();
			action.execute(req);
			
			RequestDispatcher dispatcher =
					req.getRequestDispatcher("/board/boardUpdate.jsp");
			dispatcher.forward(req, resp);
		}else if(command.equals("/boardDelete.bd")) {
			BoardDeleteService action = new BoardDeleteService();
			action.execute(req);
			resp.sendRedirect("boardList.naver");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/boardModify.bd")) {
			BoardUpdateService action = new BoardUpdateService();
			action.execute(req);
			resp.sendRedirect("boardDetail.bd?num="+req.getParameter("boardNum"));
		}
	}
}
