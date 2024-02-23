package controller.members;

import javax.servlet.http.HttpServletRequest;

import model.dao.MemberDAO;
import model.dto.MemberDTO;

public class MemberDetailService {
	public void execute(HttpServletRequest request) {
		String memberNum = request.getParameter("memberNum");
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.memberSelectOne(memberNum);
		request.setAttribute("dto", dto);
	}
}
