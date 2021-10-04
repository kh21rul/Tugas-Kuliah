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
public class TestKomposisi {
    public static void main (String args[]) {
        Asus asusmaxpro = new Asus();
        asusmaxpro.setHidupkan();
        asusmaxpro.setNama("Asus Max Pro M2");
        asusmaxpro.setwarna("Biru");
        asusmaxpro.setUkrLayar((float) 5.6);
        asusmaxpro.setKapasitas(100);
        asusmaxpro.setBermain(4);
        asusmaxpro.getSisaBtr();
        asusmaxpro.fiturSmartphone();
        
        
    }
    
    
}
