package com.restful.api.Repositories.Implementations;

import com.restful.api.Repositories.ArticleRepository;
import com.restful.api.Models.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepositoryImplement implements ArticleRepository {

    //create static array list
    List<Article> articles = new ArrayList<>();
    {
        articles.add(new Article(1, "To all the Boys", "to all the boys description", "Fiction"));
        articles.add(new Article(2, "Twilight", "twilight description", "Fiction"));
        articles.add(new Article(3, "Harry Potter", "Harry Potter and the Philosopher's Stone", "Fiction"));
    }

    @Override
    public List<Article> findAll() {
        return articles;
    }

    @Override
    public void create(Article article) {
        articles.add(article);
    }

    @Override
    public void delete(int id) {
        articles.remove(id - 1);
    }

    @Override
    public void update(int id, Article article) {
//        for(int i = 0; i< articles.size(); i++){
//            if (id == articles.get(i).getId()){
//                articles.get(i).setTitle(article.getTitle());
//                articles.get(i).setDescription(article.getDescription());
//                articles.get(i).setCategory(article.getCategory());
//            }
//        }

        for (Article obj_article : articles) {
            if (obj_article.getId() == id) {
                obj_article.setTitle(article.getTitle());
                obj_article.setDescription(article.getDescription());
                obj_article.setCategory(article.getCategory());

//                articles.get(i).setTitle(article.getTitle());
//                articles.get(i).setDescription(article.getDescription());
//                articles.get(i).setCategory(article.getCategory());
            }
        }
    }
}
