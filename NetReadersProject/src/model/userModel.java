/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class userModel {
    
    private static ArrayList<User> users = new ArrayList<>();
    
    public static void addUser(String username, String password) {
        Object[] tmp = {username, password};
        users.add(new User(username, password));
    }
    
    public static boolean auth(String username, String password) {
           for (int i = 0; i < users.size(); i++) {
               if (users.get(i).username.equalsIgnoreCase(username) && users.get(i).password.equalsIgnoreCase(password)) {
                   return true;
               }
              
        }
            return false;
    }    
   
        
    
  
}
