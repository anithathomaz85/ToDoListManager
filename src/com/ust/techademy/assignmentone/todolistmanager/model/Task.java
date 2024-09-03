/**
 * 
 */
package com.ust.techademy.assignmentone.todolistmanager.model;

/**
 * 
 */
public class Task {
    private String description;
    private String dueDate;
    
    
     /**
	 * Parameterised constructor
	 * @param description
	 * @param dueDate
	 */
	public Task(String description, String dueDate) {
		this.description = description;
		this.dueDate = dueDate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
		 return "Task: " + description + ", Due: " + dueDate;
	}   
}
