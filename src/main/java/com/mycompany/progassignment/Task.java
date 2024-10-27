/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progassignment;


import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class Task {
    private static String[] taskName;
    private static int[] taskNumber;
    private static String[] taskDescription;
    private static String[] developerDetails;
    private static double[] taskDuration;
    private static String[] taskID;
    private static String[] taskDetails;
    private static int count = 0;
    private static int duration;
    private static String[] choice;
    
    
    
    // Method to add a single task
    public void addTask() {
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks would you like to create?"));

                     // Loop to add the specified number of tasks
                     for (int i = 0; i < numTasks; i++) {
                     //task.addTask();
                     taskName = new String[numTasks];
                    taskName[i] = JOptionPane.showInputDialog("Enter Task Name:");
                     
                     taskDescription = new String[numTasks];
                     developerDetails = new String[numTasks];
                     taskID = new String[numTasks];
                     taskDetails = new String[numTasks];
                     taskNumber = new int[numTasks];
                     taskDuration = new double[numTasks];
                     choice = new String[numTasks];
                     
                     
                     boolean descCheck = false;
                    String description = " "; // Initialize the description variable

                    while (!descCheck) {
                        description = JOptionPane.showInputDialog("Enter Task Description:");
                        
                        if (description ==null) {
                            JOptionPane.showMessageDialog(null, "Task description entry was canceled.");
                            break; // Exit if canceled
                        }

                        // Check if the description is within 50 characters
                        if (description.length() <= 50) {
                            descCheck = true; // Set to true to exit the loop
                            JOptionPane.showMessageDialog(null, "Task description successfully entered");
                            taskDescription[i] = description; // Store the validated description
                        } else {
                            JOptionPane.showMessageDialog(null, "Description is too long! Please enter 50 characters or less.");
                        }
                    }
                    
                     
                     developerDetails[i] = JOptionPane.showInputDialog("Enter developer's first and last name: ");
                     taskDuration[i] = returnTotalHours();
                     
                     taskNumber[i] = i;
                     taskID[i] = createTaskID(taskName[i], developerDetails[i], taskNumber[i]);
                     
                     choice[i] = taskStatus();
                     JOptionPane.showMessageDialog(null, "TASK DETAILS\n" + printTaskDetails(i, taskID[i]));
                     }
                    
    }
    
    // Method to check if the task description is valid
    public static boolean checkTaskDescription(String description) {
        return description.length() <= 50;  
    }
    
    public String createTaskID(String taskName, String developerDetails, int taskNumber) {
        String initial = taskName.length() >= 2? taskName.substring(0,2).toUpperCase(): taskName.toUpperCase();
        String suffix = developerDetails.length() >= 2? developerDetails.substring(0,2).toUpperCase(): developerDetails.toUpperCase();
        
         return initial + ":" + taskNumber + ":" + suffix; 
    }
    
    public static String taskStatus(){
        String status = " ";
        boolean valid = false;
        
        while(!valid){
            String input = JOptionPane.showInputDialog("Select a task: \n 1.To do \n 2.Doing \n 3.Done");
            int choice =Integer.parseInt(input);
            
            switch(choice){
                case 1:
                    status = "To do";
                    valid = true;
                    break;
                case 2:
                    status = "Doing";
                    valid = true;
                    break;
                case 3:
                    status = "Done";
                    valid = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option.");
                    
            }
        }
        return status;
    }
    
    // Method to print all task details
    public String printTaskDetails(int point, String taskID ) {
        return "Task Name: " + taskName[point] + "\n" +
                "Task Number: " + taskNumber[point] + "\n" +
                "Task Description: " + taskDescription[point] + "\n" +
                "Developer Details: " + developerDetails[point] + " " + "\n" +
                "Task ID: " + taskID + "\n" +
                "Task Status: " + choice[point] + "\n" +
                "Task Duration: " + taskDuration[point] + " hours";
    }
    
    // Method to return the total task duration
    public float returnTotalHours() {
        float totalHours = 0;
        
        boolean option = false;
        while(!option){
            String input = JOptionPane.showInputDialog("Enter the task in hours: ");
            totalHours = Float.parseFloat(input);
            option = true;
        }
        
        return totalHours;
    }
}
