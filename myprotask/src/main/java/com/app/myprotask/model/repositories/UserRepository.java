package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.app.myprotask.model.User;

/**
 * Repository where we will have all the necessary queries about the User table.
 * 
 * @author Manuel
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "SELECT COUNT(*) FROM users WHERE name = ?1 AND last_name = ?2", nativeQuery = true)
	Integer countUserByNameLastName(String name, String lastName);

	/**
	 * @author Manuel
	 * @param email
	 * @param password
	 * @return the User ID if the email and password match the ones obtained
	 */
	@Query(value = "SELECT id_user FROM users WHERE email = ?1 AND password = ?2", nativeQuery = true)
	Long searchUserByEmailPassword(String email, String password);

	/**
	 * @author Manuel
	 * @param das      The string containing the das entered by the user
	 * @param password The string containing the password entered by the user
	 * @return the User ID if the das and password match the ones obtained
	 */
	@Query(value = "SELECT id_user FROM users WHERE das = ?1 AND password = ?2", nativeQuery = true)
	Long searchUserByDasPassword(String das, String password);

	/**
	 * @author Alejandro
	 * @param characteristicIds
	 * @param size
	 * @return List of all users with the specific characteristics
	 */
	@Query(value = "SELECT u.* FROM users u, user_characteristics uc, characteristics c "
			+ "WHERE u.id_user = uc.user_id " + "AND uc.characteristic_id = c.id_characteristic "
			+ "AND c.id_characteristic IN :characteristicIds " + "GROUP BY u.id_user "
			+ "HAVING COUNT(DISTINCT c.id_characteristic) >= :size", nativeQuery = true)
	List<User> searchUsersByCharacteristics(@Param("characteristicIds") List<Long> characteristicIds,
			@Param("size") int size);

	User findByEmail(String email);
}
