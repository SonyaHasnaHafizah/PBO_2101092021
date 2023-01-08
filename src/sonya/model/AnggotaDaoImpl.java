/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya.model;

import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class AnggotaDaoImpl implements AnggotaDao {

    private List<Anggota> data = new ArrayList<>();
    
   public AnggotaDaoImpl(){
       data.add(new Anggota("1111", "Ali", "Padang"));
       data.add(new Anggota("1112", "Sonya", "Padang"));
       data.add(new Anggota("1113", "Hasna", "Padang"));
   }
    
    public Anggota save(Anggota anggota) {
        data.add(anggota);
        return anggota;
    }   

    public Anggota update(int index, Anggota anggota) {
        data.set(index, anggota);
        return anggota;
    }

  
    public void delete(int index) {
        data.remove(index);
    }

    public Anggota getAnggota(int index) {
       return data.get(index);
    }


    public List<Anggota> getAllAnggota() {
        return data;
    }
    
}
