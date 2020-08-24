package com.xwj.blog.entity;

import lombok.Data;

/**
 * @author : xwj
 * @date :
 * @description: 相册实体类
 **/

@Data
public class Picture {

    private Long id;
    private String picturename;
    private String picturetime;
    private String pictureaddress;
    private String picturedescription;

}
