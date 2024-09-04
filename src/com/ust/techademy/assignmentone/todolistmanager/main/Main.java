package com.ust.techademy.assignmentone.todolistmanager.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ust.techademy.assignmentone.todolistmanager.controller.ToDoController;
import com.ust.techademy.assignmentone.todolistmanager.exception.EmptyTaskListException;
import com.ust.techademy.assignmentone.todolistmanager.exception.InvalidDateException;
import com.ust.techademy.assignmentone.todolistmanager.exception.InvalidTaskIndexException;

/**
 * The main class for to-do application
 */
public class Main {

	public static void main(String args[]) {

		boolean sataus;
		try (Scanner scanner = new Scanner(System.in);) {
			ToDoController controller = new ToDoController();

			while (true) {
				System.out.println("\n\t## To-Do List Menu:\n");
				System.out.println("\t1. Add Task");
				System.out.println("\t2. Remove Task");
				System.out.println("\t3. Display Tasks");
				System.out.println("\t4. Exit");
				System.out.print("\nChoose an option: ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1:
					System.out.print("\nEnter task: ");
					String taskName = scanner.nextLine();
					System.out.print("Enter due date (dd-MM-YYYY): ");
					String dueDate = scanner.nextLine();
					System.out.print("Enter priority (1-5):");// Enter priority
					int priority = scanner.nextInt();
					try {
						sataus = controller.addTask(taskName, dueDate, priority);
						if (sataus) {
							// To change the colour of text in a System.out.println, use ANSI escape codes
							// \u001B[31m - green colour
							// \uD83D\uDC4D - Unicode representation of Thumbs Up emoji
							System.out.println("\u001B[32mTask added sucessfully!!\u001B[0m\uD83D\uDC4D");
						}
					} catch (InvalidTaskIndexException e) {
						System.err.println(e.getMessage());
					} catch (InvalidDateException e) {
						System.err.println(e.getMessage());
					} catch (Exception e) {
						System.err.println("Error::Task addition unsuccessful::Exception happened!!");
						e.printStackTrace();
					}
					break;
				case 2:
					System.out.print("Enter task number to remove: ");
					int index = scanner.nextInt();
					try {
						sataus = controller.removeTask(index);
						if (sataus) {
							System.out.println("\u001B[32mTask no " + index + " removed!!\u001B[0m");
						}
					} catch (InvalidTaskIndexException e) {
						System.err.println(e.getMessage());
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					try {
						System.out.println("\n\t Todo List");
						System.out.println("\t---------------");
						controller.displayTasks();
					} catch (EmptyTaskListException e) {
						System.err.println(e.getMessage());
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 4:
					System.out.println("\u001B[32mGood bye!!");
					return;
				default:
					System.err.println("Error::Invalid choice. Please try again.");
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Error::Invalid choice.Number expected(1-4)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
