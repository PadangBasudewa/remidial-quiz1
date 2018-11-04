/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class Kereta {
    
    private String namaKereta;
    private int gerbong;
    
    public Kereta (){
        
    }
    public String getNamaKereta(){
        return namaKereta;
    }
    public int getGerbong(){
        return gerbong;
    }
     public void setNamaKereta(String namaKereta){
        this.namaKereta = namaKereta;
    }
    public void setGerbong(int gerbong){
        this.gerbong = gerbong;
    }
    public String info(){
        String info = "";
        info += "Nama Kereta:"+this.namaKereta+"\n";
        info += "No Gerbong:" +this.gerbong+"\n";
        return info;
    }
}
