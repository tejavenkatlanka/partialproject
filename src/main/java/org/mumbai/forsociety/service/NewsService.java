package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.entity.News;


public interface NewsService {
	
	News findById(String id);
	
	void saveNews(News  news);
	
	void updateNews(News news);
	
	void deleteNews(String id);

	List<News> findAllNews(); 
	
	List<News> getNewss(int pageNo ,int pagesize);


}