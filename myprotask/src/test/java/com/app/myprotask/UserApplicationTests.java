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
	    String password = "password123";
	    String profilePic = "profile.jpg";
	    String cv = "cv.docx";
	    boolean isAdmin = false;
	    List<Project> historyProjects = new ArrayList<>();
	    List<Task> historyTasks = new ArrayList<>();
	    List<Caracteristic> userCaracteristics = new ArrayList<>();
	    Project project = new Project(/* proporciona los argumentos necesarios */);
	    Task task = new Task(/* proporciona los argumentos necesarios */);
	    Caracteristic caracteristic = new Caracteristic(/* proporciona los argumentos necesarios */);
	    historyProjects.add(project);
	    historyTasks.add(task);
	    userCaracteristics.add(caracteristic);
 
	    User user = new User(name, lastName, password, profilePic, cv, historyProjects, historyTasks, userCaracteristics);
	    assertEquals(name, user.getName());
	    assertEquals(lastName, user.getLastName());
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
	    List<Project> historyProjects = new ArrayList<>();
	    List<Task> historyTasks = new ArrayList<>();
	    List<Caracteristic> userCaracteristics = new ArrayList<>();
	    User user = new User("John", "Jones", "1234512345", "img/profile.jpg", "cv/user1.pdf", historyProjects, historyTasks, userCaracteristics);
	    String expectedToString = "User [idUser=null, name=John, lastName=Jones, das=MPTnull, email=john.jones@mpt.com, password=1234512345, profilePic=img/profile.jpg, cv=cv/user1.pdf, isAdmin=false, historyProjects=[], historyTasks=[], userCaracteristics=[]]";
	    assertEquals(expectedToString, user.toString());
	}
 
}