package com.app.myprotask.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.myprotask.model.Category;
import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.Evaluation;
import com.app.myprotask.model.Event;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.Request;
import com.app.myprotask.model.Role;
import com.app.myprotask.model.Task;
import com.app.myprotask.model.User;
import com.app.myprotask.model.UserCharacteristic;
import com.app.myprotask.model.UserProject;
import com.app.myprotask.model.UserTask;
import com.app.myprotask.model.repositories.CategoryRepository;
import com.app.myprotask.model.repositories.CharacteristicRepository;
import com.app.myprotask.model.repositories.EvaluationRepository;
import com.app.myprotask.model.repositories.EventRepository;
import com.app.myprotask.model.repositories.ProjectRepository;
import com.app.myprotask.model.repositories.RequestRepository;
import com.app.myprotask.model.repositories.RoleRepository;
import com.app.myprotask.model.repositories.TaskRepository;
import com.app.myprotask.model.repositories.UserCharacteristicsRepository;
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

	@Autowired
	UserCharacteristicsRepository userCharRep;

	@Autowired
	EventRepository eventRep;

	@Autowired
	CategoryRepository categoryRep;

	@Autowired
	EvaluationRepository evaluationRep;

	// USER TABLE METHODS CRUD

	@Override
	public void addUser(User user) {
		int contUsers = countUserByNameLastName(user.getName(), user.getLastName());

		if (contUsers != 0) {
			user.setEmail(user.generateEmailDuplicate(++contUsers));
		}

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
	public List<User> displayUsersByCharacteristics(List<Long> characteristicIds) {
		return userRep.displayUsersByCharacteristics(characteristicIds);
	}

	@Override
	public List<User> displayUsersByIdProject(Long idProject) {
		return userRep.displayUsersByIdProject(idProject);
	}

	@Override
	public Integer countUserByNameLastName(String name, String lastName) {
		return userRep.countUserByNameLastName(name, lastName);
	}

	@Override
	public List<User> searchUsersByCharacteristics(List<Long> characteristicsIds, int size) {
		return userRep.searchUsersByCharacteristics(characteristicsIds, size);
	}

	@Override
	public void updateActiveUser(User user) {
		if (user.isActive()) {
			user.setActive(false);

			for (UserProject up : displayUserProjectByIdUser(user.getIdUser())) {
				up.setActive(false);
				updateUserProject(up);
			}
			for (UserTask ut : displayUserTasksByUserId(user.getIdUser())) {
				ut.setActive(false);
				updateUserTask(ut);
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

	@Override
	public List<Characteristic> displayMissingCharacteristicsByIdUser(Long idUser) {
		return characteristicRep.displayMissingCharacteristicsByIdUser(idUser);
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
	public List<Project> displayProjectsByActiveUserProjectsByIdUser(Long idUser) {
		return projectRep.displayProjectsByActiveUserProjectsByIdUser(idUser);
	}

	@Override
	public List<Project> displayProjectsByIdUser(Long idUser) {
		return projectRep.displayProjectsByIdUser(idUser);
	}

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

			for (Task t : displayTasksByIdProject(project.getIdProject())) {
				t.setActive(false);
				updateTask(t);

				for (UserTask ut : displayUserTasksByTaskId(t.getIdTask())) {
					ut.setActive(false);
					updateUserTask(ut);
				}
			}

		} else {
			project.setActive(true);
		}
		updateProject(project);
	}

	@Override
	public List<Project> displayInactiveProjectsByIdUser(Long idUser) {
		return projectRep.displayInactiveProjectsByIdUser(idUser);
	}

	@Override
	public List<Project> displayActiveProjectsByIdUser(Long idUser) {
		return projectRep.displayActiveProjectsByIdUser(idUser);
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

	@Override
	public List<Request> displayRequestsByProjectsIdUser(Long idUser) {

		List<Request> requestsUser = new ArrayList<>();
		List<Request> requestsProjects = new ArrayList<>();
		List<Project> projects = displayProjectsByIdUser(idUser);

		for (Project project : projects) {

			requestsProjects = displayRequestsByIdProject(project.getIdProject());
			for (Request request : requestsProjects) {
				requestsUser.add(request);
			}
		}
		return requestsUser;
	}

	@Override
	public List<Request> displayRequestsByIdProject(Long idProject) {
		return requestRep.displayRequestsByIdProject(idProject);
	}

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
	public void updateActiveTask(Task task) {
		if (task.isActive()) {

			task.setActive(false);

			for (UserTask ut : displayUserTasksByTaskId(task.getIdTask())) {
				ut.setActive(false);
				updateUserTask(ut);
			}
		} else {
			if (task.getProject().isActive()) {
				task.setActive(true);
			}
		}
		updateTask(task);

	}

	@Override
	public List<Task> displayTasksByProjectsByIdUser(Long idUser) {
		return taskRep.displayTasksByProjectsByIdUser(idUser);
	}

	@Override
	public Integer countActiveTasksByIdProject(Long idProject) {
		return taskRep.countActiveTasksByIdProject(idProject);
	}

	@Override
	public List<Task> displayTasksByIdProject(Long idProject) {
		return taskRep.displayTasksByIdProject(idProject);
	}

	@Override
	public List<Task> displayActiveTasksActiveProjectByIdUser(Long idUser) {
		return taskRep.displayActiveTasksActiveProjectByIdUser(idUser);
	}

	@Override
	public List<Task> displayActiveTasksByIdUser(Long idUser) {
		return taskRep.displayActiveTasksByIdUser(idUser);
	}

	@Override
	public List<Task> displayActiveTasksByIdProject(Long idProject) {
		return taskRep.displayActiveTasksByIdProject(idProject);
	}

	@Override
	public List<Task> displayTasksByIdUser(Long idUser) {
		return taskRep.displayTasksByIdUser(idUser);
	}

	//////////////////////////////////////////////////////////////////////////////

	// PROJECTTASK TABLE METHODS CRUD

	@Override
	public Integer countActiveUserProjectByIdProject(Long idProject) {
		return userProjectRep.countActiveUserProjectByIdProject(idProject);
	}

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
	public List<UserProject> displayActiveUserProjectByIdProject(Long idProject) {
		return userProjectRep.displayActiveUserProjectByIdProject(idProject);
	}

	@Override
	public List<UserProject> displayUserProjectByActiveProjectByIdUser(Long idUser) {

		List<UserProject> userProjectByProjectIdByIdUser = new ArrayList<>();
		for (Project p : projectRep.displayActiveProjectsByIdUser(idUser)) {
			for (UserProject up : userProjectRep.displayUserProjectByProjectId(p.getIdProject())) {
				userProjectByProjectIdByIdUser.add(up);
			}
		}
		return userProjectByProjectIdByIdUser;
	}

	@Override
	public void updateActiveUserProject(UserProject userProject) {
		// We will update true or false based on the conditions, if it cannot be done no
		// update will be performed
		if (userProject.isActive()) {
			userProject.setActive(false);
			updateUserProject(userProject);
		} else {
			if (displayUserById(userProject.getUser().getIdUser()).isActive()
					&& displayProjectById(userProject.getProject().getIdProject()).isActive()) {
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
	public List<UserProject> displayUserProjectByIdUser(Long idUser) {
		return userProjectRep.displayUserProjectByUserId(idUser);
	}

	@Override
	public List<UserProject> displayActiveUserProject() {
		return userProjectRep.displayActiveUserProject();
	}

	@Override
	public List<UserProject> displayActiveUserProjectByIdUser(Long idUser) {
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
	public UserTask displayUserTaskByIdTaskIdUser(Long idTask, Long idUser) {
		return userTaskRep.displayUserTaskByIdTaskIdUser(idTask, idUser);
	}

	@Override
	public List<UserTask> displayUserTasksByUserId(Long idUser) {
		return userTaskRep.displayUserTasksByUserId(idUser);
	}

	@Override
	public List<UserTask> displayUserTasksByTaskId(Long idTask) {
		return userTaskRep.displayUserTasksByTaskId(idTask);
	}

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

	//////////////////////////////////////////////////////////////////////////////

	// USERCHARACTERISTIC TABLE METHODS CRUD

	@Override
	public void addUserCharacteristic(UserCharacteristic userCharacteristic) {
		userCharRep.save(userCharacteristic);
	}

	@Override
	public void updateUserCharacteristic(UserCharacteristic userCharacteristic) {
		userCharRep.save(userCharacteristic);

	}

	@Override
	public void deleteUserCharacteristic(UserCharacteristic userCharacteristic) {
		userCharRep.delete(userCharacteristic);

	}

	@Override
	public List<UserCharacteristic> displayUserCharacteristics() {
		return userCharRep.findAll();
	}

	@Override
	public UserCharacteristic displayUserCharacteristicById(Long id) {
		return userCharRep.findById(id).orElse(null);
	}

	// USERCHARACTERISTIC TABLE METHODS PERSONALIZED

	@Override
	public UserCharacteristic displayUserCharacteristicByIdUserIdCharacteristic(Long idUser, Long idCharacteristic) {
		return userCharRep.displayUserCharacteristicByIdUserIdCharacteristic(idUser, idCharacteristic);
	}

	@Override
	public void addUserCharacteristicByIdUser(Long idUser, Long idCharacteristic, Integer experience) {
		userCharRep.save(new UserCharacteristic(displayUserById(idUser), displayCharacteristicById(idCharacteristic),
				experience));
	}

	@Override
	public void deleteUserCharacteristicByIdUser(Long idUser, Long idCharacteristic) {
		userCharRep.delete(displayUserCharacteristicByIdUserIdCharacteristic(idUser, idCharacteristic));
	}

	//////////////////////////////////////////////////////////////////////////////

	// EVENT TABLE METHODS CRUD

	@Override
	public void addEvent(Event event) {
		eventRep.save(event);
	}

	@Override
	public void updateEvent(Event event) {
		eventRep.save(event);
	}

	@Override
	public void deleteEvent(Event event) {
		eventRep.delete(event);
	}

	@Override
	public List<Event> displayEvents() {
		return eventRep.findAll();
	}

	@Override
	public Event displayEventById(Long id) {
		return eventRep.findById(id).orElse(null);
	}

	// EVENT TABLE METHODS PERSONALIZED

	@Override
	public List<Event> displayEventsByIdUser(Long idUser) {
		return eventRep.displayEventsByIdUser(idUser);
	}

	// CATEGORY TABLE METHODS CRUD

	@Override
	public void addCategory(Category category) {
		categoryRep.save(category);
	}

	@Override
	public void updateCategory(Category category) {
		categoryRep.save(category);
	}

	@Override
	public void deleteCategory(Category category) {
		categoryRep.save(category);
	}

	@Override
	public List<Category> displayCategories() {
		return categoryRep.findAll();
	}

	@Override
	public Category displayCategoryById(Long id) {
		return categoryRep.findById(id).orElse(null);
	}

	// CATEGORY TABLE METHODS PERSONALIZED

	// EVALUATION TABLE METHODS CRUD

	@Override
	public void addEvaluation(Evaluation evaluation) {
		evaluationRep.save(evaluation);
	}

	@Override
	public void updateEvaluationr(Evaluation evaluation) {
		evaluationRep.save(evaluation);
	}

	@Override
	public void deleteEvaluation(Evaluation evaluation) {
		evaluationRep.delete(evaluation);
	}

	@Override
	public List<Evaluation> displayEvaluations() {
		return evaluationRep.findAll();
	}

	@Override
	public Evaluation displayEvaluationById(Long id) {
		return evaluationRep.findById(id).orElse(null);
	}

	// EVALUATION TABLE METHODS PERSONALIZED

	@Override
	public List<Evaluation> displayEvaluationsByIdUser(Long idUser) {
		return evaluationRep.displayEvaluationsByIdUser(idUser);
	}

}
