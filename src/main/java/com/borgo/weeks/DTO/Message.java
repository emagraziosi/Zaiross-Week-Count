package com.borgo.weeks.DTO;

public class Message {

	private String id;
	private int type;
	private String content;
	private String channel_id;
	private Author author;
	private String timestamp;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Message(String id, int type, String content, String channel_id, Author author, String timestamp) {
		super();
		this.id = id;
		this.type = type;
		this.content = content;
		this.channel_id = channel_id;
		this.author = author;
		this.timestamp = timestamp;
	}
	public Message() {
		super();
	}
	
}
