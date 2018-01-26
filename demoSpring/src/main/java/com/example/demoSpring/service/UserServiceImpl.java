/**
 * 
 */
package com.example.demoSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSpring.dto.UserDTO;
import com.example.demoSpring.repository.UserRepository;

/**
 * @author joel.noumia
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepos;

	@Override
	public UserDTO getUser(String username) {
		return userRepos.findByUsername(username).convertTODto();
	}

	@Override
	public void delete(long id) {
		userRepos.delete(id);
	}

	@Override
	public void addUser(UserDTO u) {
		userRepos.save(u.convertToEntity());
	}

	@Override
	public void updateUser(UserDTO u) {
		userRepos.save(u.convertToEntity());
	}

}
