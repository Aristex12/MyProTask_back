package com.app.myprotask.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.Request;
import com.app.myprotask.model.Role;
import com.app.myprotask.model.Task;
import com.app.myprotask.model.User;
import com.app.myprotask.model.UserProject;
import com.app.myprotask.model.UserTask;
import com.app.myprotask.model.repositories.CharacteristicRepository;
import com.app.myprotask.model.repositories.ProjectRepository;
import com.app.myprotask.model.repositories.RequestRepository;
import com.app.myprotask.model.repositories.RoleRepository;
import com.app.myprotask.model.repositories.TaskRepository;
import com.app.myprotask.model.repositories.UserProjectRepository;
import com.app.myprotask.model.repositories.UserRepository;
import com.app.myprotask.model.repositories.UserTaskRepository;

/**
 * 
 */
@Service
public class DAOServiceImpl implements DAOService {

	@Autowired
	CharacteristicRepository caracteristicRep;

	@Autowired
	ProjectRepository projectRep;

	@Autowired
	RequestRepository requestRep;

	@Autowired
	TaskRepository taskRep;

	@Autowired
	UserRepository userRep;

	@Autowired
	UserProjectRepository userProjectRep;

	@Autowired
	UserTaskRepository userTaskRep;

	@Autowired
	RoleRepository roleRep;

	// USER TABLE METHODS CRUD

	@Override
	public void addUser(User user) {
		userRep.save(user);

		user.setDas(user.generateNumberDAS());

		userRep.save(user);
	}

	@Override
	public void updateUser(User user) {
		userRep.save(user);
	}

	@Override
	public void deleteUser(User user) {
		userRep.delete(user);
	}

	@Override
	public List<User> displayUsers() {
		return userRep.findAll();
	}

	@Override
	public User displayUserById(Long id) {
		return userRep.findById(id).orElse(null);
	}

	// USER TABLE METHODS PERSONALIZED

	@Override
	public Long searchUserByEmailPassword(String email, String password) {
		return userRep.searchUserByEmailPassword(email, password);
	}

	@Override
	public Long searchUserByDasPassword(String das, String password) {
		return userRep.searchUserByDasPassword(das, password);
	}

	//////////////////////////////////////////////////////////////////////////////

	// CARACTERISTIC TABLE METHODS CRUD

	@Override
	public void addCaracteristic(Characteristic caracteristic) {
		caracteristicRep.save(caracteristic);
	}

	@Override
	public void updateCaracteristic(Characteristic caracteristic) {
		caracteristicRep.save(caracteristic);
	}

	@Override
	public void deleteCaracteristic(Characteristic caracteristic) {
		caracteristicRep.delete(caracteristic);
	}

	@Override
	public List<Characteristic> displayCaracteristics() {
		return caracteristicRep.findAll();
	}

	@Override
	public Characteristic displayCaracteristicById(Long id) {
		return caracteristicRep.findById(id).orElse(null);
	}

	// CARACTERISTIC TABLE METHODS PERSONALIZED

	//////////////////////////////////////////////////////////////////////////////

	// PROJECT TABLE METHODS CRUD

	@Override
	public void addProject(Project project) {
		projectRep.save(project);
	}

	@Override
	public void updateProject(Project project) {
		projectRep.save(project);
	}

	@Override
	public void deleteProject(Project project) {
		projectRep.save(project);
	}

	@Override
	public List<Project> displayProjects() {
		return projectRep.findAll();
	}

	@Override
	public Project displayProjectById(Long id) {
		return projectRep.findById(id).orElse(null);
	}

	// PROJECT TABLE METHODS PERSONALIZED

	@Override
	public List<Project> displayProjectsByUserId(Long idUser) {
		return projectRep.displayProjectsByUserId(idUser);
	}

	//////////////////////////////////////////////////////////////////////////////

	// REQUEST TABLE METHODS CRUD

	@Override
	public void addRequest(Request request) {
		requestRep.save(request);
	}

	@Override
	public void updateRequest(Request request) {
		requestRep.save(request);
	}

	@Override
	public void deleteRequest(Request request) {
		requestRep.delete(request);
	}

	@Override
	public List<Request> displayRequests() {
		return requestRep.findAll();
	}

	@Override
	public Request displayRequestById(Long id) {
		return requestRep.findById(id).orElse(null);
	}

	// REQUEST TABLE METHODS PERSONALIZED

	//////////////////////////////////////////////////////////////////////////////

	// TASK TABLE METHODS CRUD

	@Override
	public void addTask(Task task) {
		taskRep.save(task);
	}

	@Override
	public void updateTask(Task task) {
		taskRep.save(task);
	}

	@Override
	public void deleteTask(Task task) {
		taskRep.save(task);
	}

	@Override
	public List<Task> displayTasks() {
		return taskRep.findAll();
	}

	@Override
	public Task displayTaskById(Long id) {
		return taskRep.findById(id).orElse(null);
	}

	// TASK TABLE METHODS PERSONALIZED

	@Override
	public List<Task> displayTasksByUserId(Long idUser) {
		return taskRep.displayTasksByUserId(idUser);
	}

	@Override
	public List<Task> displayTasksByProjectId(Long idProject) {
		return taskRep.displayTasksByProjectId(idProject);
	}

	//////////////////////////////////////////////////////////////////////////////

	// PROJECTTASK TABLE METHODS CRUD
	@Override
	public void addUserProject(UserProject userProject) {
		userProjectRep.save(userProject);
	}

	@Override
	public void updateUserProject(UserProject userProject) {
		userProjectRep.save(userProject);
	}

	@Override
	public void deleteUserProject(UserProject userProject) {
		userProjectRep.delete(userProject);
	}

	@Override
	public List<UserProject> displayUserProjects() {
		return userProjectRep.findAll();
	}

	@Override
	public UserProject displayUserProjectById(Long id) {
		return userProjectRep.findById(id).orElse(null);
	}

	// USERPROJECT TABLE METHODS PERSONALIZED

	//////////////////////////////////////////////////////////////////////////////

	// USERTASK TABLE METHODS

	@Override
	public void addUserTask(UserTask userTask) {
		userTaskRep.save(userTask);
	}

	@Override
	public void updateUserTask(UserTask userTask) {
		userTaskRep.save(userTask);
	}

	@Override
	public void deleteUserTask(UserTask userTask) {
		userTaskRep.save(userTask);
	}

	@Override
	public List<UserTask> displayUserTasks() {
		return userTaskRep.findAll();
	}

	@Override
	public UserTask displayUserTaskById(Long id) {
		return userTaskRep.findById(id).orElse(null);
	}

	// USERTASK TABLE METHODS PERSONALIZED

	//////////////////////////////////////////////////////////////////////////////

	// ROLE TABLE METHODS CRUD

	@Override
	public void addRole(Role role) {
		roleRep.save(role);
	}

	@Override
	public void updateRole(Role role) {
		roleRep.save(role);
	}

	@Override
	public void deleteRole(Role role) {
		roleRep.delete(role);
	}

	@Override
	public List<Role> displayRoles() {
		return roleRep.findAll();
	}

	@Override
	public Role displayRoleById(Long id) {
		return roleRep.findById(id).orElse(null);
	}

	// ROLE TABLE METHODS PERSONALIZED

	@Override
	public Role getRoleByName(String name) {
		return roleRep.getRoleByName(name);
	}

}
