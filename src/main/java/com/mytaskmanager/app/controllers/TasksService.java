package com.mytaskmanager.app.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytaskmanager.app.entities.Tasks;
import com.mytaskmanager.app.repositories.TaskRepository;





@Service
public class TasksService {

		@Autowired
	    private TaskRepository taskRepositoryObj;



	 //   @Cacheable(value = "tasks", key = "#taskId")

	    public Tasks getTaskById(Long taskId) {

	    	System.out.println("GetTaskById Service method Hitted");

	        return taskRepositoryObj.findById(taskId).orElse(null);

	    }



	    //@CachePut(value = "tasks", key = "#tasks.taskId")

	    public Tasks saveTask(Tasks tasks) {

	        return taskRepositoryObj.save(tasks);

	    }



	  //  @CacheEvict(value = "tasks", key = "#taskId")

	    public void deleteTask(Long taskId) {

	    	taskRepositoryObj.deleteById(taskId);

	    }



		public List<Tasks> getTasks() {
			return taskRepositoryObj.findAll();
		}

}

