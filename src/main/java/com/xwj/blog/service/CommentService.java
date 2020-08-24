package com.xwj.blog.service;

import com.xwj.blog.entity.Comment;

import java.util.List;

/**
 * @author : xwj
 * @date :
 * @description: 评论业务层接口
 **/

public interface CommentService {

    //根据博客id查询评论信息
    List<Comment> listCommentByBlogId(Long blogId);

    //添加保存评论
    int saveComment(Comment comment);

    //删除评论
    void deleteComment(Comment comment,Long id);

}
