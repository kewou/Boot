/**
 * 
 */
package com.example.demoSpring.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.dto.UserDTO;
import com.example.demoSpring.service.UserService;

/**
 * @author joel.noumia
 *
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public UserDTO lireUser(@PathVariable("username") String username) {
		return userService.getUser(username);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addEtudiant(@RequestBody UserDTO u) {
		this.userService.addUser(u);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void updateEtudiant(@RequestBody UserDTO u) {
		this.userService.updateUser(u);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteEtudiant(@PathVariable("id") long id) {
		userService.delete(id);
	}

}
