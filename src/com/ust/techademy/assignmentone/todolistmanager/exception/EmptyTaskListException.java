package com.ust.techademy.assignmentone.todolistmanager.exception;

/**
 * Custom exception to handle empty task list
 */
public class EmptyTaskListException extends Exception {
	public EmptyTaskListException(String message) {
		super(message);
	}
}
