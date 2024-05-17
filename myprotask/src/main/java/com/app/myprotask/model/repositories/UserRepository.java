package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.User;

/**
 * Repository where we will have all the necessary queries about the User table.
 * 
 * @author Manuel
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

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
	
	
//	/**
//	 * @author Alejandro
//	 * @param characteristics
//	 * @param size
//	 * @return List of all users with the specific characteristics
//	 */
//	@Query(value = "SELECT u FROM User u JOIN u.userCharacteristics uc JOIN uc.characteristic c WHERE c.name IN :characteristics GROUP BY u.idUser HAVING COUNT(DISTINCT c.idCharacteristic) = :size")
//    List<User> findUserByCharacteristics(List<String> characteristics, int size);

}
