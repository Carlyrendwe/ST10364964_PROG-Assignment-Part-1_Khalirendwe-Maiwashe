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
        LoginExternalClass check_all = new LoginExternalClass();
        
        //Object for scanner
        Scanner scan = new Scanner(System.in);
        
        // Declarations
        String username = "car_l";
        String password = "Ladydee7*";
        String firstName = "Khali";
        String lastName = "Maiwashe";
        
        //Prompts for first and last name
        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();
        
        do{
            System.out.println("Enter your username: ");
            username = scan.next();
        } while(!check_all.checkUsername(username));
        
        do{
            System.out.println("Enter your password: ");
            password = scan.next();
        } while(!check_all.checkPassword(password));
        
        // Authentication check
        if (check_all.authenticate(username, password)) {
            System.out.println("Welcome " + firstName + " " + lastName + ". It is great to see you again.");
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }
}
}
