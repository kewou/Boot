/**
 * 
 */
package com.example.demoSpring.dto;

import com.example.demoSpring.model.User;

import lombok.Data;

/**
 * @author joel.noumia
 *
 */
@Data
public class UserDTO {

	private String nomUtilisateur;

	private String passwordUser;

	public User convertToEntity() {
		User user = new User();
		user.setUsername(this.nomUtilisateur);
		user.setPass(this.passwordUser);
		return user;
	}

}
