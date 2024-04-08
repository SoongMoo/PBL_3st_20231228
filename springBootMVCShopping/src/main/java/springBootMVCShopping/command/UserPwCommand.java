package springBootMVCShopping.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserPwCommand {
	String oldPw;
	String newPw;
}