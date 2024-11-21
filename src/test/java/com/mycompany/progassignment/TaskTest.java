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
public class TaskTest {
    /**
     * Test of addTask method, of class Task.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        Task instance = new Task();
        instance.addTask();
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskIDTask1() {
        System.out.println("createTaskID");
        String taskName = "Login";
        String developerDetails = "Richard Harrison";
        int taskNumber = 0;
        Task instance = new Task();
        String expResult = "LO:0:RI";
        String result = instance.createTaskID(taskName, developerDetails, taskNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCreateTaskIDTask2() {
        System.out.println("createTaskID");
        String taskName = "Add Task Feature";
        String developerDetails = "Mike Smith";
        int taskNumber = 0;
        Task instance = new Task();
        String expResult = "AD:0:MI";
        String result = instance.createTaskID(taskName, developerDetails, taskNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescriptionTask1() {
        System.out.println("checkTaskDescription");
        String description = "Create Login to authenticate users";
        boolean expResult = true;
        boolean result = Task.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testCheckTaskDescriptionTask2() {
        System.out.println("checkTaskDescription");
        String description = "Create Add Task feature to add task users";
        boolean expResult = true;
        boolean result = Task.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
    @Test
    public void testInvalidCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String description = "jhvkdhcfjsgheayfikgkhdgfvihgdksekfgaerjigdfkeajgufcjkghefu";
        boolean expResult = false;
        boolean result = Task.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of taskStatus method, of class Task.
     */
    @Test
    public void testTaskStatusTask1() {
        System.out.println("taskStatus");
        String expResult = "To do";
        String result = Task.taskStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testTaskStatusTask2() {
        System.out.println("taskStatus");
        String expResult = "Doing";
        String result = Task.taskStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        int point = 0;
        String taskID = "found";
        Task instance = new Task();
        String expResult = "found";
        instance.developerDetails = new String[1];
        instance.taskDescription = new String[1];
        instance.taskDetails = new String[1];
        instance.taskDuration = new double[1];
        instance.taskID = new String[1];
        instance.taskName = new String[1];
        instance.taskNumber = new int[1];
        instance.choice = new String[1];
        
         instance.developerDetails[0] = "khkh";
         instance.taskDescription[0] = "coke ";
         instance.taskDetails[0] = "khal Mai ";
         instance.taskDuration[0] = 8 ;
         instance.taskID[0] = "ME:0:KH ";
         instance.taskName[0] = " ";
         instance.taskNumber[0] = 0;
         instance.choice[0] = " ";
        
        String result = instance.printTaskDetails(point, taskID);
        
        
       String found = "notfound";
       //String founds ="";
       
       if(result!=null){
           found="found";
       }
       
       
        assertEquals(expResult, found);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHoursTask1() {
        System.out.println("returnTotalHours");
        Task instance = new Task();
        float expResult = 8;
        float result = instance.returnTotalHours();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testReturnTotalHoursTask2() {
        System.out.println("returnTotalHours");
        Task instance = new Task();
        float expResult = 10;
        float result = instance.returnTotalHours();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
