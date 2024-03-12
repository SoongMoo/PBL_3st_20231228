package controller.item;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

public class GoodsOrderService {
	public void execute(HttpServletRequest request) {
		try { //한글 깨짐 방지
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String purchaseName = request.getParameter("purchaseName");
		String totalPaymentPrice = request.getParameter("totalPaymentPrice");
		String deliveryName = request.getParameter("deliveryName");
		String deliveryAddr = request.getParameter("deliveryAddr");
		String deliveryAddrDetail = request.getParameter("deliveryAddrDetail");
		String deliveryPost = request.getParameter("deliveryPost");
		String deliveryPhone = request.getParameter("deliveryPhone");
		String message = request.getParameter("message");
		
		String goodsNums = request.getParameter("goodsNums");
	}
}
