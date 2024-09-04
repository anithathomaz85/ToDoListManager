package com.ust.techademy.assignmentone.todolistmanager.exception;

/**
 * Custom exception to handle task out of capacity.
 */
public class TaskIndexOutOfBoundsException extends Exception {
	public TaskIndexOutOfBoundsException(String message) {
		super(message);
	}

}
