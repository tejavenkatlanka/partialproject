package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.entity.Facilities;

public interface FacilitiesService {

	Facilities findById(String id);

	void saveFacilities(Facilities facilities);

	void updateFacilities(Facilities facilities);

	void deleteFacilities(String id);

	List<Facilities> findAllFacilities();
	
	List<Facilities> getFacilities(int pageNo, int pagesize);


}