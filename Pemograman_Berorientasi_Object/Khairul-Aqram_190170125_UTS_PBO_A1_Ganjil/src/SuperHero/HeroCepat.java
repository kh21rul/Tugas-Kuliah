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
public class HeroCepat extends Hero {
    int jarakTempuh;
    
    float cepaLari() {
        float cepatLari = jarakTempuh / 1000;
        System.out.println("Waktu yang dibutuhkan untuk lsri sejauh " + jarakTempuh + " km ialah : " + cepatLari + " jam");
        return cepatLari;
    } 
    
}
