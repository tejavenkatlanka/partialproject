package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
