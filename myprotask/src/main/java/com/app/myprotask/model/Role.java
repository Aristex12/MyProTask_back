package com.app.myprotask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Contains the different roles of the users
 * 
 * @author Manuel
 */
@Entity
@Table(name = "roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role")
	private Long idRole;

	@Column(name = "name", length = 100, unique = true)
	private String name;

	public Role(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdRole() {
		return idRole;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", name=" + name + "]";
	}

}
