package animasi_pemandangan;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

    
public class Animasi_pemandangan extends JApplet{
public static void main (String [] args){
JFrame frame= new JFrame ();
frame.setTitle("gita");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JApplet applet= new Animasi_pemandangan ();
applet.init();
frame.getContentPane().add(applet);
frame.pack();
frame.setVisible(true);
frame.setResizable(false);
}
public void init () {  
JPanel panel4 = new Panel2D ();
getContentPane().add(panel4);
}
class Panel2D extends JPanel { 
public Panel2D (){
setPreferredSize(new Dimension(1010, 570));
setBackground(Color.blue); //BACKGROUND
}
public void paintComponent (Graphics g) {
super.paintComponent (g);
Graphics2D g2= (Graphics2D) g; 


//Gambar Gunung, jalan ke gunung dan matahari
g.setColor(new Color(103,206,2));//warna hijau latar
g.fillRect(0, 320,1020 ,300 );
g.setColor(new Color(1,191,254));//warna biru muda //langit
g.fillRect(0, 0,1020 ,320 ); //langit
g.setColor(new Color(253,171,2));//warna kuning matahari
g.fillOval(475,190,100 ,100 ); //matahari


//========= GUNUNG SEGITIGA =============
g.setColor(new Color(0,145,0));//warna hijau
 Polygon p = new Polygon ();
        int xPoly[]= {450, 600, 300};
        int yPoly[]= {200, 300, 300};
        g2.fillPolygon(xPoly, yPoly, xPoly.length);
   
        g.setColor(new Color(0,145,0));//warna hijau
        int xPoly2[]= {600, 750, 450};
        int yPoly2[]= {200, 300, 300};
        g2.fillPolygon(xPoly2, yPoly2, xPoly2.length);
        

//jalan
g.setColor(Color.black);
g.fillRect(0, 300, 1020, 100); 


//garis jalan
Graphics2D g2d = (Graphics2D) g;
g2d.setColor(Color.white);
float[] dash = {20.0f};
BasicStroke strok = new BasicStroke(3.0f, BasicStroke.CAP_SQUARE,
BasicStroke.JOIN_MITER, 1.0f, dash, 0.0f);
g2d.setStroke(strok);
g2d.draw(new Line2D.Double(10, 350, 1000, 350));


//pohon atas kanan
g.setColor(Color.green);
g.fillOval(660,210, 30,50);
g.fillOval(650, 230, 30,30);
g.fillOval(670, 230, 30,30);
g.fillRect(670,240,9 ,60 ); 

//pohon atas kanan
g.setColor(Color.green);
g.fillOval(860,210, 30,50);
g.fillOval(850, 230, 30,30);
g.fillOval(870, 230, 30,30);
g.fillRect(870,240,9 ,60 ); 

//pohon atas kiri
g.setColor(Color.green);
g.fillOval(150,210, 30,50);
g.fillOval(140, 230, 30,30);
g.fillOval(160, 230, 30,30);
g.fillRect(160,240,9 ,60 );

//pohon bawah kanan
g.setColor(Color.green);
g.fillOval(780,300, 30,40);
g.fillOval(770, 320, 30,30);
g.fillOval(790, 320, 30,30);
g.fillRect(790,340,9 ,60 ); 

//pohon bawah kanan
g.setColor(Color.green);
g.fillOval(930,300, 30,40);
g.fillOval(920, 320, 30,30);
g.fillOval(940, 320, 30,30);
g.fillRect(940,340,9 ,60 ); 

//pohon bawah kanan
g.setColor(Color.green);
g.fillOval(80,300, 30,40);
g.fillOval(70, 320, 30,30);
g.fillOval(90, 320, 30,30);
g.fillRect(90,340,9 ,60 ); 

//pohon bawah tengah
g.setColor(Color.green);
g.fillOval(390,300, 30,40);
g.fillOval(380, 320, 30,30);
g.fillOval(400, 320, 30,30);
g.fillRect(400,340,9 ,60 );

//pohon bawah tengah
g.setColor(Color.green);
g.fillOval(590,300, 30,40);
g.fillOval(580, 320, 30,30);
g.fillOval(600, 320, 30,30);
g.fillRect(600,340,9 ,60 );


//Tanaman
g.setColor(new Color(0,140,0));//warna hijau
g.fillOval(0, 550, 30,30);
g.fillOval(25, 550, 30,30);
g.fillOval(50, 550, 30,30);
g.fillOval(15, 530, 30,30);
g.fillOval(32, 530, 30,30);

g.fillOval(90, 430, 30,30);
g.fillOval(115, 430, 30,30);
g.fillOval(140, 430, 30,30);
g.fillOval(105, 410, 30,30);
g.fillOval(122, 410, 30,30);

g.fillOval(180, 500, 30,30);
g.fillOval(205, 500, 30,30);
g.fillOval(230, 500, 30,30);
g.fillOval(195, 480, 30,30);
g.fillOval(212, 480, 30,30);

g.fillOval(270, 430, 30,30);
g.fillOval(295, 430, 30,30);
g.fillOval(320, 430, 30,30);
g.fillOval(285, 410, 30,30);
g.fillOval(302, 410, 30,30);

g.fillOval(390, 550, 30,30);
g.fillOval(415, 550, 30,30);
g.fillOval(440, 550, 30,30);
g.fillOval(405, 530, 30,30);
g.fillOval(422, 530, 30,30);

g.fillOval(510, 430, 30,30);
g.fillOval(535, 430, 30,30);
g.fillOval(560, 430, 30,30);
g.fillOval(525, 410, 30,30);
g.fillOval(542, 410, 30,30);

g.fillOval(600, 500, 30,30);
g.fillOval(625, 500, 30,30);
g.fillOval(650, 500, 30,30);
g.fillOval(615, 480, 30,30);
g.fillOval(632, 480, 30,30);

g.fillOval(690, 430, 30,30);
g.fillOval(715, 430, 30,30);
g.fillOval(740, 430, 30,30);
g.fillOval(705, 410, 30,30);
g.fillOval(722, 410, 30,30);

g.fillOval(780, 550, 30,30);
g.fillOval(805, 550, 30,30);
g.fillOval(830, 550, 30,30);
g.fillOval(795, 530, 30,30);
g.fillOval(812, 530, 30,30);

g.fillOval(870, 430, 30,30);
g.fillOval(895, 430, 30,30);
g.fillOval(920, 430, 30,30);
g.fillOval(885, 410, 30,30);
g.fillOval(902, 410, 30,30);

g.fillOval(960, 500, 30,30);
g.fillOval(985, 500, 30,30);
g.fillOval(1010, 500, 30,30);
g.fillOval(975, 480, 30,30);
g.fillOval(992, 480, 30,30); 


//==============Gambar Awan
g.setColor(Color.white);
g.fillOval(30,70,100,50);
g.fillOval(90,70,90,40);
g.fillOval(125,70,100,50);

g.fillOval(330,70,100,50);
g.fillOval(390,70,90,40);
g.fillOval(425,70,100,50);

g.fillOval(730,70,100,50);
g.fillOval(790,70,90,40);
g.fillOval(825,70,100,50);


//MOBIL
g.setColor(new Color(64,0,128));//ungu,atas mobil
g.fillRect(205,305,100,30 ); //badan bawah
g.fillOval(207,278,104,45); //badan atas 
g.setColor(new Color(255,0,128)); //pink

g.fillRect(210,305,100,30 ); //badan bawah
g.fillOval(210,280,100,45); //badan atas
g.fillArc (180,298,60,70,0,180);// atas ban
g.fillArc (285,298,60,70,0,180);// atas ban
g.setColor(Color.yellow); //lampu

g.fillArc (318,301,23,23,0,80);// atas ban 
g.setColor(Color.black); //ban

g.fillOval(198, 313, 32,32); //ban
g.fillOval(298, 313, 32,32); //ban
g.setColor(Color.white); //ban

g.fillOval(204, 319, 20,20); //ban
g.fillOval(304, 319, 20,20); //ban 
g.setColor(Color.yellow);

g.fillArc (230,285,70,40,0,90);// cendela
g.setColor(Color.gray);

g.fillArc (234,286,64,36,0,90);// atas ban 
g.setColor(Color.yellow);

g.fillArc (220,285,70,40,90,90);// cendela
g.setColor(Color.gray);

g.fillArc (223,286,68,36,90,90);// atas ban
g.setColor(Color.pink);

g.fillRect(258,286,10,18 ); 

 g2.drawPolygon(p);
}
}
}