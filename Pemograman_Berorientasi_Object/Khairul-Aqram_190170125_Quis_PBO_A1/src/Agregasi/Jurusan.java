/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregasi;

/**
 *
 * @author khair
 */
public class Jurusan {
    private String NamaJurusan;
    private float JumlahMahasiswa;
    
    public void setNamaJurusan(String jurusan) {
        NamaJurusan = jurusan;
    } 
    
    public void setJumlahMahasiswa(int jumlah) {
        JumlahMahasiswa = (float)jumlah/400;
    }
    
    public String getNamaJurusan() {
        return NamaJurusan;
    }
    
    public float getJumlahMahasiswa() {
        return JumlahMahasiswa;
    }
    
    public void drawHistoWa() {
        int i;
        int j;
        i = Math.round(JumlahMahasiswa);
        
        for (j=0 ; j<i ; j++) {
            System.out.println("*");
        }
    }
}
