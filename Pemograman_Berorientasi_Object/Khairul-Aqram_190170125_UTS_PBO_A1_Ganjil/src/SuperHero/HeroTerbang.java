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
public class HeroTerbang extends Hero {
    int jarakTempuh;
    
    
    float cepatTerbang() {
        float cepatTerbang = jarakTempuh / 1000;
        System.out.println("Waktu yang dibutuhkan untuk terbang sejauh " + jarakTempuh + " km ialah : " + cepatTerbang + " jam");
        return cepatTerbang;
    }
}
