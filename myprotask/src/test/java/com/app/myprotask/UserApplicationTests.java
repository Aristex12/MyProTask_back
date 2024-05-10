package com.app.myprotask;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.model.*;

@SpringBootTest
public class UserApplicationTests {
	
	@Test
	public void testEmptyConstructor(){
		User user = new User();
		
		assertNull(user.getName());
		assertNull(user.getLastName());
		assertNull(user.getDas());
		assertNull(user.getEmail());
		assertNull(user.getPassword());
		assertNull(user.getProfilePic());
		assertNull(user.getCv());
		assertNull(user.getHistoryProjects());
		assertNull(user.getHistoryTasks());
		assertNull(user.getUserCaracteristics());
		
	}
	
	@Test
    public void testParameterizedConstructor() {
        String name = "John";
        String lastName = "Doe";
        String das = "JD123";
        String email = "john.doe@example.com";
        String password = "password123";
        String profilePic = "profile.jpg";
        String cv = "cv.docx";
        boolean isAdmin = false;
        List<Project> historyProjects = new ArrayList<>();
        List<Task> historyTasks = new ArrayList<>();
        List<Caracteristic> userCaracteristics = new ArrayList<>();
        // Llena las listas con algunos datos ficticios
        historyProjects.add(new Project());
        historyTasks.add(new Task());
        userCaracteristics.add(new Caracteristic());

        User user = new User(name, lastName, das, email, password, profilePic, cv, isAdmin,
                             historyProjects, historyTasks, userCaracteristics);
        
        // Verifica que los campos se hayan inicializado correctamente
        assertEquals(name, user.getName());
        assertEquals(lastName, user.getLastName());
        assertEquals(das, user.getDas());
        assertEquals(email, user.getEmail());
        assertEquals(password, user.getPassword());
        assertEquals(profilePic, user.getProfilePic());
        assertEquals(cv, user.getCv());
        assertFalse(user.isAdmin());
        assertEquals(historyProjects, user.getHistoryProjects());
        assertEquals(historyTasks, user.getHistoryTasks());
        assertEquals(userCaracteristics, user.getUserCaracteristics());
    }
	
	@Test
	public void testToString() {
	    // Crear datos de prueba para el usuario
	    List<Project> historyProjects = new ArrayList<>();
	    List<Task> historyTasks = new ArrayList<>();
	    List<Caracteristic> userCaracteristics = new ArrayList<>();
	    
	    // Crear instancia de User con los datos de prueba
	    User user = new User("John", "Jones", "A926436", "hola@hotmail.com", "1234512345", "img/profile.jpg", "cv/user1.pdf", false, historyProjects, historyTasks, userCaracteristics);
	    
	    // Verificar que el método toString() devuelve la salida esperada
	    String expectedToString = "User [idUser=null, name=John, lastName=Jones, das=A926436, email=hola@hotmail.com, password=1234512345, profilePic=img/profile.jpg, cv=cv/user1.pdf, isAdmin=false, historyProjects=[], historyTasks=[], userCaracteristics=[]]";
	    assertEquals(expectedToString, user.toString());
	}

	
	
}
