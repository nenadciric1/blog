package com.blog6.repo;

import java.util.List;

import com.blog6.domain.PostBlog;


public interface BlogPostRepository  {
    public List<PostBlog> findByUsername();
}