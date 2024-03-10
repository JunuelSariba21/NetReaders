/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Attributes.AttribStudentTable;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class ModelStudent {
    public static ArrayList<AttribStudentTable> student = new ArrayList<>();
    public static void addStudent(AttribStudentTable object){
        student.add(object);
    }
    public static ArrayList<AttribStudentTable> getStudent(){
        return student;
    }
}
