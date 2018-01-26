/**
 * 
 */
package com.example.demoSpring.service;

import com.example.demoSpring.dto.UserDTO;

/**
 * @author joel.noumia
 *
 */
public interface UserService {

	UserDTO getUser(String username);

	void delete(long id);

	void addUser(UserDTO u);

	void updateUser(UserDTO u);

}
