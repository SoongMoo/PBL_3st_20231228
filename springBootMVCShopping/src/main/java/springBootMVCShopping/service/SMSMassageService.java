package springBootMVCShopping.service;

import org.springframework.stereotype.Service;

import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;


@Service
public class SMSMassageService {
	final DefaultMessageService messageService;	
	// SMS
	public SMSMassageService() {
		String api_key = "NCSS1WJQZAXJTOU3";
		String api_secret = "WN5E66CV7FMOEVUA52T0H0UQUZU0VQOY";
		this.messageService = NurigoApp.INSTANCE.initialize(api_key, api_secret, "https://api.coolsms.co.kr");
	}
	public void smsSend(String _from,  String _to, String _content) {
		Message message = new Message();
        // 발신번호 및 수신번호는 반드시 01012345678 형태로 입력되어야 합니다.
        message.setFrom(_from);
        message.setTo(_to);
        message.setText(_content);
        SingleMessageSentResponse response = this.messageService.sendOne(new SingleMessageSendingRequest(message));
        System.out.println(response);	
	}
}
