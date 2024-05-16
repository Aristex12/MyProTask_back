package com.app.myprotask.model;

import java.time.LocalDate;
import java.sql.Date;
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
import jakarta.validation.constraints.Max;

/**
 * It contains a user, a list of members, and a list of characteristics. They
 * come from the User and Characteristic entities.
 *
 * @author Manuel
 */
@Entity
@Table(name = "projects")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_project")
	private Long idProject;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "description", length = 500)
	private String description;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "finish_date")
	private Date finishDate;

	@Max(value = 999, message = "La cantidad de vacantes no puede ser mayor que 999")
	@Column(name = "vacancies")
	private int vacancies;

	@Column(name = "is_active")
	private boolean isActive;

	@ManyToMany
	@JoinTable(name = "project_characteristics", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "characteristic_id"))
	private List<Characteristic> projectCharacteristics;

	public Project() {
	}

	public Project(String name, String description, Date finishDate,
			@Max(value = 999, message = "La cantidad de vacantes no puede ser mayor que 999") int vacancies,
			List<Characteristic> projectCharacteristics) {
		this.name = name;
		this.description = description;
		this.startDate = generateLocalDate();
		this.finishDate = finishDate;
		this.vacancies = vacancies;
		this.isActive = true;
		this.projectCharacteristics = projectCharacteristics;
	}

	/**
	 * @author Manuel
	 * @return the current date
	 */
	private Date generateLocalDate() {
		return Date.valueOf(LocalDate.now());
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<Characteristic> getProjectCharacteristics() {
		return projectCharacteristics;
	}

	public void setProjectCharacteristics(List<Characteristic> projectCharacteristics) {
		this.projectCharacteristics = projectCharacteristics;
	}

	public Long getIdProject() {
		return idProject;
	}

	@Override
	public String toString() {
		return "Project [idProject=" + idProject + ", name=" + name + ", description=" + description + ", startDate="
				+ startDate + ", finishDate=" + finishDate + ", vacancies=" + vacancies + ", isActive=" + isActive
				+ ", projectCaracteristics=" + projectCharacteristics + "]";
	}

}
