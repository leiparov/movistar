/**
 * 
 */
package com.movistar.springjsfjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movistar.springjsfjpa.entities.User;
import com.movistar.springjsfjpa.repositories.UserRepository;

@Service
@Transactional
public class UserService 
{
	@Autowired private UserRepository userRepository;
	
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
}
