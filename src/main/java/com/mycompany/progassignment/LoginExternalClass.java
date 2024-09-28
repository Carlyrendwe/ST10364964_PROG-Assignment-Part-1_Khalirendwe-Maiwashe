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
        // Assuming username and password should match predefined values
        return username.equals(username) && password.equals(password);
    }
    
    
    
    
}
