package com.xwj.blog.queryvo;

import com.xwj.blog.entity.Type;
import lombok.Data;

import java.util.Date;

/**
 * @author : xwj
 * @date :
 * @description:
 **/

@Data
public class BlogQuery {

    private Long id;
    private String title;
    private Date updateTime;
    private Boolean recommend;
    private Boolean published;
    private Long typeId;
    private Type type;

}
