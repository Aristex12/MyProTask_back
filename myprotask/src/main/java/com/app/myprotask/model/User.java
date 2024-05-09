package com.app.myprotask.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long idUser;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "last_name", nullable = false, length = 200)
	private String lastName;

	@Column(name = "das", unique = true)
	@Pattern(regexp = "[MPT]\\d{6}", message = "El DAS debe seguir el patrón [MPT] seguido de 6 números.")
	private String das;

	@Column(name = "email", unique = true)
	@Pattern(regexp = "[a-zA-Z]+\\.[a-zA-Z]+@mpt\\.com", message = "El correo electrónico debe seguir el patrón [nombre].[apellido]@mpt.com")
	private String email;

	@Column(name = "password", length = 8)
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9]).{8,}$", message = "La contraseña debe contener una mayúscula, un carácter especial, un número y tener una longitud mínima de 8 caracteres.")
	private String password;

	@Column(name = "profile_pic")
	@Pattern(regexp = ".+\\.(png|jpg|jpeg)$", message = "El archivo debe ser de formato PNG, JPG o JPEG.")
	private String profilePic;

	@Column(name = "cv")
	@Pattern(regexp = ".+\\.pdf$", message = "El archivo debe ser de formato PDF.")
	private String cv;

	@Column(name = "is_admin")
	private boolean isAdmin;

	@ManyToMany
	@JoinTable(name = "history_projects", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
	private List<Project> historyProjects;

	@ManyToMany
	@JoinTable(name = "history_tasks", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "task_id"))
	private List<Task> historyTasks;

	@ManyToMany
	@JoinTable(name = "user_caracteristics", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "caracteristic_id"))
	private List<Caracteristic> userCaracteristics;

	public User() {
	}

	public User(String name, String lastName,
			@Pattern(regexp = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9]).{8,}$", message = "La contraseña debe contener una mayúscula, un carácter especial, un número y tener una longitud mínima de 8 caracteres.") String password,
			@Pattern(regexp = ".+\\.(png|jpg|jpeg)$", message = "El archivo debe ser de formato PNG, JPG o JPEG.") String profilePic,
			@Pattern(regexp = ".+\\.pdf$", message = "El archivo debe ser de formato PDF.") String cv,
			List<Project> historyProjects, List<Task> historyTasks, List<Caracteristic> userCaracteristics) {
		this.name = name;
		this.lastName = lastName;

		this.das = "";
		this.email = name + "." + lastName + "@mpt.com";

		this.password = password;
		this.profilePic = profilePic;
		this.cv = cv;
		this.historyProjects = historyProjects;
		this.historyTasks = historyTasks;
		this.userCaracteristics = userCaracteristics;
	}

	private void splitLastName() {
		//sapellidos[] = lastName.split(" ");
	}

}
