/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progassignment;

import java.util.*;

/**
 *
 * @author RC_Student_lab
 */
public class ProgAssignment {

    public static void main(String[] args) {
        //Login instance
        LoginExternalClass check_all = new LoginExternalClass(" ", " ", " ", " ");
        
        //Object for scanner
        Scanner scan = new Scanner(System.in);
        
        // Declarations
        String username;
        String password;
        String firstName;
        String lastName;
        
        //Prompts for first and last name
        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();
        
        // Register the user (ensuring both username and password are valid)
        String registrationResult;
        do {
            System.out.println("Enter your username (must contain an underscore and no more than 5 characters): ");
            username = scan.next();
            System.out.println("Enter your password (at least 8 characters, including a capital letter, a number, and a special character): ");
            password = scan.next();

            // Register the user with provided credentials
            registrationResult = check_all.registerUser(username, password, firstName, lastName);

            System.out.println(registrationResult); // Show registration result
        } while (!registrationResult.equals("Registration successful!")); // Repeat if not successful
        
        // After successful registration, prompt user to log in
        System.out.println("===Now, please log in.===");
        System.out.println("Enter your username to login: ");
        username = scan.next();
        System.out.println("Enter your password to login: ");
        password = scan.next();
        
        
        
        // Attempt to log in with entered credentials
        if (check_all.loginUser(username, password)) {
            System.out.println("Welcome " + firstName + " " + lastName + ". It is great to see you again.");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
    }
}
