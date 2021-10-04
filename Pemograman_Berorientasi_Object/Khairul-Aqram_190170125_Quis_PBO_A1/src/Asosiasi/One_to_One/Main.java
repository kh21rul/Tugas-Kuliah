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
public class Main {
    
    public static void main(String args[]) {
        Laptop laptop = new Laptop("Acer A315-41-R3LC", 4, 1);
        Perusahaan perusahaan = new Perusahaan("Acer Inc");
                
        System.out.println("Nama Laptop : " + laptop.getNama());
        System.out.println("Besar Ram : " + laptop.getRam());
        System.out.println("Perusahaan Pembuat : " + perusahaan.getPerusahaan() + "\n");
        System.out.println("Membuka Aplikasi Memakan : " + laptop.getPemakaianRam() + " Ram");
        System.out.println("Sisa Ram Laptop Saat Ini : " + laptop.getSisaRam());     
    }
    
}
