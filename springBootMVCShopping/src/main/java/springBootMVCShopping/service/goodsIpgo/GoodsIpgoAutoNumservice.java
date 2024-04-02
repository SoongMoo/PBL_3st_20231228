package springBootMVCShopping.service.goodsIpgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.mapper.AutoNumMapper;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsIpgoAutoNumservice {
	@Autowired
	AutoNumMapper autoNumMapper;
	public void execute(Model model) {
		String num = autoNumMapper.autoNumSelectOne("goodsipgo", "ipgo_num", "ip_");
		model.addAttribute("ipgoNum", num);
	}
}
