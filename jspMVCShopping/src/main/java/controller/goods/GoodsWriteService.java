package controller.goods;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.dao.EmployeeDAO;
import model.dao.GoodsDAO;
import model.dto.AuthInfoDTO;
import model.dto.GoodsDTO;

public class GoodsWriteService {
	public void execute(HttpServletRequest request) 
			throws UnsupportedEncodingException{
		request.setCharacterEncoding("utf-8");
		String goodsNum = request.getParameter("goodsNum");
		String goodsName = request.getParameter("goodsName");
		String goodsPrice = request.getParameter("goodsPrice");
		String goodscontent = request.getParameter("goodsContent");
		String deliveryCost = request.getParameter("deliveryCost");
		
		GoodsDTO dto = new GoodsDTO();
		dto.setDeliveryCost(Integer.parseInt(deliveryCost));
		dto.setGoodsContent(goodscontent);
		dto.setGoodsName(goodsName);
		dto.setGoodsNum(goodsNum);
		dto.setGoodsPrice(Integer.parseInt(deliveryCost));
		
		// empNum을 가져오기 위한 코드 시작
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		EmployeeDAO empDao = new EmployeeDAO();
		String empNum = empDao.getEmpNum(auth.getUserId());
		// empNum을 가져오기 위한 코드 끝
		dto.setEmpNum(empNum);		
		
		GoodsDAO dao = new GoodsDAO();		
		dao.goodsInsert(dto);
	}
}
