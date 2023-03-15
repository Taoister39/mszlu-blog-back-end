package com.mszlu.blog.dao.pojo;

import lombok.Data;

@Data
public class Category {
    private Long id;
    private String avatar;
    private String categoryName; // 分类名
    private String description;
}
