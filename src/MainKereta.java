/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */


public class MainKereta {

    
    public static void main(String[] args) {
        
        Identitas i = new Identitas();
        i.setNama("Budi");
        i.setUsia(28);
        i.setAlamat("Blitar");
        Tiket t = new Tiket();
        t.setTujuan("Sidoarjo");
        t.setNoDuduk(2);
        t.setHargaTiket(15000);
        Kereta k = new Kereta();
        k.setNamaKereta("Penataran");
        k.setGerbong(3);
        Detail d = new Detail();
        d.setIdentitas(i);
        d.setKereta(k);
        d.setTiket(t);
        System.out.println(d.info());

    }
    
}
