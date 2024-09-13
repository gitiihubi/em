package ir.freeland.spring.realexample.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ir.freeland.spring.realexample.service.message.MessageService;

@Component
public class ConstructorBasedInjection {

	private MessageService messageService;
	
	public ConstructorBasedInjection(@Qualifier("TwitterService")MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
	}
}
