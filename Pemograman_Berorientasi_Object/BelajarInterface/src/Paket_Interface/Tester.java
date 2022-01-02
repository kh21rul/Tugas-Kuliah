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
public class Tester {
    public static void main(String[] args) {
    Epshon ep = new Epshon();
    BenQ bq = new BenQ();
    Mitshubishi mt = new Mitshubishi();
    MyRemoteAllInOne my = new MyRemoteAllInOne();
    my.sendRequest(1, mt, 4);
    my.sendRequest(1, ep, 5);
    my.sendRequest(1, bq, 6);
    my.sendRequest(2, mt, 4);
}
}
