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
//public final class Person --> tidak bisa diturunkan lagi
public class Person {
    protected String name; 
    protected String address; 
 
    /** 
    * Default constructor 
    */ 
    public Person(){ 
       System.out.println("Inside Person : Constructor"); 
       name = ""; 
       address = ""; 
    } 
    /** 
    * Constructor dengan dua parameter 
    */ 
    public Person( String name, String address ){ 
       this.name = name; 
       this.address = address; 
    } 
    /** 
    * Method accessor 
    */ 
    public String getName(){ 
       System.out.println("Person: getName"); 
       return name; 
    } 
    public String getAddress(){ 
       return address; 
    } 
    public void setName( String name ){ 
       this.name = name; 
    } 
    public void setAddress( String add ){ 
       this.address = add; 
    }
}
