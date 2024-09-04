/**
 * 
 */
package com.ust.techademy.assignmentone.todolistmanager.service;

import com.ust.techademy.assignmentone.todolistmanager.exception.EmptyTaskListException;
import com.ust.techademy.assignmentone.todolistmanager.exception.InvalidDateException;
import com.ust.techademy.assignmentone.todolistmanager.exception.InvalidTaskIndexException;
import com.ust.techademy.assignmentone.todolistmanager.model.Task;
import com.ust.techademy.assignmentone.todolistmanager.utility.TaskUtility;

/**
 * The ToDoService class provides functionality for managing to-do items.
 */
public class ToDoService {
	private Task[] tasks;
	private int taskCount;

	int capacity = TaskUtility.CAPACITY; // Max number of tasks.
	boolean status = TaskUtility.FAILED; // Request status

	public ToDoService() {
		tasks = new Task[capacity];
		taskCount = 0; // Initially task list is empty

	}

	// Adds a new to-do item to the list.
	public boolean addTask(Task task) throws InvalidTaskIndexException, InvalidDateException {

		if (!TaskUtility.isValidDate(task.getDueDate())) {
			throw new InvalidDateException("Error::Task addition unsuccessful::Invalid date format!!");
		}
		if (!TaskUtility.isDateTodayOrFuture(task.getDueDate())) {
			throw new InvalidDateException("Error::Task addition unsuccessful::Enter a date today or future date!!");
		}

		if (taskCount < tasks.length) {
			tasks[taskCount++] = task;
			status = TaskUtility.SUCCESS;
		} else {
			status = TaskUtility.FAILED;
			throw new InvalidTaskIndexException("Error::Task addition unsuccessful::Task list is full!!");
		}
		return status;
	}

	// Removes to-do item by id from list.
	public boolean removeTask(int index) throws InvalidTaskIndexException {
		if (index >= 0 && index < taskCount) {
			for (int i = index; i < taskCount - 1; i++) {
				tasks[i] = tasks[i + 1];
			}
			tasks[--taskCount] = null;
			status = TaskUtility.SUCCESS;
		} else {
			status = TaskUtility.FAILED;
			throw new InvalidTaskIndexException("Error::Invalid task index");
		}
		return status;
	}

	// Display all to-do items
	public void displayTasks() throws EmptyTaskListException {
		if (taskCount == 0) {
			throw new EmptyTaskListException("Error::No tasks to display!!");
		} else {
			for (int i = 0; i < taskCount; i++) {
				System.out.println((i + 1) + ". " + tasks[i]);
			}
		}
	}

	public void changeStatus() {

	}
}
