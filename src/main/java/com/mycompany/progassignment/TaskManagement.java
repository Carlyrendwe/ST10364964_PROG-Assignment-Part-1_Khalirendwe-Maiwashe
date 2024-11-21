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
        
    public ArrayList<String> developers = new ArrayList<>();
    public ArrayList<String> taskNames = new ArrayList<>();
    public ArrayList<String> taskIDs = new ArrayList<>();
    public ArrayList<Double> taskDurations = new ArrayList<>();
    public ArrayList<String> taskDescriptions = new ArrayList<>();
    public ArrayList<String> taskStatuses = new ArrayList<>();
    
    
    
    public void displayReport() {
    if (taskNames.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No tasks to display.");
        return;
    }

    StringBuilder report = new StringBuilder("Full Task Report:\n");
    for (int i = 0; i < taskNames.size(); i++) {
        report.append("Developer: ").append(developerDetails[i]).append("\n")
              .append("Task Name: ").append(taskName[i]).append("\n")
              .append("Task ID: ").append(taskID[i]).append("\n")
              .append("Task Duration: ").append(taskDuration[i]).append(" hours\n")
              .append("Task Description: ").append(taskDescription[i]).append("\n")
              .append("Task Status: ").append(taskStatuses.get(i)).append("\n\n");
    }

    JOptionPane.showMessageDialog(null, report.toString(), "Task Report", JOptionPane.INFORMATION_MESSAGE);
}
    
    public void deleteTaskByName() {
    String taskNameToDelete = JOptionPane.showInputDialog("Enter Task Name to Delete:");
    int index = taskNames.indexOf(taskNameToDelete);

    if (index != -1) {
        developers.remove(index);
        taskNames.remove(index);
        taskIDs.remove(index);
        taskDurations.remove(index);
        taskDescriptions.remove(index);
        taskStatuses.remove(index);

        JOptionPane.showMessageDialog(null, "Task '" + taskNameToDelete + "' deleted successfully.");
    } else {
        JOptionPane.showMessageDialog(null, "Task not found.");
    }
}
    
    public void displayLongestDurationTask() {
    if (taskDurations.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No tasks to analyze.");
        return;
    }

    double maxDuration = 0;
    int maxIndex = 0;

    for (int i = 0; i < taskDurations.size(); i++) {
        if (taskDurations.get(i) > maxDuration) {
            maxDuration = taskDurations.get(i);
            maxIndex = i;
        }
    }

    String message = "Developer: " + developers.get(maxIndex) +
                     "\nTask Name: " + taskNames.get(maxIndex) +
                     "\nDuration: " + maxDuration + " hours";

    JOptionPane.showMessageDialog(null, message, "Longest Task Duration", JOptionPane.INFORMATION_MESSAGE);
}
    
    public void displayDoneTasks() {
    StringBuilder doneTasks = new StringBuilder("Tasks with Status 'Done':\n");

    for (int i = 0; i < taskStatuses.size(); i++) {
        if (taskStatuses.get(i).equalsIgnoreCase("Done")) {
            doneTasks.append("Developer: ").append(developers.get(i))
                    .append(", Task Name: ").append(taskNames.get(i))
                    .append(", Duration: ").append(taskDurations.get(i)).append(" hours\n");
        }
    }

    if (doneTasks.length() == "Tasks with Status 'Done':\n".length()) {
        JOptionPane.showMessageDialog(null, "No tasks with status 'Done'.");
    } else {
        JOptionPane.showMessageDialog(null, doneTasks.toString());
    }
}
    
    public void searchTaskByName() {
    String taskNameToSearch = JOptionPane.showInputDialog("Enter Task Name to Search:");
    int index = taskNames.indexOf(taskNameToSearch);

    if (index != -1) {
        String message = "Task Name: " + taskNames.get(index) +
                         "\nDeveloper: " + developers.get(index) +
                         "\nTask Status: " + taskStatuses.get(index);
        JOptionPane.showMessageDialog(null, message, "Task Found", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Task not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void searchTasksByDeveloper() {
    String developerToSearch = JOptionPane.showInputDialog("Enter Developer Name to Search Tasks:");
    StringBuilder tasks = new StringBuilder("Tasks for Developer: " + developerToSearch + "\n");

    for (int i = 0; i < developers.size(); i++) {
        if (developers.get(i).equalsIgnoreCase(developerToSearch)) {
            tasks.append("Task Name: ").append(taskNames.get(i))
                 .append(", Status: ").append(taskStatuses.get(i)).append("\n");
        }
    }

    if (tasks.length() == ("Tasks for Developer: " + developerToSearch + "\n").length()) {
        JOptionPane.showMessageDialog(null, "No tasks found for the developer.");
    } else {
        JOptionPane.showMessageDialog(null, tasks.toString());
    }
}
    
    
}
