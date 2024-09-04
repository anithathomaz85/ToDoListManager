/**
 * 
 */
package com.ust.techademy.assignmentone.todolistmanager.utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Utility class for to-do application
 */
public class TaskUtility {

	// Task list capacity
	public static final int CAPACITY = 2;

	// date format used in to-do application
	public static final String dateFormat = "dd-MM-yyyy";

	// status messages
	public static final boolean SUCCESS = true;
	public static final boolean FAILED = false;

	// Check the given date is valid date
	public static boolean isValidDate(String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
		try {
			LocalDate.parse(dateStr, formatter);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}

	// Check the given date is today or a future date
	public static boolean isDateTodayOrFuture(String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
		try {
			LocalDate givenDate = LocalDate.parse(dateStr, formatter);
			LocalDate today = LocalDate.now();

			return !givenDate.isBefore(today); // True if the date is today or in the future
		} catch (DateTimeParseException e) {
			return false; // Return false if the date string is invalid
		}
	}

}
