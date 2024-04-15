package springBootMVCShopping.service.purchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.OrderListDTO;
import springBootMVCShopping.repository.PurchaseRepository;
@Service
public class PurchaseListService {
	@Autowired
	PurchaseRepository purchaseRepository;
	public void execute(Model model) {
		List<OrderListDTO> list = purchaseRepository.orderList(null);
		model.addAttribute("list", list);
	}
}
