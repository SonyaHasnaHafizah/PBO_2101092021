/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya30092021;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;
public class Latihan1 {
    public static void main (String[] args){
      BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
      String name ="";
      String address ="";
      String jurusan ="";
      
      try{
          System.out.print("Please Enter Your Name:");
          name = dataIn.readLine();
          System.out.print("Please Enter Your Address:");
          address = dataIn.readLine();
          System.out.print("Please Enter Your Major:");
          jurusan = dataIn.readLine();
          }catch(IOException e){
          System.out.println("Error!");
      }
        System.out.println("Hello "+name+"!"+"\n"
                            +"Alamat saya "+address+"\n"
                            +"Jurusan saya "+jurusan);
    }
}
