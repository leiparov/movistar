/**
 * 
 */
package com.movistar.springjsfjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movistar.springjsfjpa.entities.User;

/**
 * @author Siva
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

}
