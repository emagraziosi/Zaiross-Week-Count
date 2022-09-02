package com.borgo.weeks.DTO;

public class Author {

	private String id;
	private String username;
	private String avatar;
	private String avatar_decoration;
	private String discriminator;
	private int public_flags;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar_decoration() {
		return avatar_decoration;
	}
	public void setAvatar_decoration(String avatar_decoration) {
		this.avatar_decoration = avatar_decoration;
	}
	public String getDiscriminator() {
		return discriminator;
	}
	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}
	public int getPublic_flags() {
		return public_flags;
	}
	public void setPublic_flags(int public_flags) {
		this.public_flags = public_flags;
	}
	public Author(String id, String username, String avatar, String avatar_decoration, String discriminator,
			int public_flags) {
		super();
		this.id = id;
		this.username = username;
		this.avatar = avatar;
		this.avatar_decoration = avatar_decoration;
		this.discriminator = discriminator;
		this.public_flags = public_flags;
	}
	public Author() {
		super();
	}
}
