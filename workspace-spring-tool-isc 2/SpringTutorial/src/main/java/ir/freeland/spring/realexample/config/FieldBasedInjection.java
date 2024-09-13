package ir.freeland.spring.realexample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ir.freeland.spring.realexample.service.message.MessageService;


@Component
public class FieldBasedInjection {
	
	    @Autowired
	    @Qualifier("TwitterService")
		private MessageService messageService;

		public void processMsg(String message) {
			messageService.sendMsg(message);
		}
}
