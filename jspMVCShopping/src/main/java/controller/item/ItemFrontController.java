package controller.item;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.goods.GoodsDetailService;
import controller.goods.GoodsVisitCountService;

public class ItemFrontController extends HttpServlet implements Servlet{
	public void doProcess(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/detailView.item")) {
			GoodsVisitCountService count = new GoodsVisitCountService();
			count.execute(request);
			GoodsDetailService action = new GoodsDetailService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("item/detailView.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/wishItem.item")) {
			GoodsWishItemService action  = new GoodsWishItemService();
			action.execute(request);
		}else if(command.equals("/wishList.item")) {
			WishListService action = new WishListService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("item/wishList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/wishDelete.item")) {
			WishDeleteService action = new WishDeleteService();
			action.execute(request);
			response.sendRedirect("wishList.item");			
		}else if(command.equals("/cart.item")) {
			CartInsertService action = new CartInsertService();
			action.execute(request);
		}else if(command.equals("/cartList.item")) {
			CartListService action = new CartListService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("item/cartList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/cartItemsDel.item")) {
			CartItemsDeleteService action = new CartItemsDeleteService();
			action.execute(request);
			response.sendRedirect("cartList.item");
		}else if(command.equals("/cartQtyDown.item")) {
			CartQtyDownService action = new CartQtyDownService();
			action.execute(request);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}
}