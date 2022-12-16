/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya161222;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Balok implements Relation{
    public Balok(){
        
    }
    
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi){ 
        this.panjang = panjang; 
        this.lebar = lebar; 
        this.tinggi = tinggi;
    } 
    public double getLength(){
        double length = panjang*lebar*tinggi;
        return length;
    }
    public boolean isGreater(Object a, Object b){
        double aVolume = ((Balok)a).getLength(); 
        double bVolume = ((Balok)b).getLength(); 
        return (aVolume > bVolume); 
    }
    
    public boolean isLess(Object a, Object b){
        double aVolume = ((Balok)a).getLength(); 
        double bVolume = ((Balok)b).getLength(); 
        return (aVolume < bVolume);
    }
    
    public boolean isEqual(Object a, Object b){
        double aVolume = ((Balok)a).getLength(); 
        double bVolume = ((Balok)b).getLength(); 
        return (aVolume == bVolume);
    }
}
