package com.app.myprotask.model.dao;

import java.util.List;

import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.Request;
import com.app.myprotask.model.Role;
import com.app.myprotask.model.Task;
import com.app.myprotask.model.User;
import com.app.myprotask.model.UserProject;
import com.app.myprotask.model.UserTask;

public interface DAOService {

	// USER TABLE METHODS CRUD

	void addUser(User user);

	void updateUser(User user);

	void deleteUser(User user);

	List<User> displayUsers();

	User displayUserById(Long id);

	// USER TABLE METHODS PERSONALIZED

	Long searchUserByEmailPassword(String email, String password);

	Long searchUserByDasPassword(String das, String password);

	//////////////////////////////////////////////////////////////////////////////

	// CARACTERISTIC TABLE METHODS

	void addCaracteristic(Characteristic caracteristic);

	void updateCaracteristic(Characteristic caracteristic);

	void deleteCaracteristic(Characteristic caracteristic);

	List<Characteristic> displayCaracteristics();

	Characteristic displayCaracteristicById(Long id);

	//////////////////////////////////////////////////////////////////////////////

	// PROJECT TABLE METHODS

	void addProject(Project project);

	void updateProject(Project project);

	void deleteProject(Project project);

	List<Project> displayProjects();

	Project displayProjectById(Long id);

	// PROJECT TABLE METHODS PERSONALIZED

	List<Project> displayProjectsByUserId(Long idUser);

	//////////////////////////////////////////////////////////////////////////////

	// REQUEST TABLE METHODS

	void addRequest(Request request);

	void updateRequest(Request request);

	void deleteRequest(Request request);

	List<Request> displayRequests();

	Request displayRequestById(Long id);

	//////////////////////////////////////////////////////////////////////////////

	// TASK TABLE METHODS

	void addTask(Task task);

	void updateTask(Task task);

	void deleteTask(Task task);

	List<Task> displayTasks();

	Task displayTaskById(Long id);

	// TASK TABLE METHODS PERSONALIZED

	List<Task> displayActiveTasksByUserId(Long idUser);

	List<Task> displayActiveTasksByProjectId(Long idProject);
	
	List<Task> displayTasksByUserId(Long idUser);


	//////////////////////////////////////////////////////////////////////////////

	// USERPROJECT TABLE METHODS CRUD

	void addUserProject(UserProject userProject);

	void updateUserProject(UserProject userProject);

	void deleteUserProject(UserProject userProject);

	List<UserProject> displayUserProjects();

	UserProject displayUserProjectById(Long id);

	// USERPROJECT TABLE METHODS PERSONALIZED

	//////////////////////////////////////////////////////////////////////////////

	// USERTASK TABLE METHODS CRUD

	void addUserTask(UserTask userTask);

	void updateUserTask(UserTask userTask);

	void deleteUserTask(UserTask userTask);

	List<UserTask> displayUserTasks();

	UserTask displayUserTaskById(Long id);

	// USERTASK TABLE METHODS PERSONALIZED
	
	
	//////////////////////////////////////////////////////////////////////////////

	// ROLE TABLE METHODS CRUD
	
	void addRole(Role role);

	void updateRole(Role role);

	void deleteRole(Role role);

	List<Role> displayRoles();

	Role displayRoleById(Long id);
	
	// ROLE TABLE METHODS PERSONALIZED
	
	Role getRoleByName(String name);


}
