package praktikum_10;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
public class praktikum10 extends Panel {
 praktikum10 () {
 setBackground (Color.cyan);
 }
 
 public void paint(Graphics u)
 {
 
 u.setColor(Color.GREEN);
 u.fillRect(0, 200, 590, 270);
 
 
 u.setColor(Color.yellow);
 u.fillOval(430, 50, 80, 80);
 
 u.setColor(new Color(245,135,14)); //cahaya matahari
 u.drawLine(430, 90, 380, 90); //garis kiri
 u.drawLine(440, 60, 380, 30); //kiri atas
 u.drawLine(440, 120, 380, 150); //kiri bawah
 u.drawLine(560, 90, 510, 90); //garis kanan
 u.drawLine(560, 30, 500, 60); //kanan atas
 u.drawLine(560, 150, 500, 120); //kanan bawah
 u.drawLine(470, 10, 470, 50); //utara
 u.drawLine(470, 130, 470, 170); //selatan
 
 
 u.setColor(Color.white);
 u.fillOval(20, 15, 70, 70);
 u.fillOval(50, 15, 70, 75);
 u.fillOval(100, 15, 70, 70);
u.setColor(Color.gray);
 int a[] = new int[]{580,240,410,580};
 int b[] = new int[]{200,460,460,320};
 u.fillPolygon(a, b, 4);
 
 u.setColor(Color.white);
 int c[] = new int[]{530,560,570,540};
 int d[] = new int[]{280,260,260,280};
 u.fillPolygon(c, d, 4);
 
 int e[] = new int[]{440,470,480,450};
 int f[] = new int[]{360,340,340,360};
 u.fillPolygon(e, f, 4);
 
 int g[] = new int[]{340,370,380,350};
 int h[] = new int[]{450,430,430,450};
 u.fillPolygon(g, h, 4);
 
 
 }
 
 public static void main(String[] args) {
 Frame f1 = new Frame();
 praktikum10 H = new praktikum10();
 f1.add(H);
 f1.setSize(600, 500);
 f1.setVisible(true);
 
 }
}
