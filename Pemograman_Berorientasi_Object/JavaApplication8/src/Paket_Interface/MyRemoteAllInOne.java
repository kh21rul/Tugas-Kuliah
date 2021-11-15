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
public class MyRemoteAllInOne {
    public void sendRequest(int aksi, RemoteAllInOne rmt, int 
tombol){
switch(aksi){
case 1:
rmt.pindahChannel(tombol);
break;
case 2 :
rmt.perkecilVolume(tombol);
break;
case 3 :
rmt.perbesarVolume(tombol);
break;
case 4 :
rmt.perkecilZoom(tombol);
break;
case 5 :
rmt.perbesarZoom(tombol);
break;
}
}
}
