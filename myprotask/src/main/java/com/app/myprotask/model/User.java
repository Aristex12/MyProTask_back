package com.app.myprotask.model;

import java.util.List;

import jakarta.persistence.CascadeType;
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

/**
 * It contains a list of the projects they have participated in, another list of the tasks they have participated in,
 * and finally a list of all their personal characteristics.
 * These lists are connected to the Project, Task, and Characteristics entities.
 */
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

	@ManyToMany(cascade = CascadeType.ALL)
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
		this.das = "MPT" + generateNumberDAS();
		this.email = name + "." + splitLastName()[0] + "@mpt.com";
		this.password = password;
		this.profilePic = profilePic;
		this.cv = cv;
		this.isAdmin = false;
		this.historyProjects = historyProjects;
		this.historyTasks = historyTasks;
		this.userCaracteristics = userCaracteristics;
	}

	/**
	 * 
	 * @return a number composed by 6 random digits
	 */
	private int generateNumberDAS() {
		return (int) ((Math.random() * 900000) + 100000);
	}

	/**
	 * 
	 * @return lastNames splitted by " "
	 */
	private String[] splitLastName() {
		return lastName.split(" ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDas() {
		return das;
	}

	public void setDas(String das) {
		this.das = das;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public List<Project> getHistoryProjects() {
		return historyProjects;
	}

	public void setHistoryProjects(List<Project> historyProjects) {
		this.historyProjects = historyProjects;
	}

	public List<Task> getHistoryTasks() {
		return historyTasks;
	}

	public void setHistoryTasks(List<Task> historyTasks) {
		this.historyTasks = historyTasks;
	}

	public List<Caracteristic> getUserCaracteristics() {
		return userCaracteristics;
	}

	public void setUserCaracteristics(List<Caracteristic> userCaracteristics) {
		this.userCaracteristics = userCaracteristics;
	}

	public Long getIdUser() {
		return idUser;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", name=" + name + ", lastName=" + lastName + ", das=" + das + ", email="
				+ email + ", password=" + password + ", profilePic=" + profilePic + ", cv=" + cv + ", isAdmin="
				+ isAdmin + ", historyProjects=" + historyProjects + ", historyTasks=" + historyTasks
				+ ", userCaracteristics=" + userCaracteristics + "]";
	}

}
