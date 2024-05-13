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
 * Contains a list of the projects they have participated in, another list of
 * the tasks they have participated in, and finally a list of all their personal
 * characteristics. These lists are connected to the Project, Task, and
 * Characteristics entities.
 * 
 * @author Alejandro
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
	@Pattern(regexp = "^MPT\\d{6}$", message = "El DAS debe seguir el patrón [MPT] seguido de 6 números.")
	private String das;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "password", nullable = false)
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9]).{8,}$", message = "La contraseña debe contener al menos una mayúscula, un carácter especial, un número y tener una longitud mínima de 8 caracteres.")
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
			@Pattern(regexp = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9]).{8,}$", message = "La contraseña debe contener al menos una mayúscula, un carácter especial, un número y tener una longitud mínima de 8 caracteres.") String password,
			@Pattern(regexp = ".+\\.(png|jpg|jpeg)$", message = "El archivo debe ser de formato PNG, JPG o JPEG.") String profilePic,
			List<Caracteristic> userCaracteristics) {
		this.name = splitNameBySpaces(name);
		this.lastName = splitLastNameBySpaces(lastName);
		this.email = generateEmail();
		this.password = password;
		this.profilePic = profilePic;
		this.isAdmin = false;
		this.userCaracteristics = userCaracteristics;
	}

	/**
	 * Used in the constructor of the class
	 * 
	 * @author Manuel
	 * @return the name without spaces at the beginning or end and remove if there
	 *         are multiple in the case of being a compound name
	 */
	private String splitNameBySpaces(String name) {
		return name.trim().replaceAll("\\s+", " ");
	}

	/**
	 * Used in the constructor of the class
	 * 
	 * @author Manuel
	 * @return the last name without spaces at the beginning or end and remove if
	 *         there are multiple in the case of being a compound last name
	 */
	private String splitLastNameBySpaces(String lastName) {
		return lastName.trim().replaceAll("\\s+", " ");
	}

	/**
	 * Used in the constructor of the class
	 * 
	 * @author Manuel
	 * @return the email using the format name.lastname@mpt.com
	 */
	private String generateEmail() {
		return splitNameByDotes() + "." + splitLastNameByDotes() + "@mpt.com";
	}

	/**
	 * Used in the generateEmail method
	 * 
	 * @author Manuel
	 * @return the name separated by dots in case it is compound
	 */
	private String splitNameByDotes() {
		return this.name.replaceAll("\\s+", ".").toLowerCase();
	}

	/**
	 * Used in the generateEmail method
	 * 
	 * @author Manuel
	 * @return the name separated by dots in case it is compound
	 */
	private String splitLastNameByDotes() {
		return this.lastName.replaceAll("\\s+", ".").toLowerCase();
	}

	/**
	 * Used in the controller user when create a new user.
	 * 
	 * @author Manuel
	 * @return a string formed by MPT and a 6-digit number obtained from the user ID
	 */
	public String generateNumberDAS() {
		return "MPT" + String.format("%06d", this.idUser);
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
