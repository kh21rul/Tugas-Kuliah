package praktikum_11;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
public class praktikum11 extends Panel {
 praktikum11 () {
 setBackground (Color.cyan);
 }
 
 public void paint(Graphics u)
 {
 
 //Rumput
 u.setColor(Color.GREEN);
 u.fillRect(0, 200, 590, 270);
 
 
 
 //Rumah
 u.setColor(Color.RED);
 u.fillRect(10, 300, 100, 150);
 
 //Pintu Rumah
 u.setColor(Color.BLUE);
 u.fillRect(50, 374, 50, 75);
 //Gagang Pintu
 u.setColor(Color.YELLOW);
 u.fillOval(88, 400, 10, 10);
 
 //Atap Rumah
 u.setColor(Color.ORANGE);
 int x[] = new int[] {10,60,110};
 int y[] = new int [] {300,250,300};
 u.fillPolygon(x, y, 3);
 }

public static void main(String[] args) {
 Frame f1 = new Frame();
 praktikum11 H = new praktikum11();
 f1.add(H);
 f1.setSize(600, 500);
 f1.setVisible(true);
 
 }
}