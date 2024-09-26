package com.ofs.my_first_app.service;

import java.time.LocalDate;
import java.util.List;

import com.ofs.my_first_app.beans.Profile;

public interface ProfileService {
	/*
	 * Methods that are implemented to call the CRUD methods of ProfileDAO
	 */
	public Profile storeProfile(Profile profile);
	public Profile updatePhoneById(int id, long phone);
	public Profile updateDobById(int id, LocalDate dob);
	public Profile fetchProfileById(int id);
	public List<Profile> fetchProfiles();
	public void deleteProfileById(int id);
}
