package com.revature.controller;

import java.util.Scanner;
import com.revature.beans.Person;

public class BicycleShopController {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
        boolean exit = false;

        mainLoop: while(!exit) {
        	Person loggedInUser = null;
        	
        	System.out.println("Welcome to the Bicycle Shop.");
            
            while (loggedInUser == null) {
            	System.out.println("\nPlease login. Enter a number associated with the following options to continue.");
                System.out.println("\n1. Customer");
                System.out.println("\n2. Employee");
                System.out.println("\n\n9. Register for an Account");
                System.out.println("\n0. Exit Application");
                
                int input = Integer.valueOf(scan.nextLine());
                
                switch (input) {
				case 1:
					//loggedInUser = registerUser();
						break;
				case 2:
						//loggedInUser = logInUser();
						break;
				default:
						exit = true;
						break mainLoop;
				}
            }
        }
        
	}

}
