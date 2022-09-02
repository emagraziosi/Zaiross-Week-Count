package com.borgo.weeks.DTO;

import java.util.List;

public class MessageList {

	private int total_results;
	private List<List<Message>> messages;
	
	public int getTotal_results() {
		return total_results;
	}
	public void setTotal_results(int total_results) {
		this.total_results = total_results;
	}
	public List<List<Message>> getMessages() {
		return messages;
	}
	public void setMessages(List<List<Message>> messages) {
		this.messages = messages;
	}
	public MessageList(int total_results, List<List<Message>> messages) {
		super();
		this.total_results = total_results;
		this.messages = messages;
	}
	public MessageList() {
		super();
	}
}
