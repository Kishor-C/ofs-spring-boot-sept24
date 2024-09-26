package com.ofs.my_first_app.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ofs.my_first_app.beans.Profile;
/*
 * Writing @Repository on top of the class makes spring container to create its instance
 * and inject that instance to its dependency when @Autowired is used
 */
@Repository
public class ProfileDAOListImpl implements ProfileDAO {

	// static list to maintain the data
	private static List<Profile> tempDB = new ArrayList<>();
	
	/*
	 * save method accepts Profile object from the client i.e., Service & either saves/updates
	 * in the DB or Collection
	 */
	@Override
	public Profile save(Profile profile) {
		// right now we will only store the profile object into the ArrayList
		tempDB.add(profile);
		return profile;
	}

	/*
	 * findAll method must return all the profiles present in the DB/tempDB
	 */
	@Override
	public List<Profile> findAll() {
		return tempDB;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Profile findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
