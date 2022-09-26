/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya230922;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Latihan12 {
    public static void main( String[] args ){
        int number1=10;
        int number2=23;
        int number3=5;
      /*int answer=23;
        String status = ""; 
        
        System.out.println("number 1 = " +number1);
        System.out.println("number 2 = " +number2);
        System.out.println("number 3 = " +number3);
        status = ( answer >= 10)?"Nilai yang paling tertinggi = 23":"Fail"; 
        System.out.println(status);
       */ 
      int hasil;
      hasil = (number1>=number2)?number1:number2;
      hasil = (number3>=hasil)?number3:hasil;
      System.out.println("Nilai yang paling tertinggi = " +hasil);
    }
}
