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
    
    // Variables to store correct username, password, and user's first and last name
    static String username = "carly";
    static String password = "ladydee77";
    static String firstName = "Khali";
    static String lastName = "Maiwashe";

    // Function to authenticate the user's login
    public static boolean passwordandusernameCheck(String username, String password) {
        return username.equals(username) && password.equals(password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarations
        String username = "carly";
        String password = "ladydee77";
        String firstName = "Khali";
        String lastName = "Maiwashe";
        
        // Prompt user for input
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
        
        // Validate username
        boolean usernameValid = validateUsername(username);
        if (usernameValid) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }

        // Validate password
        boolean passwordValid = validatePassword(password);
        if (passwordValid) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
        }
    }
    
    // Method to validate username
    public static boolean validateUsername(String username) {
        // Check if username contains an underscore and is no more than 5 characters long
        return username.contains("_") && username.length() <= 5;
    }
    
    // Method to validate password
    public static boolean validatePassword(String password) {
        // Check password length
        if (password.length() < 8) {
            return false;
        }
        // Check for at least one capital letter, one number, and one special character
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }
        
        return hasUpperCase && hasNumber && hasSpecialChar;
    }
}
