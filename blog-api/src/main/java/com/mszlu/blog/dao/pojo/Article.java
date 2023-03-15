package com.mszlu.blog.dao.pojo;

import lombok.Data;

// 自动包含getter、setter、构造函数
@Data
public class Article {
    public static final int Article_TOP = 1;
    public static final int Article_Common = 0;
    private Long id; // 文章id
    private String title; // 标题
    private String summary; // 简介
    private int commentCounts; // 评论数量
    private int viewCounts; // 浏览量
    private Long authorId; // 作者id
    private Long bodyId; // 内容id
    private Long categoryId; // 文章类别id
    private int weight = Article_Common; // 置顶情况
    private Long createDate; // 创建时间
}
