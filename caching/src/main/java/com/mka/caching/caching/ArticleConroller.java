package com.mka.caching.caching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/article")
public class ArticleConroller {
	@Autowired
	ArticleService articleService;
	
	@GetMapping("{id}")
	public void fetchArticle(@PathVariable("id") Integer  articleID) {
		articleService.fetchArticle(articleID);
	}
	
	@PutMapping
	public void updateArticle(@RequestBody Article article) {
		articleService.updateArticle(article);
	}
	
	@DeleteMapping("{id}")
	public void deleteArticle(@PathVariable("id") Integer  articleID) {
		articleService.deleteArticle(articleID);
	}
}
