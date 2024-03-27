package springBootMVCShopping.command;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

//command의 멤버 필드는 html의 input의 이름과 같게 만들어줍니다.
// 유효성 검사를 하기 위해 validated을 부여합니다. 
@Data // lombok을 이용해setter/getter를 가지고 옵니다.
public class GoodsCommand {
	String goodsNum;
	@NotEmpty(message = "이름을 입력해주세요")
	String goodsName;
	@NotNull(message = "가격을 입력해주세요.")
	Integer goodsPrice;
	@NotNull(message = "배송비를 입력해주세요.")
	Integer deliveryCost;
	@NotEmpty(message = "설명을 입력해주세요")
	String goodsContent;
	String empNum;
	Date goodsRegist;
	String updateEmpNum;
	Date goodsUpdateDate;
	//파일을 받을 객체를 추가합니다.
	MultipartFile goodsMainStore;
	MultipartFile goodsImages[];
}






