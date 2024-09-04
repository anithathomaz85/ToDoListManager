package com.ust.techademy.assignmentone.todolistmanager.exception;

/**
 * Custom exception to handle invalid task index
 */
public class InvalidTaskIndexException extends Exception {
	public InvalidTaskIndexException(String message) {
		super(message);
	}

}
