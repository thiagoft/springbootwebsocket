package br.com.thiagoft.springbootwebsocket.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import br.com.thiagoft.springbootwebsocket.model.Message;

@Controller
public class MessageController {
	
	@MessageMapping("/send")
    @SendTo("/response")
    public Message processaMensagem(Message message) throws Exception {
        return new Message("says:"+message.getContent());
    }
	
}
