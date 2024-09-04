/**
 * 
 */
package com.ust.techademy.assignmentone.todolistmanager.model;

/**
 * Task class
 */
public class Task {

	private String taskName;
	private String dueDate;

	/**
	 * @param taskName
	 * @param dueDate
	 */
	public Task(String taskName, String dueDate) {
		this.taskName = taskName;
		this.dueDate = dueDate;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * @return the dueDate
	 */
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Task: " + taskName + "\tDue date: " + dueDate + "\n";
	}
}
