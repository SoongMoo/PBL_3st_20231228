package controller.item;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.dao.ItemDAO;
import model.dao.MemberDAO;
import model.dto.AuthInfoDTO;
import model.dto.CartDTO;

public class CartInsertService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String goodsNum = request.getParameter("goodsNum");
		String cartQty = request.getParameter("cartQty");
		
		HttpSession session = request.getSession();
		AuthInfoDTO  auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDAO memDao = new MemberDAO();
		String memberNum = memDao.memberNumSelect(auth.getUserId());
		
		CartDTO dto = new CartDTO();
		dto.setGoodsNum(goodsNum);
		dto.setCartQty(Integer.parseInt(cartQty));
		dto.setMemberNum(memberNum);
		
		ItemDAO dao = new ItemDAO();
		dao.cartInsert(dto);		
	}
}
