package springBootMVCShopping.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.mapper.AutoNumMapper;

@Service
public class MemberAutoNumService {
	@Autowired
	AutoNumMapper autoNumMapper;
	public void execute(Model model) {
		String memberNum = autoNumMapper.autoNumSelectOne("members","member_num", "mem");
		MemberCommand memberCommand = new MemberCommand();
		memberCommand.setMemberNum(memberNum);
		model.addAttribute("memberCommand", memberCommand);
	}
}
