/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya281022;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Latihan2 {
    @SuppressWarnings("empty-statement")
    public static void main( String[] args ){ 
        System.out.println("-->While<--");
        int[] ages = new int[100]; 
        String days[] = {"Monday ", "Tuesday ", "Wednesday ", "Trhursday ", "Friday ", "Saturday ", "Sunday"};
        int i=0;
        while( i< days.length){ 
        System.out.println( days[i] ); 
        i++ ;
        } 
        
        //System.out.println("-->Do While<--");
        //do{ 
        //System.out.println( days[i] ); 
        //i++ ;
        //}while(i=0;i< days.length);
    }
}
