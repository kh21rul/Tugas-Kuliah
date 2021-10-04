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
public class Utama {
    public static void main (String args[]) {
        int i;
        Fakultas objFak = new Fakultas("Teknik", "Teknik Informatika");
        Jurusan objJur[] = new Jurusan[3];
        
        objJur[0] = new Jurusan();
        objJur[0] .setNamaJurusan("Teknik Informatika");
        objJur[0] .setJumlahMahasiswa(1500);
        
        objJur[1] = new Jurusan();
        objJur[1] .setNamaJurusan("Teknik Sipil");
        objJur[1] .setJumlahMahasiswa(1000);
        
        objJur[2] = new Jurusan();
        objJur[2] .setNamaJurusan("Teknik Industri");
        objJur[2] .setJumlahMahasiswa(750);
        
        for(i=0 ; i<3 ; i++) {
            objFak.addTabel(objJur[i]);
        }
        objFak.displayJurusan();
        
        
    }
    
}
