package com.mszlu.blog.vo;

import lombok.Data;

import java.util.List;

@Data
public class ArticleVo {
    private Long id; // 文章id
    private String title; // 标题
    private String summary; // 简介
    private int commentCounts; // 评论数量
    private int viewCounts; // 浏览量
    private int weight; // 置顶情况
    private String createDate; // 创建时间
    private UserVo author; // 作者
    private ArticleBodyVo body; //内容
    private CategoryVo category; // 文章类别
    private List<TagVo> tags; // 标签
}
