package com.espire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espire.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>  {

}