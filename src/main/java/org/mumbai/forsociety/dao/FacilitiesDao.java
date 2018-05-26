package org.mumbai.forsociety.dao;

import java.util.List;

import org.mumbai.forsociety.entity.Facilities;

public interface FacilitiesDao {

	Facilities findById(Long id);

	void save(Facilities facilities);

	void deleteById(Long id);

	void updateFacilitie(Facilities facilities);

	List<Facilities> findAllFacilities();

	List<Facilities> getFacilities(int pageNo, int pagesize);

}
