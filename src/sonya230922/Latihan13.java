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
public class Latihan13 {
    public static void main( String[] args ){
        //1. a / b ^ c ^ d – e + f – g * h + i 
        //2. 3 * 10 *2 / 15 – 2 + 4 ^ 2 ^ 2 
        //3. r ^ s * t / u – v + w ^ x – y++ 
        
        int a=2;
        int b=2;
        int c=4;
        int d=8;
        int e=10;
        int f=12;
        int g=14;
        int h=3;
        int i=2;
        int r=2;
        int s=4;
        int t=2;
        int u=5;
        int v=6;
        int w=3;
        int x=5;
        int y=4;
        
        int hasil1;
        int hasil2;
        int hasil3;
        
             
        //hasil1=((a/b)^c)^d–e+f–(g*h)+i;
        hasil1=(((a/b)^c)^d)-e+f-(g*h)+i;
        //hasil2 = ((3 * 10 * 2)/(15 – 2 + 4))^ 2 ^ 2;
        //hasil3 = r ^ ((s * t)/(u – v + w))^ x – y++; 
        
        System.out.println("1. a / b ^ c ^ d – e + f – g * h + i = " +hasil1);
        //System.out.println("2. 3 * 10 *2 / 15 – 2 + 4 ^ 2 ^ 2  = " +hasil2);
        //System.out.println("3. r ^ s * t / u – v + w ^ x – y++ = " +hasil3);
        
    }
}
