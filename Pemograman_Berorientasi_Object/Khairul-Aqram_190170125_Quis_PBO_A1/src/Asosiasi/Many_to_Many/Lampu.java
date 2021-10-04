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
public class Lampu {
    
    private String NamaLampu;
    private int DayaLampu, JmlLampu;
    private Ruangan ruangan;
    
    public Lampu(String NamaLampu, int DayaLampu) {
        this.NamaLampu = NamaLampu;
        this.DayaLampu = DayaLampu;
        ruangan = null;
    }
    
    public String getNamaLampu() {
        return NamaLampu;
    }
    
    public void setNamaLampu(String NamaLampu) {
        this.NamaLampu = NamaLampu;
    }
    
    public int getDayaLampu() {
        return DayaLampu;
    }
    
    public void setDayaLampu(int DayaLampu) {
        this.DayaLampu = DayaLampu;
    }
    
    public int getJmlLampu() {
        this.JmlLampu = ruangan.getJmlRuangan() * 4;
        return JmlLampu;
    }
    
    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }
    
}
