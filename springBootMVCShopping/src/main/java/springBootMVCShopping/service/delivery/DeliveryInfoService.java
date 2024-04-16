package springBootMVCShopping.service.delivery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.OrderListDTO;
import springBootMVCShopping.repository.PurchaseRepository;

@Service
public class DeliveryInfoService {
	@Autowired
	PurchaseRepository purchaseRepository;
	public void execute(String purchaseNum,Model model) {
		Map<String , String> map = new HashMap<String, String>();
		map.put("memberNum", null);
		map.put("purchaseNum",purchaseNum);
		List<OrderListDTO> list =  purchaseRepository.orderList(map);
		model.addAttribute("list", list);
	}
}