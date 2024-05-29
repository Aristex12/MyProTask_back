package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Project;
import com.app.myprotask.model.Task;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/task")
public class TaskController {

	@Autowired
	DAOService daoS;

	@PostMapping(value = "/addTask")
	public ResponseEntity<String> addTask(@RequestBody Task task, @RequestParam("idProject") Long idProject) {
	    try {
	        Project project = daoS.displayProjectById(idProject);
	        if (project != null) {
	            daoS.addTask(new Task(task.getName(), task.getDescription(), task.getFinishDate(), task.getPriority(), project));
	            return ResponseEntity.status(HttpStatus.CREATED).body("Task added successfully");
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Project with ID: " + idProject + " not found");
	        }
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while adding the task: " + e.getMessage());
	    }
	}


	/**
	 * Used in View Tasks [ Member ]
	 * 
	 * @author Alejandro
	 * @param idUser
	 * @return all active tasks from actives projects of a user
	 */
	@GetMapping(value = "/displayActiveTasksActiveProjectByIdUser")
	public ResponseEntity<?> displayActiveTasksActiveProjectByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Task> activeTasks = daoS.displayActiveTasksActiveProjectByIdUser(idUser);
			if (!activeTasks.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(activeTasks);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No active tasks found for user with ID: " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying active tasks for user with ID " + idUser + ": "
							+ e.getMessage());
		}
	}

	/**
	 * Used in calendar view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return lists of all tasks of the user ordered by projects
	 */
	@GetMapping(value = "/displayTasksByIdUser")
	public ResponseEntity<?> displayTasksByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Task> tasks = daoS.displayTasksByIdUser(idUser);
			if (!tasks.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(tasks);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No tasks found for user with ID: " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
					"An error occurred while displaying tasks for user with ID " + idUser + ": " + e.getMessage());
		}
	}

	/**
	 * Used in Home view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of tasks of the user
	 */
	@GetMapping(value = "/displayActiveTasksByIdUser")
	public ResponseEntity<?> displayActiveTasksByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Task> activeTasks = daoS.displayActiveTasksByIdUser(idUser);
			if (!activeTasks.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(activeTasks);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No active tasks found for user with ID: " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying active tasks for user with ID " + idUser + ": "
							+ e.getMessage());
		}
	}

	/**
	 * Used in Home view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of tasks of the project
	 */
	@GetMapping(value = "/displayActiveTasksByIdProject")
	public ResponseEntity<?> displayActiveTasksByIdProject(@RequestParam("idProject") Long idProject) {
		try {
			List<Task> activeTasks = daoS.displayActiveTasksByIdProject(idProject);
			if (!activeTasks.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(activeTasks);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No active tasks found for project with ID: " + idProject);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying active tasks for project with ID " + idProject + ": "
							+ e.getMessage());
		}
	}

	/**
	 * Used in Home Project [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return Count all tasks of the project
	 */
	@GetMapping(value = "/countActiveTasksByIdProject")
	public ResponseEntity<?> countActiveTasksByIdProject(@RequestParam("idProject") Long idProject) {
		try {
			Integer count = daoS.countActiveTasksByIdProject(idProject);
			if (count != null) {
				return ResponseEntity.status(HttpStatus.OK).body(count);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No active tasks found for project with ID: " + idProject);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while counting active tasks for project with ID " + idProject + ": "
							+ e.getMessage());
		}
	}

}