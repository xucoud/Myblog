package com.xwj.blog.queryvo;

import lombok.Data;

import java.util.Date;

/**
 * @author : xwj
 * @date :
 * @description: 博客详情页实体类
 **/
@Data
public class DetailedBlog {

    //博客信息
    private Long id;
    private String firstPicture;
    private String flag;
    private String title;
    private String content;
    private Integer views;
    private Integer commentCount;
    private Date updateTime;
    private boolean commentabled;
    private boolean shareStatement;
    private boolean appreciation;
    private String nickname;
    private String avatar;

    //分类名称
    private String typeName;

}
