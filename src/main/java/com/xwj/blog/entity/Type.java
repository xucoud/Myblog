package com.xwj.blog.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : xwj
 * @date :
 * @description: 分类实体类
 **/

@Data
public class Type {

    private Long id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();

}
