package com.mszlu.blog.service;

import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.TagVo;

import java.util.List;

public interface TagService {
    /**
     * 通过文章id查找标签
     *
     * @param articleId
     * @return
     */
    List<TagVo> findTagsByArticleId(Long articleId);

    /**
     * 热度
     *
     * @param limit
     * @return
     */
    Result hots(int limit);

    /**
     * 查询所有的文章标签
     *
     * @return
     */
    Result finAll();

    /**
     * 查看所有详情
     *
     * @return
     */
    Result findAllDetail();

    /**
     * 通过id查询详情
     *
     * @return
     */
    Result findDetailById();
}
