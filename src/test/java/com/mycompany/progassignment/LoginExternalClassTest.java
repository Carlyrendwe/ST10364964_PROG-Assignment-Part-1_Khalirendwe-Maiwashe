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
public class LoginExternalClassTest {
    
    /**
     * Test of checkUsername method, of class LoginExternalClass.
     */
    
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "Khal_";
        LoginExternalClass instance = new LoginExternalClass(" ", " ", " ", " ");
        boolean expResult = true;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testInvalidCheckUsername() {
        System.out.println("checkUsername");
        String username = "Khali";
        LoginExternalClass instance = new LoginExternalClass(" ", " ", " ", " ");
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkPassword method, of class LoginExternalClass.
     */
    
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "Khalirendwe*5";
        LoginExternalClass instance = new LoginExternalClass(" ", " ", " ", " ");
        boolean expResult = true;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testInvalidCheckPassword() {
        System.out.println("checkPassword");
        String password = "khalirendwe";
        LoginExternalClass instance = new LoginExternalClass(" ", " ", " ", " ");
        boolean expResult = false;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of returnLoginStatus method, of class LoginExternalClass.
     */
    
     @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "Khal_";
        String password = "Khalirendwe*5";
        LoginExternalClass instance = new LoginExternalClass(" ", " ", " ", " ");
        boolean expResult = true;
        boolean result = instance.returnLoginStatus(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testInvalidReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "khali";
        String password = "khalirendwe";
        LoginExternalClass instance = new LoginExternalClass(" ", " ", " ", " ");
        boolean expResult = false;
        boolean result = instance.returnLoginStatus(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerUser method, of class LoginExternalClass.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "khali";
        String password = "khalirendwe5";
        String firstName = "Khali";
        String lastName = "Ndlovu";
        LoginExternalClass instance = new LoginExternalClass("Khali ", "Maiwashe ", "kha_ ", "khaliRendwe$5 ");
        String expResult = "Registration successful! ";
        String result = instance.registerUser(username, password, firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of loginUser method, of class LoginExternalClass.
     */
    
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "khal_";
        String password = "Khalirendwe*5";
        LoginExternalClass instance = new LoginExternalClass(" ", " ", " ", " ");
        boolean expResult = true;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testInvalidLoginUser() {
        System.out.println("loginUser");
        String username = "Khali";
        String password = "carlyrendwe";
        LoginExternalClass instance = new LoginExternalClass(" ", " ", " ", " ");
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
