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

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long idUser;

	@Column(name = "name")
	private String name;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "das")
	private String das;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "profile_pic")
	private String profilePic;

	@Column(name = "cv")
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

	public User(String name, String lastName, String das, String email, String password, String profilePic, String cv,
			boolean isAdmin, List<Project> historyProjects, List<Task> historyTasks,
			List<Caracteristic> userCaracteristics) {
		this.name = name;
		this.lastName = lastName;
		this.das = das;
		this.email = email;
		this.password = password;
		this.profilePic = profilePic;
		this.cv = cv;
		this.isAdmin = isAdmin;
		this.historyProjects = historyProjects;
		this.historyTasks = historyTasks;
		this.userCaracteristics = userCaracteristics;
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
