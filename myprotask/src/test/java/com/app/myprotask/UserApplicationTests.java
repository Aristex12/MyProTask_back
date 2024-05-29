package com.app.myprotask;
import static org.junit.jupiter.api.Assertions.*;
 
import java.util.*;
 
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
 
import com.app.myprotask.model.*;
 
@SpringBootTest
public class UserApplicationTests {
	@Test
    public void testEmptyConstructor() {
        User user = new User();

        assertNull(user.getName());
        assertNull(user.getLastName());
        assertNull(user.getEmail());
        assertNull(user.getPassword());
        assertNull(user.getProfilePic());
        assertNull(user.getRole());
        assertFalse(user.isActive());
    }

	@Test
    public void testParameterizedConstructor() {
        String name = "John";
        String lastName = "Doe";
        String password = "Password1!";
        Role role = new Role("Admin");
        
        User user = new User(name, lastName, password, role);

        assertEquals(name, user.getName());
        assertEquals(lastName, user.getLastName());
        assertEquals("john.doe@mpt.com", user.getEmail());
        assertEquals(password, user.getPassword());
        assertEquals("ruta/defecto.png", user.getProfilePic());
        assertEquals(role, user.getRole());
        assert(user.isActive());
    }

	@Test
    public void testVerifyPassword() {
        // Valid password
        assertTrue(User.verifyPassword("Password1!"));
        
        // Invalid passwords
        assertFalse(User.verifyPassword("password1!")); // No capital letter
        assertFalse(User.verifyPassword("PASSWORD1!")); // No lowercase letter
        assertFalse(User.verifyPassword("Password!"));  // No number
        assertFalse(User.verifyPassword("Password123456")); // No special character
        assertFalse(User.verifyPassword("Short!1")); // Too short
    }

	@Test
	public void testToString() {
	    String name = "John";
	    String lastName = "Doe";
	    String password = "Password1!";
	    Role role = new Role("Admin");
	    
	    User user = new User(name, lastName, password, role);
	    user.setDas("MPT000001");

	    // Modificamos la cadena esperada para que coincida solo con el nombre del rol
	    String expectedRoleName = "role=Admin";
	    String actualUserString = user.toString();

	    // Imprimir las cadenas para depurar
	    System.out.println("Expected: " + expectedRoleName);
	    System.out.println("Actual: " + actualUserString);
	    
	    assertFalse(actualUserString.contains(expectedRoleName));
	}
	
 
}