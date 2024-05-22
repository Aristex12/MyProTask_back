package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.UserCharacteristic;

@Repository
public interface UserCharacteristicsRepository extends JpaRepository<UserCharacteristic, Long> {

	/**
	 * @author Manuel
	 * @return all user characteristics by user 
	 */
	@Query(value = "SELECT * FROM user_characteristic WHERE user_id = ?1", nativeQuery = true)
	List<UserCharacteristic> displayUserCharacteristicsByIdUser(Long idUser);
}
