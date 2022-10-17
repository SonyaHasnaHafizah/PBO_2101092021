/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya071022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Latihan5 {
    public static void main (String[] args){
        //BufferedReader
        System.out.println("-->Program Membaca Bilangan<--");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
        int bil =0;
        String status = "";
        String status2 = "";
      
        try{
            System.out.print("Masukkan Bilangan (1-10): ");
            bil = Integer.parseInt(dataIn.readLine());
            //if-else
            if(bil==1){
               status = "satu"; 
            }else if(bil==2){
                status = "dua";
            }else if(bil==2){
                status = "tiga";
            }else if(bil==2){
                status = "empat";
            }else if(bil==2){
                status = "lima";
            }else if(bil==2){
                status = "enam";
            }else if(bil==2){
                status = "tujuh";
            }else if(bil==2){
                status = "delapan";
            }else if(bil==2){
                status = "sembilan";
            }else if(bil==2){
                status = "sepuluh";
            }else{
                status = "Invalid number";
            }
            
            //switch
            switch(bil){ 
            case 1: 
                    status2 = "satu";
                    break; 
            case 2: 
                    status2 = "dua";
                    break; 
            case 3: 
                    status2 = "tiga";
                    break;
            case 4: 
                    status2 = "empat";
                    break;
            case 5: 
                    status2 = "lima";
                    break;
            case 6: 
                    status2 = "enam";
                    break;
            case 7: 
                    status2 = "tujuh";
                    break;
            case 8: 
                    status2 = "delapan";
                    break;
            case 9: 
                    status2 = "sembilan";
                    break;
            case 10: 
                    status2 = "sepuluh";
                    break;
            default: 
                status = "Invald Number";
            }
            
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.println(bil+" "+"adalah bilangan : "+status);
        System.out.println(bil+" "+"adalah bilangan : "+status2); 
    }
}
