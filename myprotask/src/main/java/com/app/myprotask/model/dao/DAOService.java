package com.app.myprotask.model.dao;

import java.util.List;

import com.app.myprotask.model.Caracteristic;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.Request;
import com.app.myprotask.model.Task;
import com.app.myprotask.model.User;

/**
 * 
 */
public interface DAOService {
	
	// USER TABLE METHODS CRUD
	
	void addUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(User user);
	
	List<User> showUsers();
	
	User displayUserById(Long id);
	
	// USER TABLE METHODS PERSONALIZED
	
	Long searchUserByEmailPassword(String email, String password);
	
	Long searchUserByDasPassword(String das, String password);
	
	
	//////////////////////////////////////////////////////////////////////////////

	// CARACTERISTIC TABLE METHODS
	
	void addCaracteristic(Caracteristic caracteristic);
	
	void updateCaracteristic(Caracteristic caracteristic);
	
	void deleteCaracteristic(Caracteristic caracteristic);
	
	List<Caracteristic> showCaracteristics();
	
	Caracteristic displayCaracteristicById(Long id);
	
	//////////////////////////////////////////////////////////////////////////////

	// PROJECT TABLE METHODS
	
	void addProject(Project project);
	
	void updateProject(Project project);
	
	void deleteProject(Project project);
	
	List<Project> showProjects();
	
	Project displayProjectById(Long id);
	
	//////////////////////////////////////////////////////////////////////////////

	// REQUEST TABLE METHODS
	
	void addRequest(Request request);
	
	void updateRequest(Request request);
	
	void deleteRequest(Request request);
	
	List<Request> showRequests();
	
	Request displayRequestById(Long id);
	
	//////////////////////////////////////////////////////////////////////////////

	// TASK TABLE METHODS
	
	void addTask(Task request);
	
	void updateTask(Task request);
	
	void deleteTask(Task request);
	
	List<Task> showTasks();
	
	Task displayTaskById(Long id);	
		
}
