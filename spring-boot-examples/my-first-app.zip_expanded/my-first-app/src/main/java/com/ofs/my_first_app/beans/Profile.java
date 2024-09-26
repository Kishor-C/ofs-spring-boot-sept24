package com.ofs.my_first_app.beans;

import java.time.LocalDate;

public class Profile {
	private int profileId;
	private String name;
	private long phone;
	private LocalDate dob; 
	
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
}
