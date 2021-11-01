/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperHero;

/**
 *
 * @author khair
 */
public class Hero {
    String namaHero, namaAsli, terbitan, jenisKekuatan;
    
    void namaHero() {
        System.out.println("Nama Hero : " + this.namaHero);
    }
    
    void namaAsli() {
        System.out.println("Nama Asli : " + this.namaAsli);
    }
    
    void terbitan() {
        System.out.println("Asal Negara : " + this.terbitan);
    }
    
    void kekuatan() {
        System.out.println("Jenis Kekuatan : " + this.jenisKekuatan);
    }
    
    
}
