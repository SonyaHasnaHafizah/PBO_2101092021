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
public class PersegiPanjang implements Relation {
    public PersegiPanjang (){
        
    }
    
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar){ 
        this.panjang = panjang; 
        this.lebar = lebar; 
        
    } 
    public double getLength(){
        double length = panjang*lebar;
        return length;
    }
    public boolean isGreater(Object a, Object b){
        double aLuas = ((PersegiPanjang)a).getLength(); 
        double bLuas = ((PersegiPanjang)b).getLength(); 
        return (aLuas > bLuas); 
    }
    
    public boolean isLess(Object a, Object b){
        double aLuas = ((PersegiPanjang)a).getLength(); 
        double bLuas = ((PersegiPanjang)b).getLength(); 
        return (aLuas > bLuas); 
    }
    
    public boolean isEqual(Object a, Object b){
        double aLuas = ((PersegiPanjang)a).getLength(); 
        double bLuas = ((PersegiPanjang)b).getLength(); 
        return (aLuas > bLuas); 
    }
}
