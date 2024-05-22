package com.app.myprotask.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Contains information about the features
 * 
 * @author Laura
 */
@Entity
@Table(name = "characteristics")
public class Characteristic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_characteristic")
	private Long idCharacteristic;

	@Column(name = "name", length = 100, unique = true)
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private Category category;
	
	public Characteristic() {
	}

	public Characteristic(String name, Category category) {
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getIdCharacteristic() {
		return idCharacteristic;
	}

	@Override
	public String toString() {
		return "Characteristic [idCharacteristic=" + idCharacteristic + ", name=" + name + ", category=" + category
				+ "]";
	}

}
