/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progassignment;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManagement {
    
    public String[] taskName;
    public int[] taskNumber;
    public String[] taskDescription;
    public  String[] developerDetails;
    public  double[] taskDuration;
    public  String[] taskID;
    public  String[] taskDetails;
    private static int count = 0;
    private static int duration;
    public String[] choice;
    
     private static int totalTasks = 0; // Declare totalTasks to track number of tasks
    
    // Declare arrays
    
    int numTasks = 0;
        String[] developers = new String[numTasks];
        String[] taskNames = new String[numTasks];
        String[] taskIDs = new String[numTasks];
        int[] taskDurations = new int[numTasks];
        String[] taskStatus = new String[numTasks];
    
    public Task task; // Reference to the shared Task object

    // Constructor to initialize the shared Task object
    public TaskManagement(Task task) {
        this.task = task;
    }
    
     // Constructor to initialize the task arrays
    public TaskManagement(String[] taskNames, String[] developerDetails, double[] taskDurations, String[] taskStatus) {
        this.taskName = taskNames;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDurations;
        this.choice = taskStatus;
    }
  
    public String displayReport() {

        if (totalTasks == 0) {
        return "No tasks to display."; // Return message instead of showing dialog
    }

    String report = "Full Task Report:\n";
    for (int i = 0; i < totalTasks; i++) {
        report += "Task Number: " + i + "\n"
                + "Task Name: " + taskName[i] + "\n"
                + "Task Description: " + taskDescription[i] + "\n"
                + "Developer: " + developerDetails[i] + "\n"
                + "Task ID: " + taskID[i] + "\n"
                + "Task Duration: " + taskDuration[i] + " hours\n"
                + "Task Status: " + taskStatus[i] + "\n\n";
    }

    return report; // Return the report as a string instead of showing it
}
    
    
    public void deleteTaskByName(String taskNameToDelete) {

//String taskNameToDelete = JOptionPane.showInputDialog("Enter Task Name to Delete:");
        boolean found = false;

        for (int i = 0; i < task.taskName.length; i++) {
            if (task.taskName[i] != null && task.taskName[i].equalsIgnoreCase(taskNameToDelete)) {
                // "Delete" the task by setting array values to null
                task.taskName[i] = null;
                task.taskDescription[i] = null;
                task.developerDetails[i] = null;
                task.taskID[i] = null;
                task.taskDuration[i] = 0;
                task.choice[i] = null;
                found = true;
                JOptionPane.showMessageDialog(null, "Task '" + taskNameToDelete + "' deleted successfully.");
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }
    
    
    public String[] displayLongestDurationTask(int[] durations) {
    int maxDurationIndex = 0;

    // Find the index of the task with the longest duration
    for (int i = 1; i < durations.length; i++) {
        if (durations[i] > durations[maxDurationIndex]) {
            maxDurationIndex = i;
        }
    }

    // Return the task name and its duration
    return new String[]{taskName[maxDurationIndex], String.valueOf(taskDuration[maxDurationIndex])};
}
    /*public String displayLongestDurationTask() {

double maxDuration = -1;
        int maxIndex = -1;

        for (int i = 0; i < task.taskDuration.length; i++) {
            if (task.taskName[i] != null && task.taskDuration[i] > maxDuration) {
                maxDuration = task.taskDuration[i];
                maxIndex = i;
            }
        }

        if (maxIndex != -1) {
            return "Developer: " + developerDetails[maxIndex] +
                   "\nTask Name: " + taskName[maxIndex] +
                   "\nDuration: " + taskDuration[maxIndex] + " hours";
        } else {
            return "No tasks to analyze.";
        }
    }*/
    
    public void displayDoneTasks() {
        String doneTasks = "Completed Tasks:\n";
        boolean found = false;

        for (int i = 0; i < task.choice.length; i++) {
            if (task.choice[i] != null && task.choice[i].equalsIgnoreCase("Done")) {
                doneTasks += "Task Number: " + i + "\n"
                        + "Developer: " + task.developerDetails[i] + "\n"
                        + "Task Name: " + task.taskName[i] + "\n"
                        + "Task ID: " + task.taskID[i] + "\n"
                        + "Task Duration: " + task.taskDuration[i] + " hours\n\n";
                found = true;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "No completed tasks found.");
        } else {
            JOptionPane.showMessageDialog(null, doneTasks, "Completed Tasks", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void searchTaskByName() {
        String searchName = JOptionPane.showInputDialog("Enter Task Name to Search:");

        for (int i = 0; i < task.taskName.length; i++) {
            if (task.taskName[i] != null && task.taskName[i].equalsIgnoreCase(searchName)) {
                JOptionPane.showMessageDialog(null, "Task Found:\n"
                        + "Task Number: " + i + "\n"
                        + "Developer: " + task.developerDetails[i] + "\n"
                        + "Task Name: " + task.taskName[i] + "\n"
                        + "Task ID: " + task.taskID[i] + "\n"
                        + "Task Duration: " + task.taskDuration[i] + " hours\n"
                        + "Task Status: " + task.choice[i], "Task Search Result", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }
    
    public void searchTasksByDeveloper() {
        String developerName = JOptionPane.showInputDialog("Enter Developer's Name to Search:");
        String developerTasks = "Tasks for Developer: " + developerName + "\n";
        boolean found = false;

        for (int i = 0; i < task.developerDetails.length; i++) {
            if (task.developerDetails[i] != null && task.developerDetails[i].equalsIgnoreCase(developerName)) {
                developerTasks += "Task Number: " + i + "\n"
                        + "Task Name: " + task.taskName[i] + "\n"
                        + "Task ID: " + task.taskID[i] + "\n"
                        + "Task Duration: " + task.taskDuration[i] + " hours\n"
                        + "Task Status: " + task.choice[i] + "\n\n";
                found = true;
            }
            }

        if (!found) {
            JOptionPane.showMessageDialog(null, "No tasks found for developer: " + developerName);
        } else {
            JOptionPane.showMessageDialog(null, developerTasks, "Developer Tasks", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }
