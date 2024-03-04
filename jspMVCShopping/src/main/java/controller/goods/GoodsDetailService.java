package controller.goods;

import javax.servlet.http.HttpServletRequest;

import model.dao.GoodsDAO;
import model.dto.GoodsDTO;

public class GoodsDetailService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		GoodsDAO dao = new GoodsDAO();
		GoodsDTO dto = dao.goodsSelectOne(goodsNum);
		
		request.setAttribute("dto", dto);
		request.setAttribute("newLine", "\n");
	}
}
