package com.xwj.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : xwj
 * @date :
 * @description: 音乐盒页面显示控制器
 **/

@Controller
public class MusicShowController {

    @GetMapping("/music")
    public String about() {
        return "music";
    }

}