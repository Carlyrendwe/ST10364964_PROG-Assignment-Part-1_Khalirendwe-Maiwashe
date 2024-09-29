/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progassignment;
import java.util.regex.Pattern;
/**
 *
 * @author RC_Student_lab
 */
class LoginExternalClass {
    
    private String loginUsername;
    private String loginPassword;
    private String firstName;
    private String lastName;
    
    // Constructor for Login class
    LoginExternalClass(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.loginUsername = username;
        this.loginPassword = password;
    }
    
    //Checking the username
    public boolean checkUsername(String username){
        
        //Temp variable
        boolean Found = false;
        
        //Check the username
        if(username.contains("_") && username.length() <= 5){
            Found = true;
            System.out.println("Username successfully captured!! ");
        } else{
            Found = false;
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length. ");
        }
        return Found;
    }
    
    //Check password
    public boolean checkPassword(String password){
        //Pattern regex
        Pattern check_num = Pattern.compile("[0123456789]");
        
        Pattern check_special = Pattern.compile("[~!@#$%^&*()_+'=-]");
        
        Pattern check_Uppercase = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        
        //temp variables
        boolean Found = false;
        
        //Check all here
        if(check_num.matcher(password).find() && check_special.matcher(password).find() && check_Uppercase.matcher(password).find() && password.length() >= 8){
            Found = true;
            System.out.println("Password successfully captured!! ");
        }
        else{
            Found = false;
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character. ");
        }
        return Found;
}
    
   //Authenticate user with username and password
    public boolean returnLoginStatus(String username, String password) {
        boolean match = false;
        
        if(username.equals(loginUsername) && password.equals(loginPassword)) {
            match = true;
            System.out.println("Login Successful! ");
        } else {
            match = false;
            System.out.println("Login Unsuccessful! ");
        }
        
        return match;
    }   
    
    // Method to register the user and check the username and password validity
    public String registerUser(String username, String password, String firstName, String lastName) {
        // Check if the username is valid
        if (!checkUsername(username)) {
            System.out.println("The username is incorrectly formatted. It should contain an underscore and be no longer than 5 characters.");
            return username;
        }
        
        // Check if the password is valid
        if (!checkPassword(password)) {
            System.out.println("The password does not meet the complexity requirements. It must be at least 8 characters long, contain a capital letter, a number, and a special character.");
            return password;
        }
        
        
        // Store the username, password, and user details if both are valid
        this.loginUsername = username;
        this.loginPassword = password;
        this.firstName = firstName;
        this.lastName = lastName;

        return "Registration successful!";
        
        
    }
    
    // Method to log the user in by checking stored credentials
    public boolean loginUser(String username, String password) {
        // Check if entered credentials match stored credentials
        boolean Found = false;
        
        if(username.equals(this.loginUsername) && password.equals(this.loginPassword)){
            System.out.println("Login Successful!");
            Found = true;
        }else {
            System.out.println("Login Unsuccessful! Incorrect username or password.");
            Found = false;
        }
        return Found;
    }
    
    
    
    
}
