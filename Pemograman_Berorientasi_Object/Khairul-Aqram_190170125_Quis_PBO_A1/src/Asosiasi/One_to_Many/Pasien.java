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
public class Pasien {
    private String NoPasien;
 private String NamaPasien;
 
 public Pasien(String NoPasien, String NamaPasien)
 {
 this.NoPasien = NoPasien;
 this.NamaPasien = NamaPasien;
 }
 public void setNamaPasien(String NamaPasien) {
 this.NamaPasien = NamaPasien;
 }
 public void setNomorPasien(String NoPasien) {
 this.NoPasien = NoPasien;
 }
 public String getNoPasien() {
 return this.NoPasien;
 }
 public String getNamaPasien () {
 return this.NamaPasien;
 }
    
}
