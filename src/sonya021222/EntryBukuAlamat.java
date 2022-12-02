/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya021222;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class EntryBukuAlamat {
   
    private String name; 
    private String address; 
    private String telepon; 
    private String email;
  
    //accessor dan mutator method
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getTelepon(){
        return telepon;
    }
    
    public void setTelepon(String telepon){
        this.telepon = telepon;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
   
    //constructor
    public EntryBukuAlamat(){ 
        //area inisialisasi kode; 
    } 
    
    public EntryBukuAlamat(String temp){ 
        this.name = temp; 
    } 
    
    public EntryBukuAlamat(String name, String address, String telepon, String email){ 
        this.name = name; 
        this.address = address;
        this.telepon = telepon; 
        this.email = email;
    } 
    
}
