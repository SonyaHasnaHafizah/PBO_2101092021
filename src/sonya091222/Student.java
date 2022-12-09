/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya091222;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Student extends Person{
    public Student(){ 
        super("Sonya", "Padang"); 
        System.out.println("Inside Student : Constructor"); 
    } 
    // beberapa kode di sini
    
    public String getName(){ 
       System.out.println("Student Name : "); 
       return name; 
    } 
    
    public static void main( String[] args ){ 
        Student student = new Student(); 
        System.out.println(student.getName());
        System.out.println(student.getAddress());
    } 
    
   
}
