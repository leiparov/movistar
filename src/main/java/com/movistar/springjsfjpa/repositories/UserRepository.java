/**
 * 
 */
package com.movistar.springjsfjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movistar.springjsfjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
