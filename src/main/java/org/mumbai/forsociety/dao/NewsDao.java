package org.mumbai.forsociety.dao;

import java.util.List;

import org.mumbai.forsociety.entity.Event;
import org.mumbai.forsociety.entity.News;


public interface NewsDao {

	News findById(Long id);
	
	void save(News news);
	
	void deleteById(Long id);

	void updateNews(News news);
	
	List<News> findAllNews();

	List<News> getNewss(int pageNo, int pagesize);

}

