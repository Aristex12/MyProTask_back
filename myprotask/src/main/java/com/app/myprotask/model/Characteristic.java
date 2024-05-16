package com.app.myprotask.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@Column(name = "id_caracteristic")
	private Long idCharacteristic;
 
	@Column(name = "name", length = 100, unique = true)
	private String name;
 
	public Characteristic() {
	}
 
	public Characteristic(String name) {
		this.name = name;
	}
 
	public Long getIdCaracteristic() {
		return idCharacteristic;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	@Override
	public String toString() {
		return "Caracteristic [idCaracteristic=" + idCharacteristic + ", name=" + name + "]";
	}
 
}
