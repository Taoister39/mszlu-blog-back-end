package com.mszlu.blog.dao.pojo;

import lombok.Data;

@Data
public class ArticleBody {
    private Long id;
    private String content; // 文章说明
    private String contentHtml; // 文章主体
    private Long articleId; // 文章id
}
