package com.app.myprotask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_characteristics")
public class UserCharacteristic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user_characteristic")
	private Long idUserCharacteristic;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "characteristic_id")
	private Characteristic characteristic;

	@Column(name = "experience")
	private Integer experience;

	public UserCharacteristic() {
	}

	public UserCharacteristic(User user, Characteristic characteristic) {
		this.user = user;
		this.characteristic = characteristic;
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Characteristic getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(Characteristic characteristic) {
		this.characteristic = characteristic;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Long getIdUserCharacteristic() {
		return idUserCharacteristic;
	}

	@Override
	public String toString() {
		return "UserCharacteristic [idUserCharacteristic=" + idUserCharacteristic + ", user=" + user
				+ ", characteristic=" + characteristic + ", experience=" + experience + "]";
	}

}
