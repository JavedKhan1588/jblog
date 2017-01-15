package com.espire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espire.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>  {

}
