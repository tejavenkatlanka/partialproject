package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.dao.FacilitiesDao;
import org.mumbai.forsociety.entity.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("facilitiesService")
@Transactional
public class FacilitiesServiceImpl implements FacilitiesService {

	@Autowired
	FacilitiesDao dao;

	@Override
	public void saveFacilities(Facilities facilities) {
		dao.save(facilities);
	}

	@Override
	public void updateFacilities(Facilities facilities) {
		dao.updateFacilitie(facilities);
	}

	@Override
	public void deleteFacilities(String id) {
		if (id != null && !id.isEmpty()) {
			Long idLong = Long.valueOf(id);
			dao.deleteById(idLong);
		}

	}

	@Override
	public List<Facilities> findAllFacilities() {
		return dao.findAllFacilities();
	}

	@Override
	public Facilities findById(String id) {
		Facilities facilities = null;
		if (id != null && !id.isEmpty()) {
			Long idLong = Long.valueOf(id);
			facilities = dao.findById(idLong);

		}
		return facilities;
	}

	@Override
	public List<Facilities> getFacilities(int pageNo, int pagesize) {
		return dao.getFacilities(pageNo, pagesize);
	}

}
