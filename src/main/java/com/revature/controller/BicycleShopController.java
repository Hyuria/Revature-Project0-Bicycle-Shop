package com.revature.controller;

import java.util.Scanner;

import javax.naming.AuthenticationException;

import com.revature.beans.Person;
import com.revature.beans.Role;
import com.revature.exceptions.NonUniqueUsernameException;
import com.revature.services.PersonService;
import com.revature.utils.ConnectionUtil;

public class BicycleShopController {
	private static Scanner scan;
	private static PersonService personService = new PersonService();

	public static void main(String[] args) {
		scan = new Scanner(System.in);
        boolean exit = false;
        
        mainLoop: while(!exit) {
        	Person loggedInUser = null;
        	
        	System.out.println("Welcome to the Bicycle Shop.");
        	
        	
            
            loginPage: while (loggedInUser == null) {
            	System.out.println("\nPlease login. Enter a number associated with the following options to continue.");
                System.out.println("\n1. Log In");
                System.out.println("\n2. Register for an Account");
                System.out.println("\n\nAll Other Number - Exit Application");
                
                int input = Integer.valueOf(scan.nextLine());
                
                switch (input) {
				case 1:
						loggedInUser = logInUser();
						break;
				case 2:
						loggedInUser = registerUser();
						break;
				default:
						break mainLoop;
				}
            }
        	
        	boolean mainMenuExit = false;
        	//Finished logging in user
        	mainPage: while (!mainMenuExit) {
        		
        		System.out.println("Welcome " + loggedInUser.getUsername() + " . Main menu:");
        		
        		break;
        		
        	}
        	
        	
        	
        	
        	
        }
        
	}
	
	private static Person logInUser() {
		Boolean goBack = false;
		Person loggedInUser = null;
	
		while (!goBack) {
			System.out.println("Please Log In Below - ");
			System.out.println("Please enter your username:");
			String username = scan.nextLine();
			System.out.println("Please enter your password:");
			String password = scan.nextLine();
			loggedInUser = personService.login(username, password);
			if(loggedInUser == null) {
				System.out.println("Error: invalid logins.");
				System.out.println("Would you like to try again or go back?");
				System.out.println("1. Try logging in again.");
				System.out.println("\nAnything else to go back");
				int input = Integer.valueOf(scan.nextLine());
				switch (input) {
				case 1: break;

				default:
						goBack = true;
						break;
				}
			}else {
				goBack = true;
			}
		}
		return loggedInUser;
	}
	
	private static Person registerUser() {
		System.out.println("Register a new user.");
		enterInfo: while (true) {
			System.out.println("Please enter your username:");
			String username = scan.nextLine();
			System.out.println("Please enter your password:");
			String password = scan.nextLine();
			System.out.println("Login information correct?");
			System.out.println("Username: " + username);
			System.out.println("Password: "+ password);
			System.out.println("\n1. Yes");
			System.out.println("\n2. No");
			System.out.println("\nAny Other Number To Go Back");
			int input = Integer.valueOf(scan.nextLine());
			switch (input) {
			case 1: 
					Person newPerson = new Person();
					Role role = new Role();
					newPerson.setRole(role);
					newPerson.setUsername(username);
					try {
						personService.addPerson(newPerson);
					} catch (NonUniqueUsernameException e) {
						System.out.println("This username is unavaliable. Please try again.");
						break;
					}
					personService.updatePassword(newPerson, password);
					return newPerson;
			case 2: 
					break;
			default:
					return null;
			}
		}
		
	}

}
