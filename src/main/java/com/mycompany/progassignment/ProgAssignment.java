/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.progassignment;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */
public class ProgAssignment {

    public static void main(String[] args) {
        //PART 1
        
        //Login instance
        LoginExternalClass check_all = new LoginExternalClass(" ", " ", " ", " ");

        //Object for scanner
        Scanner scan = new Scanner(System.in);
        
        JDialog window = new JDialog();
        window.setAlwaysOnTop(true);

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
            System.out.println("Enter your username : ");
            username = scan.next();
            System.out.println("Enter your password : ");
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
        
        
        boolean loginCheck = check_all.loginUser(username, password);
        // Attempt to log in with entered credentials
        if (check_all.loginUser(username, password)) {
            System.out.println("Welcome " + firstName + " " + lastName + ". It is great to see you again.");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }

        //============ PART 2 ================
        if(loginCheck){
        Task task = new Task();
        TaskManagement taskManage = new TaskManagement();
        
        JOptionPane.showMessageDialog(null, "Welcome to Easy Kanban");
        Task[] tasks = null;
        //String[] taskName = null;
        //boolean[] taskDescription = null;
        String[] developerName = null;
        //int[] taskDuration = null;
        int[] status = null;
        String[] taskID = null;
        int size = 0;
        int totalDuration = 0;
        int duration;
        int count = 0;
        String[] options = {"To do", "Done", "Doing"};

        boolean exit = false;
        while (!exit) {
            int option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Add task \n "
                            + "2. Show report\n "
                            + "3. View all completed tasks\n "
                            + "4. Display task with longest duration\n "
                            + "5. Search for task\n "
                            + "6. Search for task by developer name\n "
                            + "7. Delete a task\n\n "
                            + "0. Exit", "Welcome to EasyKanban", JOptionPane.PLAIN_MESSAGE));

            switch (option) {
                case 1:
                    task.addTask();
                case 2:
                    // Show a message for "Coming soon" for the report
                    //JOptionPane.showMessageDialog(null, "Show report feature is coming soon!", "Feature Under Development", JOptionPane.INFORMATION_MESSAGE);
                    taskManage.displayReport();
                    break;
                case 3:
                    taskManage.displayDoneTasks();
                case 4:
                    taskManage.displayLongestDurationTask();
                case 5:
                    taskManage.searchTaskByName();
                case 6:
                    taskManage.searchTasksByDeveloper();
                case 7:
                    taskManage.deleteTaskByName();
                case 0:
                    JOptionPane.showMessageDialog(null, "Exiting program. Goodbye!");
                    exit = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
            }
        }
    }
        
        
        
        
    }
}
