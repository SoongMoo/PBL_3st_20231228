package springBootMVCShopping.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.PurchaseDTO;
import springBootMVCShopping.repository.PurchaseRepository;

@Service
public class PaymentDeleteService {
	@Autowired
	PurchaseRepository purchaseRepository;
	public void execute(String purchaseNum) {
		int i =purchaseRepository.paymentDelete(purchaseNum);
		if(i >= 1) {
			PurchaseDTO dto = new PurchaseDTO();
			dto.setPurchaseStatus("입금대기중");
			dto.setPurchaseNum(purchaseNum);
			purchaseRepository.purchaseStatusUpdate(dto);
		}
	}
}
