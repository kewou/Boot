/**
 * 
 */
package com.example.demoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demoSpring.model.Users;

/**
 * @author joel.noumia
 *
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	@Query("SELECT u from Users u where u.username = ?1")
	Users findByUsername(String username);

}
