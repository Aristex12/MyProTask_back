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
        assertNull(user.getDas());
        assertNull(user.getEmail());
        assertNull(user.getPassword());
        assertNull(user.getProfilePic());
        assertNull(user.getCv());
        assertFalse(user.isActive());
        assertNull(user.getRole());
        assertNull(user.getUserCharacteristics());
    }

    @Test
    public void testParameterizedConstructor() {
        String name = "John";
        String lastName = "Doe";
        String password = "Password1!";  // Cumple con el patrón
        Role role = new Role();
        List<Characteristic> userCharacteristics = new ArrayList<>();
        Characteristic characteristic = new Characteristic();
        userCharacteristics.add(characteristic);

        User user = new User(name, lastName, password, role, userCharacteristics);

        assertEquals(name, user.getName());
        assertEquals(lastName, user.getLastName());
        assertEquals("john.doe@mpt.com", user.getEmail());  // Generado por el constructor
        assertEquals(password, user.getPassword());
        assertEquals("ruta/defecto.png", user.getProfilePic());  // Valor por defecto
        assertTrue(user.isActive());  // Valor por defecto
        assertEquals(role, user.getRole());
        assertEquals(userCharacteristics, user.getUserCharacteristics());
    }

    @Test
    public void testToString() {
        Role role = new Role();
        List<Characteristic> userCharacteristics = new ArrayList<>();
        Characteristic characteristic = new Characteristic();
        userCharacteristics.add(characteristic);

        User user = new User("John", "Jones", "Password1!", role, userCharacteristics);

        String expectedToString = "User [idUser=null, name=John, lastName=Jones, das=null, email=john.jones@mpt.com, password=Password1!, profilePic=ruta/defecto.png, cv=null, role=" 
                + role + ", isActive=true, userCharacteristics=" + userCharacteristics + "]";

        assertEquals(expectedToString, user.toString());
    }
	
 
}