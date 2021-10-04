/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asosiasi.One_to_Many;

/**
 *
 * @author khair
 */
public class Dokter {
    
    private String NamaDokter;
    private String[] NoPasien = new String[10];
    private String[] NamaPasien = new String[10];
    private int jmlPasien = 0;
 
    public Dokter(String kode) {
        this.NamaDokter = kode;
    }
     public void setNamaDokter (String NamaDokter) {
    this.NamaDokter = NamaDokter;
    }
     
    public void setNoPasien (String NoPasien, String NamaPasien) {
    this.NoPasien[jmlPasien] = NoPasien;
    this.NamaPasien[jmlPasien] = NamaPasien;
    jmlPasien++;
    }
 
   
 public int getJmlPasien() {
 return this.jmlPasien;
 }
 public String getNamaDokter() {
 return this.NamaDokter;
 }
 public void daftarPasien() {
 System.out.println("Nama Dokter : " + NamaDokter );
 System.out.println("Nomor Pasien Yang Ditangani : ");
 for (int i=0;i<jmlPasien;i++)
 {
    System.out.println("No : " + NoPasien[i] + ", Dengan Nama : " + NamaPasien[i]);  
 }
 }
    
}
