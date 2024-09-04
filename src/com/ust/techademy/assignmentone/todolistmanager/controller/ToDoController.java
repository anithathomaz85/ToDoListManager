/**
 * Controller class- ToDoController.java
 */
package com.ust.techademy.assignmentone.todolistmanager.controller;

import com.ust.techademy.assignmentone.todolistmanager.exception.EmptyTaskListException;
import com.ust.techademy.assignmentone.todolistmanager.exception.InvalidDateException;
import com.ust.techademy.assignmentone.todolistmanager.exception.InvalidTaskIndexException;
import com.ust.techademy.assignmentone.todolistmanager.model.Task;
import com.ust.techademy.assignmentone.todolistmanager.service.ToDoService;

/**
 * The ToDoController class acts in between user input and ToDoService class
 */
public class ToDoController {

	private ToDoService toDoService;

	public ToDoController() {
		toDoService = new ToDoService();
	}

	// Adds a new to-do item to the list.
	public boolean addTask(String taskName, String dueDate, int priority)
			throws InvalidTaskIndexException, InvalidDateException {
		Task task = new Task(taskName, dueDate, priority);
		return toDoService.addTask(task);
	}

	// Adds a new to-do item to the list.
	public boolean removeTask(int index) throws InvalidTaskIndexException {
		return toDoService.removeTask(index - 1);
	}

	// Display all to-do items
	public void displayTasks() throws EmptyTaskListException {
		toDoService.displayTasks();
	}
}
