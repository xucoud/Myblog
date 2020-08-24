package com.xwj.blog.queryvo;

import lombok.Data;

/**
 * @author : xwj
 * @date :
 * @description: 推荐博客数据实体类
 **/
@Data
public class RecommendBlog {

    private Long id;
    private String title;
    private String firstPicture;
    private boolean recommend;

}
