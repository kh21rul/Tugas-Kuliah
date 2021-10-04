/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asosiasi.One_to_One;

/**
 *
 * @author khair
 */
public class Laptop {
    
    private String NamaLaptop;
    private int BesarRam, PemakaianRam, SisaRam;
    private Perusahaan perusahaan;
    
    public Laptop(String nama, int ram, int PemakaianRam) {
        this.NamaLaptop = nama;
        this.BesarRam = ram;
        this.PemakaianRam = PemakaianRam;
        perusahaan = null;       
    }
    
    public String getNama() {
        return NamaLaptop;
    }
    
    public void setNama(String nama) {
        this.NamaLaptop = nama;
    }
    
    public int getRam() {
        return BesarRam;
    }
    
    public void setRam(int ram) {
        this.BesarRam = ram;
    }
    
    public int getPemakaianRam() {
        return PemakaianRam;
    }
    
    public void setPemakaianRam(int PemakaianRam) {
        this.PemakaianRam = PemakaianRam;
    }
    
    public int getSisaRam() {
        this.SisaRam = BesarRam - PemakaianRam;
        return SisaRam;
    }
    
    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }
    
}
