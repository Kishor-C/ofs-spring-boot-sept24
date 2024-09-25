package com.ofs.my_first_app.controller;

public class Profile {
	private int profileId;
	private String name;
	private long phone;
	
	/* Generate setters & getters by Right Click -> Source -> Generate Setters & Getters -> Select all properties */
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
}
