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
public class InterfaceExample {
    public static void main (String[] args){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        boolean hasilInt = myInteger.isGreater(5,6);
        boolean hasilDbl = myDouble.isGreater(6.4, 2.2);
        
        System.out.println("Hasil Integer = " +hasilInt);
        System.out.println("Hasil Double = " +hasilDbl);
        
        Relation myLine = new Line();
        Line line1 = new Line(2,5,2,7);
        Line line2 = new Line(2,5,2,2);
        boolean lineA_lineB = myLine.isGreater(line1,line2);
     
        System.out.println("Line A > Line B = " +lineA_lineB);
        
        Relation myPersegiPanjang = new PersegiPanjang();
        PersegiPanjang luas1 = new PersegiPanjang(20.0,10.0);
        PersegiPanjang luas2 = new PersegiPanjang(30.0,20.0);
        boolean luasA_luasB = myPersegiPanjang.isGreater(luas1,luas2);
        System.out.println("Luas A > Luas B = " +luasA_luasB);
        
        Relation myBalok = new Balok();
        Balok volume1 = new Balok(20.0,10.0,5.0);
        Balok volume2 = new Balok(30.0,20.0,1.0);
        boolean volumeA_volumeB = myBalok.isGreater(volume1,volume2);
        System.out.println("Volume A > Volume B = " +volumeA_volumeB);
        
    }
}
