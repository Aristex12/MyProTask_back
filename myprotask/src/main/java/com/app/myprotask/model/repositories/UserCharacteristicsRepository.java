package com.app.myprotask.model.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.UserCharacteristic;

@Repository
public interface UserCharacteristicsRepository extends JpaRepository<UserCharacteristic, Long> {

	
	/**
	 * @author Manuel
	 * @param idUser
	 * @param idCharacteristic
	 * @return User Characteristic when User and Characteristic match
	 */
	@Query(value = "SELECT * FROM user_characteristics "
			+ "WHERE user_id = ?1 "
			+ "AND characteristic_id = ?2", nativeQuery = true)
	UserCharacteristic displayUserCharacteristicByIdUserIdCharacteristic(Long idUser, Long idCharacteristic);
}