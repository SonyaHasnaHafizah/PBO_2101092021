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
public class EntryBukuAlamatExample {
    public static void main(String[] args){
        System.out.println("Entry Buku Alamat" + "\n");
        System.out.println("Accessor dan Mutator Method");
        EntryBukuAlamat student1 = new EntryBukuAlamat();
        
        student1.setName("Sonya Hasna Hafizah");
        student1.setAddress("Padang");
        student1.setTelepon("082288368963");
        student1.setEmail("sonya@gmail.com");
    
        System.out.println("Nama            : "+student1.getName());
        System.out.println("Alamat          : "+student1.getAddress());
        System.out.println("Nomor Telepon   : "+student1.getTelepon());
        System.out.println("Alamat E-Mail   : "+student1.getEmail());
     
        System.out.println("\n" + "Constructor");
        EntryBukuAlamat student2 = new EntryBukuAlamat("Sonya Cantik", "Padang Cinta","082288368963", "sonya@gmail.com");
        
        System.out.println("Nama            : "+student2.getName());
        System.out.println("Alamat          : "+student2.getAddress());
        System.out.println("Nomor Telepon   : "+student2.getTelepon());
        System.out.println("Alamat E-Mail   : "+student2.getEmail());
      
    }
}
