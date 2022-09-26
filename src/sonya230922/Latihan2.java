/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya230922;

import java.text.DecimalFormat;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Latihan2 {
    public static void main(String[] args){
        //class objekbaru= new class ("#.##");
        DecimalFormat formatdata = new DecimalFormat("#.##");
        //sedikit angka 
        int i = 37; 
        int j = 42; 
        double x = 27.475; 
        double y = 7.22; 
        System.out.println("Variable values..."); 
        System.out.println(" i = " + i); 
        //j++ = 43  ++j=42
        System.out.println(" j = " + j++); 
        System.out.println(" x = " + x);
        System.out.println(" y = "+y);
        
        //penjumlahan
        System.out.println("Adding..."); 
        System.out.println(" i + j = " + (i + j)); 
        System.out.println(" x + y = " + (x + y)); 
        
        //pengurangan angka 
        System.out.println("Subtracting..."); 
        System.out.println(" i - j = " + formatdata.format(i - j)); 
        System.out.println(" x - y = " + formatdata.format(x - y)); 
        
        //perkalian angka 
        System.out.println("Multiplying..."); 
        System.out.println(" i * j = " + formatdata.format(i * j)); 
        System.out.println(" x * y = " + formatdata.format(x * y));
        
        //pembagian angka 
        System.out.println("Dividing..."); 
        System.out.println(" i / j = " + formatdata.format(i / j)); 
        System.out.println(" x / y = " + formatdata.format(x / y)); 
        
        //menghitung hasil modulus dari pembagian System.out.println("Computing the remainder...");
        System.out.println(" i % j = " + formatdata.format(i % j)); 
        System.out.println(" x % y = " + formatdata.format(x % y)); 
        
        //tipe penggabungan 
        System.out.println("Mixing tipes..."); 
      
        System.out.println(" j + y = " + formatdata.format(j + y)); 
        System.out.println(" i * x = " + formatdata.format(i * x));
               
    }
}
