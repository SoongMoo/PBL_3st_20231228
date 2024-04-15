package springBootMVCShopping.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.PurchaseDTO;
import springBootMVCShopping.repository.PurchaseRepository;

@Service
public class PurchaseStatusService {
	@Autowired
	PurchaseRepository purchaseRepository;
	public void execute(String purchaseNum) {
		PurchaseDTO dto = new PurchaseDTO();
		dto.setPurchaseStatus("상품준비중");
		dto.setPurchaseNum(purchaseNum);
		purchaseRepository.purchaseStatusUpdate(dto);
	}
}
