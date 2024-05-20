package com.app.myprotask.model.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

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
	
	List<User> searchUsersByCharacteristics(List<Long> characteristicsIds, int size) ;
	
	void updateActiveUser(User user);
	
	Long searchUserByEmailPassword(String email, String password);

	Long searchUserByDasPassword(String das, String password);

	//////////////////////////////////////////////////////////////////////////////

	// CARACTERISTIC TABLE METHODS CRUD

	void addCharacteristic(Characteristic caracteristic);

	void updateCharacteristic(Characteristic caracteristic);

	void deleteCharacteristic(Characteristic caracteristic);

	List<Characteristic> displayCharacteristics();

	Characteristic displayCharacteristicById(Long id);

	// CHARACTERISCTIC TABLE METHODS PERSONALIZED

	List<Characteristic> displayCharacteristicsByIdUser(Long idUser);

	//////////////////////////////////////////////////////////////////////////////

	// PROJECT TABLE METHODS CRUD

	void addProject(Project project);

	void updateProject(Project project);

	void deleteProject(Project project);

	List<Project> displayProjects();

	Project displayProjectById(Long id);

	// PROJECT TABLE METHODS PERSONALIZED
	
	List<Project> searchProjectsByCharacteristics(List<Long> characteristicsIds, int size) ;
	
	void updateActiveProject(Project project);

	List<Project> displayInactiveProjectsByUserId(Long idUser);

	List<Project> displayActiveProjectsByUserId(Long idUser);

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
	
	void updateActiveUserProject(UserProject userProject);
	
	List<UserProject> displayUserProjectByProjectId(Long idProject);
	
	List<UserProject> displayUserProjectByUserId(Long idUser);

	List<UserProject> displayActiveUserProject();

	List<UserProject> displayActiveUserProjectByUserId(Long idUser);

	//////////////////////////////////////////////////////////////////////////////

	// USERTASK TABLE METHODS CRUD

	void addUserTask(UserTask userTask);

	void updateUserTask(UserTask userTask);

	void deleteUserTask(UserTask userTask);

	List<UserTask> displayUserTasks();

	UserTask displayUserTaskById(Long id);

	// USERTASK TABLE METHODS PERSONALIZED
	
	List<UserTask> displayActiveUserTasksByUserId(Long idUser);

	//////////////////////////////////////////////////////////////////////////////

	// ROLE TABLE METHODS CRUD

	void addRole(Role role);

	void updateRole(Role role);

	void deleteRole(Role role);

	List<Role> displayRoles();

	Role displayRoleById(Long id);

	// ROLE TABLE METHODS PERSONALIZED

	Integer displayRoleUserProjectByIdUser(Long idUser);

	Role getRoleByName(String name);

}
