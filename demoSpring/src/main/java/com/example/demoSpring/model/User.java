package com.example.demoSpring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demoSpring.dto.UserDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Entity
@Table(name = "User")
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8470078682824959306L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username")
	private String username;

	@Column(name = "pass")
	private String pass;

	public UserDTO convertTODto() {
		UserDTO user = new UserDTO();
		user.setNomUtilisateur(this.username);
		return user;
	}

}
