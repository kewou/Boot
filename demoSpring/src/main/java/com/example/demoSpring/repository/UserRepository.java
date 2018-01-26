/**
 * 
 */
package com.example.demoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demoSpring.model.User;

/**
 * @author joel.noumia
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u from User u where u.username = ?1")
	User findByUsername(String username);

}
