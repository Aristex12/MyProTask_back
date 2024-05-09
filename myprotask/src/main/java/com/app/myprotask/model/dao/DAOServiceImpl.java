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

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> showUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User displayUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCaracteristic(Caracteristic caracteristic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCaracteristic(Caracteristic caracteristic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCaracteristic(Caracteristic caracteristic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Caracteristic> showCaracteristics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Caracteristic displayCaracteristicById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProject(Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Project> showProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project displayProjectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRequest(Request request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRequest(Request request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRequest(Request request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Request> showRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Request displayRequestById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTask(Task request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTask(Task request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTask(Task request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Task> showTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task displayTaskById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
