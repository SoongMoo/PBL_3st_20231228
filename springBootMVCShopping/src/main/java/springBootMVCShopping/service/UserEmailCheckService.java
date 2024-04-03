package springBootMVCShopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.mapper.MemberMapper;

@Service
public class UserEmailCheckService {
	@Autowired
	MemberMapper memberMapper;
	public int execute(String chk) {
		int i = memberMapper.userCkeckUpdate(chk);
		return i;
	}
}
