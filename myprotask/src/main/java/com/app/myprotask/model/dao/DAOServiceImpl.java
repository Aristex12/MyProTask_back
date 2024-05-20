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
	CharacteristicRepository characteristicRep;

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
	public List<User> searchUsersByCharacteristics(List<Long> characteristicsIds, int size) {
		return userRep.searchUsersByCharacteristics(characteristicsIds, size);
	}

	@Override
	public void updateActiveUser(User user) {
		if (user.isActive()) {
			user.setActive(false);

			for (UserProject up : displayUserProjectByUserId(user.getIdUser())) {
				up.setActive(false);
				updateUserProject(up);
			}

		} else {
			user.setActive(true);
		}
		updateUser(user);

	}

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
	public void addCharacteristic(Characteristic caracteristic) {
		characteristicRep.save(caracteristic);
	}

	@Override
	public void updateCharacteristic(Characteristic caracteristic) {
		characteristicRep.save(caracteristic);
	}

	@Override
	public void deleteCharacteristic(Characteristic caracteristic) {
		characteristicRep.delete(caracteristic);
	}

	@Override
	public List<Characteristic> displayCharacteristics() {
		return characteristicRep.findAll();
	}

	@Override
	public Characteristic displayCharacteristicById(Long id) {
		return characteristicRep.findById(id).orElse(null);
	}

	// CARACTERISTIC TABLE METHODS PERSONALIZED

	@Override
	public List<Characteristic> displayCharacteristicsByIdUser(Long idUser) {
		return characteristicRep.displayCharacteristicsByIdUser(idUser);
	}

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
	public List<Project> searchProjectsByCharacteristics(List<Long> characteristicsIds, int size) {
		return projectRep.searchProjectsByCharacteristics(characteristicsIds, size);
	}

	@Override
	public void updateActiveProject(Project project) {

		if (project.isActive()) {
			project.setActive(false);

			for (UserProject up : displayUserProjectByProjectId(project.getIdProject())) {
				up.setActive(false);
				updateUserProject(up);
			}
		} else {
			project.setActive(true);
		}
		updateProject(project);
	}

	@Override
	public List<Project> displayInactiveProjectsByUserId(Long idUser) {
		return projectRep.displayInactiveProjectsByUserId(idUser);
	}

	@Override
	public List<Project> displayActiveProjectsByUserId(Long idUser) {
		return projectRep.displayActiveProjectsByUserId(idUser);
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
	public List<Task> displayActiveTasksByUserId(Long idUser) {
		return taskRep.displayActiveTasksByUserId(idUser);
	}

	@Override
	public List<Task> displayActiveTasksByProjectId(Long idProject) {
		return taskRep.displayActiveTasksByProjectId(idProject);
	}

	@Override
	public List<Task> displayTasksByUserId(Long idUser) {
		return taskRep.displayTasksByUserId(idUser);
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

	@Override
	public void updateActiveUserProject(UserProject userProject) {
		// We will update true or false based on the conditions, if it cannot be done no update will be performed
		if (userProject.isActive()) {
			userProject.setActive(false);
			updateUserProject(userProject);
		} else {
			if (displayUserById(userProject.getUser().getIdUser()).isActive() && displayProjectById(userProject.getProject().getIdProject()).isActive()) {
				userProject.setActive(true);
				updateUserProject(userProject);
			}
		}		
	}

	@Override
	public List<UserProject> displayUserProjectByProjectId(Long idProject) {
		return userProjectRep.displayUserProjectByProjectId(idProject);
	}

	@Override
	public List<UserProject> displayUserProjectByUserId(Long idUser) {
		return userProjectRep.displayUserProjectByUserId(idUser);
	}

	@Override
	public List<UserProject> displayActiveUserProject() {
		return userProjectRep.displayActiveUserProject();
	}

	@Override
	public List<UserProject> displayActiveUserProjectByUserId(Long idUser) {
		return userProjectRep.displayActiveUserProjectByUserId(idUser);
	}

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

	@Override
	public List<UserTask> displayActiveUserTasksByUserId(Long idUser) {
		return userTaskRep.displayActiveUserTasksByUserId(idUser);
	}

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

	@Override
	public Integer displayRoleUserProjectByIdUser(Long idUser) {
		return roleRep.displayRoleUserProjectByIdUser(idUser);
	}

}
