package com.app.myprotask.model.dao;

import java.util.List;


import com.app.myprotask.model.Category;
import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.Event;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.Request;
import com.app.myprotask.model.Role;
import com.app.myprotask.model.Task;
import com.app.myprotask.model.User;
import com.app.myprotask.model.UserCharacteristic;
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
	
	List<User> displayUsersByCharacteristics(List<Long> characteristicIds);
	
	List<User> displayUsersByIdProject(Long idProject);
	
	Integer countUserByNameLastName(String name, String lastName);

	List<User> searchUsersByCharacteristics(List<Long> characteristicsIds, int size);

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

	List<Characteristic> displayMissingCharacteristicsByIdUser(Long idUser);

	//////////////////////////////////////////////////////////////////////////////

	// PROJECT TABLE METHODS CRUD

	void addProject(Project project);

	void updateProject(Project project);

	void deleteProject(Project project);

	List<Project> displayProjects();

	Project displayProjectById(Long id);

	// PROJECT TABLE METHODS PERSONALIZED
	
	List<Project> displayProjectsByActiveUserProjectsByIdUser(Long idUser);

	List<Project> displayProjectsByIdUser(Long idUser);

	List<Project> searchProjectsByCharacteristics(List<Long> characteristicsIds, int size);

	void updateActiveProject(Project project);

	List<Project> displayInactiveProjectsByIdUser(Long idUser);

	List<Project> displayActiveProjectsByIdUser(Long idUser);

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
	
	List<Task> displayTasksByProjectsByIdUser(Long idUser);

	Integer countActiveTasksByIdProject(Long idProject);

	List<Task> displayTasksByIdProject(Long idProject);

	List<Task> displayActiveTasksActiveProjectByIdUser(Long idUser);

	List<Task> displayActiveTasksByIdUser(Long idUser);

	List<Task> displayActiveTasksByIdProject(Long idProject);

	List<Task> displayTasksByIdUser(Long idUser);

	//////////////////////////////////////////////////////////////////////////////

	// USERPROJECT TABLE METHODS CRUD

	void addUserProject(UserProject userProject);

	void updateUserProject(UserProject userProject);

	void deleteUserProject(UserProject userProject);

	List<UserProject> displayUserProjects();

	UserProject displayUserProjectById(Long id);

	// USERPROJECT TABLE METHODS PERSONALIZED
	
	List<UserProject> displayActiveUserProjectByIdProject(Long idProject);
	
	Integer countActiveUserProjectByIdProject(Long idProject);

	List<UserProject> displayUserProjectByActiveProjectByIdUser(Long idUser);

	void updateActiveUserProject(UserProject userProject);

	List<UserProject> displayUserProjectByProjectId(Long idProject);

	List<UserProject> displayUserProjectByIdUser(Long idUser);

	List<UserProject> displayActiveUserProject();

	List<UserProject> displayActiveUserProjectByIdUser(Long idUser);

	//////////////////////////////////////////////////////////////////////////////

	// USERTASK TABLE METHODS CRUD

	void addUserTask(UserTask userTask);

	void updateUserTask(UserTask userTask);

	void deleteUserTask(UserTask userTask);

	List<UserTask> displayUserTasks();

	UserTask displayUserTaskById(Long id);

	// USERTASK TABLE METHODS PERSONALIZED
	
	UserTask displayUserTaskByIdTaskIdUser(Long idTask, Long idUser);

	List<UserTask> displayUserTasksByUserId(Long idUser);

	List<UserTask> displayUserTasksByTaskId(Long idTask);

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

	//////////////////////////////////////////////////////////////////////////////

	// USERCHARACTERISTIC TABLE METHODS CRUD

	void addUserCharacteristic(UserCharacteristic userCharacteristic);

	void updateUserCharacteristic(UserCharacteristic userCharacteristic);

	void deleteUserCharacteristic(UserCharacteristic userCharacteristic);

	List<UserCharacteristic> displayUserCharacteristics();

	UserCharacteristic displayUserCharacteristicById(Long id);

	// USERCHARACTERISTIC TABLE METHODS PERSONALIZED

	UserCharacteristic displayUserCharacteristicByIdUserIdCharacteristic(Long idUser, Long idCharacteristic);

	void addUserCharacteristicByIdUser(Long idUser, Long idCharacteristic, Integer experience);

	void deleteUserCharacteristicByIdUser(Long idUser, Long idCharacteristic);

	//////////////////////////////////////////////////////////////////////////////

	// EVENT TABLE METHODS CRUD

	void addEvent(Event event);

	void updateEvent(Event event);

	void deleteEvent(Event event);

	List<Event> displayEvents();

	Event displayEventById(Long id);

	// EVENT TABLE METHODS PERSONALIZED

	List<Event> displayEventsByIdUser(Long idUser);

	// CATEGORY TABLE METHODS CRUD

	void addCategory(Category category);

	void updateCategory(Category category);

	void deleteCategory(Category category);

	List<Category> displayCategories();

	Category displayCategoryById(Long id);

	// CATEGORY TABLE METHODS PERSONALIZED

}
