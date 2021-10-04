/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asosiasi.Many_to_Many;

/**
 *
 * @author khair
 */
public class Menerangi {
    public static void main(String args[]) {
        Lampu lampu = new Lampu("Phillips", 15);
        Ruangan ruangan = new Ruangan("002", 15);
        
        ruangan.setLampu(lampu);
        lampu.setRuangan(ruangan);
        
        System.out.println("Nama Lampu : " + lampu.getNamaLampu());
        System.out.println("Daya : " + lampu.getDayaLampu() + " watt");
        System.out.println("Nomor Ruangan : " + ruangan.getNoRuangan());
        System.out.println("\nBanyaknya ruangan : " + ruangan.getJmlRuangan());
        System.out.println("Masing - masing ruangan menggunakan 4 lampu");
        System.out.println("Maka Lampu yang dibutuhkan sebanyak : " + lampu.getJmlLampu());
        
        
    }
    
}
