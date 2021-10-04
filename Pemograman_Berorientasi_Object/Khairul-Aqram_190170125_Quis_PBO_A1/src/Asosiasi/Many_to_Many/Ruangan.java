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
public class Ruangan {
    
    String NoRuangan;
    int JmlRuangan;
    private Lampu lampu;
    
    public Ruangan(String NoRuangan, int JmlRuangan) {
        this.NoRuangan = NoRuangan;
        this.JmlRuangan = JmlRuangan;
    }
    
    public void setLampu(Lampu lampu) {
        this.lampu = lampu;
    }
    
    public String getNoRuangan() {
        return NoRuangan;
    }
    
    public void setNoRuangan(String NoRuangan) {
        this.NoRuangan = NoRuangan;
    }
    
    public int getJmlRuangan() {
        return JmlRuangan;
    }
    
    public void setJmlRuangan(int JmlRuangan) {
        this.JmlRuangan = JmlRuangan;
    }
    
}
