package com.mka.caching.caching;

import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	
	public void fetchArticle(Integer articaleID) {
		System.out.println("fetching Article: "+ articaleID);
	}
	public void updateArticle(Article articale) {
		System.out.println("Updated  Article: "+ articale);
	}
	public void deleteArticle(Integer articaleID) {
		System.out.println("Deleted  Article: "+ articaleID);
	}
	

}
