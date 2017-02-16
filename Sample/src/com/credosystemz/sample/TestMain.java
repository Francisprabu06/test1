package com.credosystemz.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestMain {

	ArrayList<User> userList = new ArrayList<User>();
	Scanner scanner = new Scanner(System.in);

	public void getUserDetails() {

		User user = new User();

		System.out.println("Enter user details below :");

		System.out.println("Enter user id :");
		user.setUserId(scanner.nextInt());

		System.out.println("Enter user name :");
		user.setUserName(scanner.next());

		System.out.println("Enter user pwd :");
		user.setUserPassword(scanner.next());

		System.out.println("Enter user Address :");
		user.setUserAddress(scanner.next());

		userList.add(user);

	}

	public void searchUser() {

		System.out.println("Enter the user's name to search:");

		String searchName = scanner.next();
		
		
		Iterator iterator = userList.iterator();
		
	
		for (int index = 0; index < userList.size(); index++) {

			User u1 = userList.get(index);

			if (u1.getUserName().equals(searchName)) {

				System.out.println("User ID = " + u1.getUserId()
						+ "\n User Name = " + u1.getUserName()
						+ "\n User Pwd = " + u1.getUserPassword()
						+ "\n User Address = " + u1.getUserAddress());

			}

		}

	}

	public int getUserInput(String msg) {

		System.out.println(msg);

		return scanner.nextInt();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestMain testMain = new TestMain();

		for (int a = 0; a < 2; a++) {

			int userChoice = testMain
					.getUserInput("Enter 1 for user details input ;  2 for search");

			if (userChoice == 1) {

				System.out
						.println("Enter no of Users you are going to insert :");

				int noUsers = testMain.scanner.nextInt();

				for (int i = 1; i <= noUsers; i++) {

					testMain.getUserDetails();
				}

			} else if (userChoice == 2) {

				testMain.searchUser();

			} else {
				
				System.out.println("Only input of 1 or 2 is allowed. Please try again.");
			}

		}

	}

}
