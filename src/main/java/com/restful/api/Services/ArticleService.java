package com.restful.api.Services;

import com.restful.api.Models.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();

    void create(Article article);
    void delete(int id);
    void update(int id, Article article);
}
