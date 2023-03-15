package com.mszlu.blog.dao.pojo;

import lombok.Data;

@Data
public class Tag {
    private Long id; // 标签id
    private String avatar; // 标签logo
    private String tagName; // 标签名
}
