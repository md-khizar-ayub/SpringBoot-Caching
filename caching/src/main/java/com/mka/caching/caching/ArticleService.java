package com.mka.caching.caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	
	@Cacheable("articles")
	public void fetchArticle(Integer articaleID) {
		System.out.println("fetching Article: "+ articaleID);
	}
	@CachePut("articles")
	public void updateArticle(Article articale) {
		System.out.println("Updated  Article: "+ articale.getId());
	}
	@CacheEvict("articles")
	public void deleteArticle(Integer articaleID) {
		System.out.println("Deleted  Article: "+ articaleID);
	}
	

}
