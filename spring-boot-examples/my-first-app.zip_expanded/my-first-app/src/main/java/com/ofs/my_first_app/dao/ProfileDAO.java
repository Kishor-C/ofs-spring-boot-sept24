package com.ofs.my_first_app.dao;

import java.util.List;

import com.ofs.my_first_app.beans.Profile;

public interface ProfileDAO {
	public Profile save(Profile profile); // saves/updates object
	public List<Profile> findAll(); // returns all the profile object
	public void deleteById(int id); // returns profile based on id
	public Profile findById(int id); // returns profile based on id
}
