package com.mytaskmanager.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytaskmanager.app.controllers.TasksService;
import com.mytaskmanager.app.entities.Tasks;

@RestController
@RequestMapping("/mytask")
public class TaskController {
	
	@GetMapping("/test")
	public String getRequest()
	{
		System.out.println("Test GetRequest() Hitted");
		return "MyTaskManagement is Been Hitted"; 
	}
	
	@Autowired

	private TasksService tasksServiceObj;


	@PostMapping("/task")
	public Tasks addNewTask(@RequestBody Tasks taskObj)
	{

		System.out.println("AddNewTask() Hitted \n"+taskObj);

	// return tasksServiceObj.saveTask(taskObj);
		return null;

	}

	@GetMapping("/all")
	public List<Tasks> getAllTasks()
	{
		System.out.println("GetAllTask() Hitted");
		//return tasksServiceObj.getTasks();
		return null;
	}
	

	@DeleteMapping("/{taskId}")
	public String deleteTask(@PathVariable Long taskId)
	{
		System.out.println("deleteTask() Hitted");
		try {
			//tasksServiceObj.deleteTask(taskId);
		} catch (Exception e) {
			return "Error while Deleting the Task";
		}
		
		return "Successfully Deleted Task";
		
	}
	
	@GetMapping("/{taskId}")
	public Tasks getTask(@PathVariable Long taskId)
	{

		System.out.println("GetTask() Hitted");

		//return tasksServiceObj.getTaskById(taskId);
                 return null;
	}



}
