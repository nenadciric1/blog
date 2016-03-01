package com.blog6.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.blog6.domain.PostBlog;

public class BlogPostRepositoryImp implements BlogPostRepository {
	
	private EntityManager em;

	public List<PostBlog> findByUsername() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PostBlog> criteria = cb.createQuery(PostBlog.class);
        Root<PostBlog> postblog = criteria.from(PostBlog.class);

        /*
         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
         */

        criteria.select(postblog).orderBy(cb.asc(postblog.get("username")));
        return em.createQuery(criteria).getResultList();
	
	}

}
