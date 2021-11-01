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
public class HeroBinatang extends Hero {
    int jarakTempuh;
    
    
    float cepatMobil() {
        float cepatMobil = jarakTempuh / 500;
        System.out.println("Waktu yang dibutuh kan Mobil Batman untuk menempuh jarak : " + jarakTempuh + " km ialah = " + cepatMobil + "jam");
        return cepatMobil;
    }
}
