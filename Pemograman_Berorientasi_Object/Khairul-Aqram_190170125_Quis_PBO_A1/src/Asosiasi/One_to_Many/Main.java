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
public class Main {
    
    public static void main(String[] args)
 { 
/*kode dibawah ini merupakan implementasi dari hubungan 
asosiasi antar kelas*/
 Pasien pasien1 = new Pasien("873247236","Fanny");
 Pasien pasien2 = new Pasien("238941244","Miya");
 Pasien pasien3 = new Pasien("234234234","Pharsa");
 Dokter dokter = new Dokter("dr. Khairul");
 dokter.setNoPasien(pasien1.getNoPasien(),pasien1.getNamaPasien());
 dokter.setNoPasien(pasien2.getNoPasien(),pasien2.getNamaPasien());
 dokter.setNoPasien(pasien3.getNoPasien(),pasien3.getNamaPasien());
 dokter.daftarPasien();
 } 
    
}
