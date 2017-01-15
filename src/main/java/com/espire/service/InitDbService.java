package com.espire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espire.repository.BlogRepository;
import com.espire.repository.ItemRepository;
import com.espire.repository.RoleRepository;
import com.espire.repository.UserRepository;

@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BlogRepository blogRepository;
	@Autowired
	private ItemRepository itemRepository;
}
