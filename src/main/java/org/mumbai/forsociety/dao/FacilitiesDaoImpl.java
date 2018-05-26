package org.mumbai.forsociety.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.mumbai.forsociety.entity.Event;
import org.mumbai.forsociety.entity.Facilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("facilitiesDao")
public class FacilitiesDaoImpl extends AbstractDao<Long, Facilities> implements FacilitiesDao {

	static final Logger logger = LoggerFactory.getLogger(FacilitiesDaoImpl.class);

	public Facilities findById(Long id) {
		Facilities facilities = getByKey(id);
		return facilities;
	}

	@Override
	public void save(Facilities facilities) {
		persist(facilities);
	}

	@Override
	public void updateFacilitie(Facilities facilities) {
		update(facilities);
	}

	@Override
	public List<Facilities> findAllFacilities() {
		Criteria criteria = createEntityCriteria();// .addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Facilities> facilities = (List<Facilities>) criteria.list();
		return facilities;
	}

	@Override
	public List<Facilities> getFacilities(int pageNo, int pagesize) {
		Criteria criteria = createEntityCriteria();
		criteria.addOrder(Order.desc("event_id"));
		criteria.setFirstResult(0);
		criteria.setMaxResults(pagesize);
		List<Facilities> currentPage = (List<Facilities>) criteria.list();
		return currentPage;
	}

	public void deleteById(Long id) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("ssoId", id));
		Facilities facilities = (Facilities) crit.uniqueResult();
		delete(facilities);
	}
}