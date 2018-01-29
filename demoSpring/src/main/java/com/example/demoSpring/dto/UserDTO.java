/**
 * 
 */
package com.example.demoSpring.dto;

import com.example.demoSpring.model.Users;

import lombok.Data;

/**
 * @author joel.noumia
 *
 */
@Data
public class UserDTO {

	private String nomUtilisateur;

	private String passwordUser;

	public Users convertToEntity() {
		Users user = new Users();
		user.setUsername(this.nomUtilisateur);
		user.setPass(this.passwordUser);
		return user;
	}

}
