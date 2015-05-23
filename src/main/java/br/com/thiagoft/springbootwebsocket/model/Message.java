package br.com.thiagoft.springbootwebsocket.model;

public class Message {
	
	private String content;

	public String getContent() {
		return content;
	}
	
	public Message(String content) {
		this.content = content;
	}
	
	public Message() {}
}
