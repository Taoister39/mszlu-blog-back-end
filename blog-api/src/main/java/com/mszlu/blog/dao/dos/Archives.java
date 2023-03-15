package com.mszlu.blog.dao.dos;

import lombok.Data;

// 本层次是存不需要持久层，并不是数据库的数据，而是通过现有的数据筛选
@Data
public class Archives {
    private Integer year;
    private Integer month;
    private Integer count;
}
