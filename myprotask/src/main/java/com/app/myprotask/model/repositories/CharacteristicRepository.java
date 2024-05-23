package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.Characteristic;

/**
 * 
 */
@Repository
public interface CharacteristicRepository extends JpaRepository<Characteristic, Long> {
	
	/**
	 * @author Manuel
	 * @param idUser
	 * @return all the characteristics that the given user has
	 */
	@Query(value = "SELECT c.* FROM characteristics c, user_characteristics uc "
			+ "WHERE c.id_characteristic = uc.characteristic_id "
			+ "AND uc.user_id = ?1", nativeQuery = true)
	List<Characteristic> displayCharacteristicsByIdUser(Long idUser);
	
	/**
	 * @author Manuel
	 * @param idUser
	 * @return all the characteristics that the given user is missing
	 */
	@Query(value = "SELECT c.* FROM characteristics c"
			+ "LEFT JOIN user_characteristics uc ON c.id_characteristic = uc.characteristic_id"
			+ "WHERE uc.user_id != 1 OR uc.user_id IS NULL", nativeQuery = true)
	List<Characteristic> displayMissingCharacteristicsByIdUser(Long idUser);
}
