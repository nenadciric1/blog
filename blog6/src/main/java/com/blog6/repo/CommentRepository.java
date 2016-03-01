package com.blog6.repo;


import java.util.Collection;

import com.blog6.domain.CommentBlog;



public interface CommentRepository  {
    Collection<CommentBlog> findByAccountUsername(String username);
}