/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.regex.Pattern;
/**
 *
 * @author RC_Student_lab
 */
public class LoginExternalClass {
    
    //Check username
    public boolean CheckUserName(String username){
       //Temp variable for checking
       boolean Found = false;
       
       //Check username
       if(username.contains("_")){
           //The assign to false
           Found = true;
           //message
           System.out.println("Username is captured!! ");
       }
       else{
          //Assign to false
          Found = false;
          //message
          System.out.println("Username is not capured!! ");
       }
       //Return local temp variable
       return Found;
    }
    
    //Check password
    public boolean checkPasswordComplexity(String password){
        //Pattern regex
        Pattern check_num = Pattern.compile("[0123456789]");
        
        Pattern check_special = Pattern.compile("[~!@#$%^&*()_+'=-]");
        
        Pattern check_Uppercase = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        
        //temp variables
        boolean Found = false;
        
        //Check all here
        if(check_num.matcher(password).find() && check_special.matcher(password).find() && check_Uppercase.matcher(password).find()){
            Found = true;
            System.out.println("Password is captured!! ");
        }
        else{
            Found = false;
            System.out.println("Password not captured!! ");
        }
        return Found;
    }
    
    
}
