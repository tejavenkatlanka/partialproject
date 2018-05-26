package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.dao.NewsDao;
import org.mumbai.forsociety.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("newsService")
@Transactional
public class NewsServiceImpl implements NewsService {

	@Autowired
	NewsDao dao;

	@Override
	public News findById(String id) {

		return null;
	}

	@Override
	public void saveNews(News news) {
		dao.save(news);
	}

	@Override
	public void updateNews(News news) {
		dao.updateNews(news);
	}

	@Override
	public void deleteNews(String id) {
		if (id != null && !id.isEmpty()) {
			Long idLong = Long.valueOf(id);
			dao.deleteById(idLong);
		}

	}

	@Override
	public List<News> findAllNews() {
		return dao.findAllNews();
	}

	@Override
	public List<News> getNewss(int pageNo, int pagesize) {
		return dao.getNewss(pageNo, pagesize);
	}

}
