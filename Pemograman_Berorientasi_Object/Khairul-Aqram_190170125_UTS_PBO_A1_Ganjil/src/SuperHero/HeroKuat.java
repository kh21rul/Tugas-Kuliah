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
public class HeroKuat extends Hero {
    int cepatPukul;
    
    float demagePukul() {
        float demagePukul = cepatPukul * 1000;
        System.out.println("Demage Pukulan yang dihasilkan dalam kecepatan " + cepatPukul + " detik ialah = " + demagePukul);
        return demagePukul;
    }
}
