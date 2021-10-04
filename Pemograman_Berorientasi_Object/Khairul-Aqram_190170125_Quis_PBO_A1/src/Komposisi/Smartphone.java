/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komposisi;

/**
 *
 * @author khair
 */
public class Smartphone {
    
    private String warna, nama;
    private float UkrLayar;
    private int kapasitas, WktBermain, SisaBtr;
    
    public void fiturSmartphone() {
        System.out.println("Nama Smartphone = " + nama);
        System.out.println("Warna Smartphone = " + warna);
        System.out.println("Ukuran Layar = " + UkrLayar + " inc");
        System.out.println("Kapasitas Baterai = " + kapasitas + " %");
        System.out.println("Smartphone apabila dimainkan selama = " + WktBermain + " Jam");
        System.out.println("Maka Sisa Baterai = " + SisaBtr + " %");
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setwarna(String warna) {
        this.warna = warna;
    }
    
    public void setUkrLayar(float ukuran) {
        this.UkrLayar = ukuran;
    }  
    
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    } 
    
    public void setBermain(int waktu) {
        this.WktBermain = waktu;
    }
    
    public int getSisaBtr() {
        this.SisaBtr = kapasitas/WktBermain;
        return SisaBtr;
    }
    
}
