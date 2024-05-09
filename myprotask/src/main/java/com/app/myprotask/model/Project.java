package com.app.myprotask.model;
import java.util.Date;
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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "projects")
public class Project {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_project")
	private Long idProject;
 
	@Column(name = "name")
	private String name;
 
	@Column(name = "description")
	private String description;
 
	@Column(name = "start_date")
	private Date startDate;
 
	@Column(name = "finish_date")
	private Date finishDate;
 
	@Column(name = "vacancies")
	private int vacancies;
 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_id")
	private User manager;
 
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "members", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> members;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "project_caracteristics", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "caracteristic_id"))
	private List<Caracteristic> projectCaracteristics;
 
	public Project() {
	}

	public Project(String name, String description, Date startDate, Date finishDate, int vacancies, User manager,
			List<User> members, List<Caracteristic> projectCaracteristics) {
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.vacancies = vacancies;
		this.manager = manager;
		this.members = members;
		this.projectCaracteristics = projectCaracteristics;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public int getVacancies() {
		return vacancies;
	}

	public void setVacancies(int vacancies) {
		this.vacancies = vacancies;
	}

	public User getManager() {
		return manager;
	}

	public void setManager(User manager) {
		this.manager = manager;
	}

	public List<User> getMembers() {
		return members;
	}

	public void setMembers(List<User> members) {
		this.members = members;
	}

	public List<Caracteristic> getProjectCaracteristics() {
		return projectCaracteristics;
	}

	public void setProjectCaracteristics(List<Caracteristic> projectCaracteristics) {
		this.projectCaracteristics = projectCaracteristics;
	}

	public Long getIdProject() {
		return idProject;
	}

	@Override
	public String toString() {
		return "Project [idProject=" + idProject + ", name=" + name + ", description=" + description + ", startDate="
				+ startDate + ", finishDate=" + finishDate + ", vacancies=" + vacancies + ", manager=" + manager
				+ ", members=" + members + ", projectCaracteristics=" + projectCaracteristics + "]";
	}
 
}
