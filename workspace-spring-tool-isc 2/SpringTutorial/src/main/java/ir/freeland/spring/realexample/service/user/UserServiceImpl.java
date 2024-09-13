package ir.freeland.spring.realexample.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ir.freeland.spring.realexample.service.message.MessageService;

@Service
public class UserServiceImpl implements UserService{

	
	//@Autowired
	private MessageService messageService;
	
	/*@Autowired
	public UserServiceImpl(MessageService messageService) {
		super();
		this.messageService = messageService;
	}*/

	@Autowired
	@Qualifier("TwitterService")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
	}
}
