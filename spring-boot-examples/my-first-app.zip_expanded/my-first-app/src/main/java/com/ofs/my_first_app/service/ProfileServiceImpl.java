package com.ofs.my_first_app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofs.my_first_app.beans.Profile;
import com.ofs.my_first_app.dao.ProfileDAO;

/*
 * @Service allows spring container to create the object of the class and 
 * supply the object to their dependencies
 */
@Service
public class ProfileServiceImpl implements ProfileService {

	/*
	 * Auto-wire ProfileDAO interface to invoke the methods of its implementation
	 */
	
	@Autowired
	private ProfileDAO profileDao;
	
	@Override
	public Profile storeProfile(Profile profile) {
		return profileDao.save(profile);
	}

	@Override
	public List<Profile> fetchProfiles() {
		return profileDao.findAll();
	}
	
	@Override
	public Profile updatePhoneById(int id, long phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile updateDobById(int id, LocalDate dob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile fetchProfileById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteProfileById(int id) {
		// TODO Auto-generated method stub

	}

}
