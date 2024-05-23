package com.app.myprotask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_category")
	private Long idCategory;

	@Column(name = "name", length = 100, nullable = false, unique = true)
	private String name;

	@Column(name = "is_technical", nullable = false)
	private boolean isTechnical;

	public Category() {
	}

	public Category(String name, boolean isTechnical) {
		this.name = name;
		this.isTechnical = isTechnical;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTechnical() {
		return isTechnical;
	}

	public void setTechnical(boolean isTechnical) {
		this.isTechnical = isTechnical;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", name=" + name + ", isTechnical=" + isTechnical + "]";
	}

}
