package org.mumbai.forsociety.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.mumbai.forsociety.entity.Event;
import org.mumbai.forsociety.entity.News;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("newsDao")
public class NewsDaoImpl extends AbstractDao<Long, News> implements NewsDao {

	static final Logger logger = LoggerFactory.getLogger(NewsDaoImpl.class);

	public News findById(Long id) {
		News news = getByKey(id);
		/*
		 * if(user!=null){ Hibernate.initialize(user.getUserProfiles()); }
		 */
		return news;
	}

	@Override
	public List<News> findAllNews() {
		Criteria criteria = createEntityCriteria();// .addOrder(0Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<News> events = (List<News>) criteria.list();
		return events;
	}

	public void save(News news) {
		persist(news);
	}

	public void deleteById(Long id) {
		Criteria crit = createEntityCriteria();
		// crit.add(Restrictions.eq("ssoId", id));
		News event = (News) crit.uniqueResult();
		delete(event);
	}

	@Override
	public void updateNews(News news) {
		update(news);

	}

	@Override
	public List<News> getNewss(int pageNo, int pagesize) {
		Criteria criteria = createEntityCriteria();
		criteria.addOrder(Order.desc("person_id"));
		criteria.setFirstResult(0);
		criteria.setMaxResults(pagesize);
		List<News> currentPage = criteria.list();
		return currentPage;
	}

}
