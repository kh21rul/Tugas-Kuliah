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
public class Epshon implements RemoteAllInOne {
    String[] menuTV = {"ANTV", "INDOSIAR", "TRANS-TV", "TPI", 
"RCTI", "SCTV", "GLOBAL-TV"};
    public void pindahChannel(int channel) {
    System.out.println("LCD Ephson Pindah Channel ke - " + 
    this.menuTV[channel]);
}
    public void perbesarVolume(int kpsts) {
    System.out.println("LCD Ephson Perbesar Vol : " +kpsts);
}
    public void perkecilVolume(int kpsts) {
    System.out.println("LCD Ephson Pekecil Vol : " + kpsts);
}
    public void perkecilZoom(int kpsts) {
    System.out.println("LCD Ephson Pekecil Zoom : " + kpsts);
}
    public void perbesarZoom(int kpsts) {
    System.out.println("LCD Ephson Pebesar Zoom : " + kpsts);
}
}
