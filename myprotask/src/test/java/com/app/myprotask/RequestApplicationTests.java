package com.app.myprotask;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.enums.StatusRequests;
import com.app.myprotask.model.*;
@SpringBootTest
public class RequestApplicationTests {

	@Test
	public void testEmptyConstructor(){
		Request request = new Request();
		
		assertNull(request.getMessage());
		assertNull(request.getProject());
		assertNull(request.getStatus());
		assertNull(request.getUser());
	}
	@Test
	public void testParameterizedConstructor() {
	    String message = "Test message";
	    StatusRequests status = StatusRequests.ACCEPTED;
	    User user = new User();
	    Project project = new Project();

	    Request request = new Request(message, status, user, project);

	    assertEquals(message, request.getMessage());
	    assertEquals(status, request.getStatus());
	    assertEquals(user, request.getUser());
	    assertEquals(project, request.getProject());
	}

	/*Todavia no hacerlo(Da error de la base por 
	 * Error executing DDL "INSERT INTO history_tasks (user_id, task_id) VALUES (3, 3)" via JDBC [Cannot add or update a child row: a foreign key constraint fails (`myprotask`.`history_tasks`, CONSTRAINT `FKr2dgqwp1fbgrjs18obmvaeyq7` FOREIGN KEY (`task_id`) REFERENCES `tasks` (`id_task`))]
	 * )
	 * @Test
	
	public void testToString() {
	    String message = "Test message";
	    StatusRequests status = StatusRequests.ACCEPTED;
	    User user = new User();
	    Project project = new Project(); 

	    Request request = new Request(message, status, user, project);

	    String expectedToString = "Request [idRequest=null, message=solicitud 1, status=ACCEPTED, user=null, project=null]";
	    assertEquals(expectedToString, request.toString());
	}
	*/
	
}
