package com.espire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espire.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>  {

}
