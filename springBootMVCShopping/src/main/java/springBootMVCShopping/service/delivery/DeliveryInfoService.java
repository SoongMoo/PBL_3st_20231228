package springBootMVCShopping.service.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.DeliveryDTO;
import springBootMVCShopping.repository.DeliveryRepository;

@Service
public class DeliveryInfoService {
	@Autowired
	DeliveryRepository deliveryRepository;
	public void execute(String purchaseNum,Model model) {
		DeliveryDTO dto = deliveryRepository.deliverySelectOne(purchaseNum);
		if(dto != null ) {
			String deliveryNum = dto.getDeliveryNum();
			model.addAttribute("deliveryNum", deliveryNum);
		}
	}
}
