package com.xwj.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author : xwj
 * @date :
 * @description: 友链实体类
 **/

@Data
public class FriendLink {

    private Long id;
    private String blogname;
    private String blogaddress;
    private String pictureaddress;
    private Date createTime;

}
