/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class Identitas {
    
    private String nama;
    private int usia;
    private String alamat;
    
    public Identitas(){
        
    }
    public String getNama(){
      return nama;  
    }
    public int getUsia(){
        return usia;
    }
    public String getAlamat(){
        return alamat;
    }
     public void setNama(String usia){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setUsia(int usia){
        this.usia = usia;
    }
    public String info(){
        String info = "";
        info += "Nama :" +this.nama+"\n";
        info += "Usia :" +this.usia+"\n";
        info +="Alamat :"+this.alamat+"\n";
        return info;
    }
}
