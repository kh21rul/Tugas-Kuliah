/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paket_Interface;

/**
 *
 * @author khair
 */
public class Mitshubishi implements RemoteAllInOne {
    String[] menuTV = {"ANTV", "INDOSIAR", "TRANS-TV", "TPI", 
"RCTI", "SCTV", "GLOBAL-TV"};
public void pindahChannel(int channel) {
System.out.println("LCD Mitshubishi Pindah Channel ke - " 
+ this.menuTV[channel]);
}
public void perbesarVolume(int kpsts) {
System.out.println("LCD Mitshubishi Perbesar Vol : " 
+kpsts);
}
public void perkecilVolume(int kpsts) {
System.out.println("LCD Mitshubishi Pekecil Vol : " + 
kpsts);
}
public void perkecilZoom(int kpsts) {
System.out.println("LCD Mitshubishi Pekecil Zoom : " + 
kpsts);
}
public void perbesarZoom(int kpsts) {
System.out.println("LCD BENQ Pebesar Zoom : " + kpsts);
}
}
