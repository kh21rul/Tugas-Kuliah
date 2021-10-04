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
public class Fakultas {
    
    private String NamaFakultas;
    private String JurTerfavorit;
    private Jurusan Tabel[];
    private int JumlahJurusan;
    
    public Fakultas(String fakultas, String favorit) {
        NamaFakultas = fakultas;
        JurTerfavorit = favorit;
        JumlahJurusan = 0;
        Tabel = new Jurusan[100];
    }
    
    public String getNamaFakultas() {
        return NamaFakultas;
    }
    
    public String getJurTerfavorit() {
        return JurTerfavorit;
    }
    
    public void addTabel(Jurusan jurusan) {
        Tabel[JumlahJurusan] = jurusan;
        JumlahJurusan++;
    }
    
    public void displayJurusan() {
        int i;
        int j = 1;
        System.out.println("Nama Fakultas : " + this.getNamaFakultas());
        System.out.println("Jurusan Terfavorit : " + this.getJurTerfavorit());
        System.out.println("No.     Jurusan     Jumlah Mahasiswa    (banyaknya orang)");
        for (i=0; i<JumlahJurusan ; i++) {
            System.out.println(j + " " + Tabel[i].getNamaJurusan());
            Tabel[i].drawHistoWa();
            System.out.println("("+Tabel[i].getJumlahMahasiswa()+")");
            j++;
        }
    }
    
}
