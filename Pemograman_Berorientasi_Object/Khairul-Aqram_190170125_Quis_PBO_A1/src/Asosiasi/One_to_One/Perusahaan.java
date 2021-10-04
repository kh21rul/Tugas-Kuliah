/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asosiasi.One_to_One;

/**
 *
 * @author khair
 */
public class Perusahaan {
    
    String NamaPerusahaan;
    private Laptop laptop;
    
    public Perusahaan(String nama){
        this.NamaPerusahaan = nama;
        laptop = null;
    }
    
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    
    public String getPerusahaan() {
        return NamaPerusahaan;
    }
    
    public void setPerusahaan(String perusahaan) {
        this.NamaPerusahaan = perusahaan;
    }
    
}
