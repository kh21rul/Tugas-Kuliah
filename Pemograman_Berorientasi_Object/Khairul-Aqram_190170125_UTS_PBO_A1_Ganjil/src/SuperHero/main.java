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
public class main {
    public static void main(String[] args) {
        HeroKuat hero1 = new HeroKuat();
        hero1.namaHero = "Hulk";
        hero1.namaAsli = "Dr. Bruce Banner";
        hero1.terbitan = "Marvel";
        hero1.jenisKekuatan = "Fisik Super";
        hero1.cepatPukul = 9;
        
        HeroBinatang hero2 = new HeroBinatang();
        hero2.namaHero = "Batman";
        hero2.namaAsli = "Bruce Wayne";
        hero2.terbitan = "DC Entertainment";
        hero2.jenisKekuatan = "Kaya";
        hero2.jarakTempuh = 10000;
        
        HeroCepat hero3 = new HeroCepat();
        hero3.namaHero = "Flash";
        hero3.namaAsli = "Barry Allen";
        hero3.terbitan = "DC Entertainment";
        hero3.jenisKekuatan = "Berlari Cepat";
        hero3.jarakTempuh = 25000;
        
        HeroTerbang hero4 = new HeroTerbang();
        hero4.namaHero = "Superman";
        hero4.namaAsli = "Clark Kent";
        hero4.terbitan = "DC Entertainment";
        hero4.jenisKekuatan = "Bisa Terbang";
        hero4.jarakTempuh = 15000;
        
        System.out.println("\n============= HERO KUAT =============\n");
        
        hero1.namaHero();
        hero1.namaAsli();
        hero1.terbitan();
        hero1.kekuatan();
        hero1.demagePukul();
        
        System.out.println("\n============= HERO BERKEKUATAN HEWAN =============\n");
        
        hero2.namaHero();
        hero2.namaAsli();
        hero2.terbitan();
        hero2.kekuatan();
        hero2.cepatMobil();
        
        System.out.println("\n============= HERO CEPAT =============\n");
        
        hero3.namaHero();
        hero3.namaAsli();
        hero3.terbitan();
        hero3.kekuatan();
        hero3.cepaLari();
        
        System.out.println("\n============= HERO TERBANG =============\n");
        
        hero4.namaHero();
        hero4.namaAsli();
        hero4.terbitan();
        hero4.kekuatan();
        hero4.cepatTerbang();
        
    }
}
