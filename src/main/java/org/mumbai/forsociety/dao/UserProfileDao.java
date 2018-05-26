package org.mumbai.forsociety.dao;

import java.util.List;

import org.mumbai.forsociety.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
