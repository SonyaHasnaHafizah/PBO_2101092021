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
import javax.swing.JOptionPane;
public class Latihan4 {
    public static void main (String[] args){
        int angka1 = 0; 
        int angka2 =0;
        int jumlah =0;
        angka1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka1 : "));
        int msg = angka1; 
        
        angka2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka2 : "));
        int msg1 = angka2;
        
        jumlah=angka1+angka2;
        JOptionPane.showMessageDialog(null, "Hasil penjumlahan "+angka1+" dengan " +angka2+" = " +jumlah);

    } 
}
