package com.cyq.article.service.impl;

import com.cyq.article.ArticleApplication;
import com.cyq.article.service.HotArticleService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ArticleApplication.class)
@RunWith(SpringRunner.class)
class HotArticleServiceImplTest {

    @Autowired
    private HotArticleService hotArticleService;

    @Test
    void computeHotArticle() {
        hotArticleService.computeHotArticle();
    }
}