package com.restful.api.Controllers;

import com.restful.api.Models.Article;
import com.restful.api.Services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    ArticleService articleService;
    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("")
    public ResponseEntity<List<Article>> findAll(){
        return new ResponseEntity<>(articleService.findAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<String> addNew(@RequestBody Article article){
        articleService.create(article);
        return new ResponseEntity<>("Added", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody Article article){
        articleService.update(id, article);
        return new ResponseEntity<>("Update", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        articleService.delete(id);
        return new ResponseEntity<>("Delete success", HttpStatus.OK);
    }
}
