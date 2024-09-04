/**
 * Model class- Task class
 */
package com.ust.techademy.assignmentone.todolistmanager.model;

/**
 * Task class
 */
public class Task {

	private String taskName;
	private String dueDate;
	private int priority; // Add priority field

	/**
	 * @param taskName
	 * @param dueDate
	 */
	public Task(String taskName, String dueDate, int priority) {
		this.taskName = taskName;
		this.dueDate = dueDate;
		this.priority = priority;
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

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Task: " + taskName + "\tDue date: " + dueDate + "\tPriority: " + priority + "\n";
	}
}
