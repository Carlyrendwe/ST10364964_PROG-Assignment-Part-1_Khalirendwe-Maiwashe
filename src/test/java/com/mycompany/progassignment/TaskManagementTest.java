/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.progassignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManagementTest {
    // Create a shared TaskManagement instance and populate the data
    TaskManagement taskManagement;
    
    public TaskManagementTest() {
    // Initialize TaskManagement with enough space for the tasks
        //int numberOfTasks = 4;
        //taskManagement = new TaskManagement(numberOfTasks);
        
        // Populate the taskName array with the test data
        taskManagement.taskName[0] = "Create Login";
        taskManagement.taskName[1] = "Create add feature";
        taskManagement.taskName[2] = "Create reports";
        taskManagement.taskName[3] = "Add arrays";

        // Populate the rest of the arrays with the corresponding data
        taskManagement.developerDetails[0] = "Mike Smith";
        taskManagement.developerDetails[1] = "Edward Harrison";
        taskManagement.developerDetails[2] = "Samantha Paulson";
        taskManagement.developerDetails[3] = "Glenda Oberholzer";

        taskManagement.taskDuration[0] = 5;
        taskManagement.taskDuration[1] = 8;
        taskManagement.taskDuration[2] = 2;
        taskManagement.taskDuration[3] = 11;

        taskManagement.choice[0] = "To Do";
        taskManagement.choice[1] = "Doing";
        taskManagement.choice[2] = "Done";
        taskManagement.choice[3] = "To Do";
    }

    /**
     * Test of displayReport method, of class TaskManagement.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("Testing displayReport");
        String report = taskManagement.displayReport(); // Assuming displayReport is static and returns a String
        assertEquals(true, report.contains("Task Name: Create Login"));
        assertEquals(true, report.contains("Developer: Mike Smith"));
        assertEquals(true, report.contains("Task Status: To Do"));
       
    }

    /**
     * Test of deleteTaskByName method, of class TaskManagement.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");

        // Test deleting the "Create Login" task
        taskManagement.deleteTaskByName("Create reports");

        // Assert that "Create Login" task is deleted
        assertEquals(null, taskManagement.taskName[2]); // Task name should be null
        assertEquals(null, taskManagement.taskDuration[2]); // Task duration should be 0

        // Assert that other tasks are not deleted
        assertEquals("Create Login", taskManagement.taskName[0]); // Task should remain
        assertEquals("Create add features", taskManagement.taskName[1]); // Task should remain
        assertEquals("Add arrays", taskManagement.taskName[3]); // Task should remain
        
    }

    /**
     * Test of displayLongestDurationTask method, of class TaskManagement.
     */
    @Test
    public void testDisplayLongestDurationTask() {
        System.out.println("Testing displayLongestDurationTask");
        
        // Ensure taskManagement has been populated correctly
        assertNotNull(taskManagement.taskDuration);
        assertEquals(4, taskManagement.taskDuration.length);  // Check if the array has the expected length
        
        String[] longestTask = taskManagement.displayLongestDurationTask();
        // Check that the task with the longest duration is correctly identified
        assertArrayEquals(new String[]{"Add arrays", "11"}, longestTask);
    }

    /**
     * Test of displayDoneTasks method, of class TaskManagement.
     */
    @Test
    public void testDisplayDoneTasks() {
        System.out.println("Testing displayDoneTasks");
        String result = taskManagement.displayDoneTasks();
        assertEquals(true, result.contains("Task Name: Create reports"));
        assertEquals(true, result.contains("Task Status: Done"));
        assertEquals(false, result.contains("Task Name: Create Login")); // This task is not "Done"
        
    }

    /**
     * Test of searchTaskByName method, of class TaskManagement.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("Testing searchTaskByName");
        String result = taskManagement.searchTaskByName("Create add feature");
        assertEquals("Developer: Edward Harrison", result.contains("Developer: Edward Harrison"));
        assertEquals("Task Name: Create add feature", result.contains("Task Name: Create add feature"));
        
    }

    /**
     * Test of searchTasksByDeveloper method, of class TaskManagement.
     */
    @Test
    public void testSearchTasksByDeveloper() {
         System.out.println("Testing searchTasksByDeveloper");
        String result = taskManagement.searchTasksByDeveloper("Mike Smith");
        assertEquals("Task Name: Create Login", result.contains("Task Name: Create Login"));
        assertEquals("Task Status: To Do", result.contains("Task Status: To Do"));
        assertEquals(false, result.contains("Task Name: Add arrays")); // This is not Mike Smith's task
    }
    
}
