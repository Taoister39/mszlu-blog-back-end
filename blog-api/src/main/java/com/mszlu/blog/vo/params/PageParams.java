package com.mszlu.blog.vo.params;

import lombok.Data;

@Data
public class PageParams {
    // 默认值
    private int page = 1;
    private int pageSize = 10;

    private Long categoryId;
    private Long tagId;
    private String year;
    private String month;
}
