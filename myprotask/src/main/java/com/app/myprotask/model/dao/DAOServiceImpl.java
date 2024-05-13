package com.app.myprotask.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.myprotask.model.Caracteristic;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.Request;
import com.app.myprotask.model.Task;
import com.app.myprotask.model.User;
import com.app.myprotask.model.repositories.CaracteristicRepository;
import com.app.myprotask.model.repositories.ProjectRepository;
import com.app.myprotask.model.repositories.RequestRepository;
import com.app.myprotask.model.repositories.TaskRepository;
import com.app.myprotask.model.repositories.UserRepository;

/**
 * 
 */
@Service
public class DAOServiceImpl implements DAOService {

	@Autowired
	CaracteristicRepository caracteristicRep;

	@Autowired
	ProjectRepository projectRep;

	@Autowired
	RequestRepository requestRep;

	@Autowired
	TaskRepository taskRep;

	@Autowired
	UserRepository userRep;

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

	// CARACTERISTIC TABLE METHODS

	@Override
	public void addCaracteristic(Caracteristic caracteristic) {
		caracteristicRep.save(caracteristic);
	}

	@Override
	public void updateCaracteristic(Caracteristic caracteristic) {
		caracteristicRep.save(caracteristic);
	}

	@Override
	public void deleteCaracteristic(Caracteristic caracteristic) {
		caracteristicRep.delete(caracteristic);
	}

	@Override
	public List<Caracteristic> displayCaracteristics() {
		return caracteristicRep.findAll();
	}

	@Override
	public Caracteristic displayCaracteristicById(Long id) {
		return caracteristicRep.findById(id).orElse(null);
	}

	// CARACTERISTIC TABLE METHODS PERSONALIZED

	//////////////////////////////////////////////////////////////////////////////

	// PROJECT TABLE METHODS

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

	// REQUEST TABLE METHODS

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

	// TASK TABLE METHODS

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

}
