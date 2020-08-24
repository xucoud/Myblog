package com.xwj.blog.queryvo;

import lombok.Data;

import java.util.Date;

/**
 * @author : xwj
 * @date :
 * @description:
 **/
@Data
public class ShowBlog {

    private Long id;
    private String flag;
    private String title;
    private String content;
    private Long typeId;
    private String firstPicture;
    private String description;
    private boolean recommend;
    private boolean published;
    private boolean shareStatement;
    private boolean appreciation;
    private boolean commentabled;
    private Date updateTime;


}
