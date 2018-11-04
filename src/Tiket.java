/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class Tiket {
    
    private String tujuan;
    private int noDuduk;
    private double hargaTiket;
    
    public Tiket(){
        
    }
    public String getTujuan(){
        return tujuan;
    }
    public int getNoDuduk(){
        return noDuduk;
    }
    public double HargaTiket(){
        return hargaTiket;
    }
    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }
    public void setNoduduk(int noDuduk){
        this.noDuduk = noDuduk;
    }
    public void setHargaTiket(double hargaTiket){
        this.hargaTiket = hargaTiket;
    }
    public String info(){
        String info = "";
        info += "Tujuan" + this.tujuan +"\n";
        info += "Tempat Duduk:"+this.noDuduk+"\n";
        info += "Harga Tiket:" + this.hargaTiket + "\n";
        return info;
    }
    
}
