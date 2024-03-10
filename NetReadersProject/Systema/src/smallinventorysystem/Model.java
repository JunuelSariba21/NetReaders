/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smallinventorysystem;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Model {
    
   private static String name;
    private static String num;
    private static String addrr;
 
    
    public static void  addUser(String user_name, String user_num, String address) {
        name = user_name;
        num = user_num;
        addrr = address;
    }
    
    public static Object[]  getUser() {
        Object[] tmp = {name, num, addrr};
        return tmp;
    }
    
    
}
