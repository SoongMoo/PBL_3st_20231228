package springBootMVCShopping.command;

import lombok.Data;

@Data
public class UserPwCommand {
	String oldPw;
	String newPw;
}
