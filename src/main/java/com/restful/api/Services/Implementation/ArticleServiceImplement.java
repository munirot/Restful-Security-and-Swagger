package com.restful.api.Services.Implementation;

import com.restful.api.Models.Article;
import com.restful.api.Repositories.ArticleRepository;
import com.restful.api.Services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImplement implements ArticleService {

    //inject bean to Controller
    ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImplement(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public void create(Article article) {
        articleRepository.create(article);
    }

    @Override
    public void delete(int id) {
        articleRepository.delete(id);
    }

    @Override
    public void update(int id, Article article) {
        articleRepository.update(id, article);
    }
}
