package praktikum_13;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
  
public class Praktikum_13 extends JApplet{
public static void main (String [] args){
JFrame frame= new JFrame ();
frame.setTitle("Perumahan");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JApplet applet= new Praktikum_13 ();
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
int awal = 0;
int mulai = 0;
public Panel2D (){
setPreferredSize(new Dimension(1010, 570));
setBackground (new Color (0, 30, 60));//mengeset warna (R, G, B)//BACKGROUND
}
public void paintComponent (Graphics g) {
     
super.paintComponent (g);
Graphics2D g2= (Graphics2D) g;

GradientPaint klmp6 = new GradientPaint(100, 100,new Color(0, 30, 60),100, 300, Color.LIGHT_GRAY);
g2.setPaint(klmp6);
g2.fill(new Rectangle2D.Double(0, 0, 1020, 400));

//==============Gambar bulan
g2.setColor(new Color(243, 241, 217));
g.fillOval(15, 20, 90, 90);

//bintang
g.setColor(Color.white);
g.fillOval(10, 20, 6, 4);
g.fillOval(150, 15, 6, 4);
g.fillOval(180, 40, 6, 6);
g.fillOval(200, 70, 6, 6);
g.fillOval(290, 20, 6, 4);
g.fillOval(360, 40, 6, 6);
g.fillOval(420, 70, 6, 4);
g.fillOval(460, 40, 6, 4);
g.fillOval(500, 70, 6, 4);
g.fillOval(540, 30, 6, 4);
g.fillOval(590, 80, 7, 7);
g.fillOval(650, 40, 6, 4);
g.fillOval(700, 10, 6, 4);
g.fillOval(750, 80, 6, 4);
g.fillOval(800, 40, 6, 4);
g.fillOval(850, 80, 6, 6);
g.fillOval(900, 40, 6, 4);

//Membuat jalan lurus
g.setColor(Color.black);
g.fillRect(0, 380, 1020, 50);

//Membuat garis jalan menjadi pisah2
Graphics2D g2e = (Graphics2D) g;
g2e.setColor(Color.white);
float[] k6 = {12.0f}; //untuk memperbanyak panjang garis
BasicStroke ke = new BasicStroke(2.0f, BasicStroke.CAP_SQUARE, //2.0f untuk ketebalan dari garis
BasicStroke.JOIN_MITER, 1.0f, k6, 0.0f);
g2e.setStroke(ke);

//Jalan ke mesjid
g.setColor(Color.BLACK);
int a1[] = new int[] {200,275,300};
int b1[] = new int [] {400,200,400};
g.fillPolygon(a1, b1, 3);

//Garis Jalan ke mesjid
g.setColor(Color.white);
g.drawLine(250, 400, 275, 200);

//tanah
g.setColor(new Color (0, 0, 0));
g.fillOval(130,260, 270,10);
g.fillOval(480,260, 200,10);

//rumah
g.setColor(new Color(43, 216, 13));//warna hijau
g.fillOval(234,100, 66,75);//kubah
g.fillOval(180, 120, 16, 30);
g.fillOval(340, 120, 16, 30);

g.setColor(new Color(171, 170, 161));//warna abu-abu
g.fillRect(232, 143, 70, 120);
g.fillRect(195, 160, 30, 103);
g.draw3DRect(195, 160, 30, 103,true);
g.fillRect(165, 185, 20, 80);
g.draw3DRect(165, 185, 20, 80,true);
g.fillRect(310, 160, 30, 103);
g.draw3DRect(310, 160, 29, 103,true);
g.fillRect(350, 185, 20, 80);
g.draw3DRect(350, 185, 20, 80,true);

g.setColor(Color.gray);
g.fillRect(235, 133, 65, 5);

g.setColor(new Color(244, 249, 21));//kuning
g.fillOval(242,150, 50,50);
g.fillRect(242, 175, 50, 80);
//pintu kecil
g.fillRect(318, 170, 15, 20);
g.fillRect(318, 200, 15, 20);
g.fillRect(318, 230, 15, 20);
g.fillRect(203, 170, 15, 20);
g.fillRect(203, 200, 15, 20);
g.fillRect(203, 230, 15, 20);

g.setColor(new Color(43, 216, 13));//warna hijau
g.fillOval(154, 155, 12, 15);
g.fillOval(369, 155, 12, 15);

g.setColor(Color.white);
g.fillRect(225, 138, 85, 5); //garis atas
g.fillRect(180, 130, 15, 134);//garis samping
g.fillRect(340, 130, 15, 134);//garis samping
g.fillRect(155, 165, 10, 100);
g.fillRect(370, 165, 10, 100);

g.setColor(new Color(43, 216, 13));//warna hijau
g.fillRect(225, 143, 10, 120);
g.fillRect(300, 143, 10, 120);
g.draw3DRect(180, 130, 15, 134,true);
g.draw3DRect(340, 130, 15, 134,true);

g.setColor(new Color(220, 134, 0));//warna coklat
g.fillArc (262,160,30,30,0,90);
g.fillRect(277, 175, 15, 80);
g.fillArc (241,160,35,35,90,90);
g.fillRect(242, 175, 16, 80);
g.draw3DRect(155, 165, 10, 100,true);
g.draw3DRect(370, 165, 10, 100,true);

g.setColor(Color.black);
g.fillOval(280,210, 7,7);
g.fillOval(248,210, 7,7);


//pohon
g.setColor(new Color(50, 148, 19));
g.fillOval(140,280, 30,40);
g.fillOval(130 ,300, 30,30);
g.fillOval(150, 300, 30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(150,320,9 ,60 );

g.setColor(new Color(50, 148, 19));
g.fillOval(70,280, 30,40);
g.fillOval(60 ,300, 30,30);
g.fillOval(80, 300, 30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(80,320,9 ,60 );

g.setColor(new Color(50, 148, 19));
g.fillOval(660,280, 30,40);
g.fillOval(650, 300, 30,30);
g.fillOval(670, 300, 30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(670,320,9 ,60 );

g.setColor(new Color(50, 148, 19));
g.fillOval(100,280, 30,40);
g.fillOval(90, 300, 30,30);
g.fillOval(110, 300, 30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(110,320,9 ,60 );

g.setColor(new Color(50, 148, 19));
g.fillOval(160,280, 30,40);
g.fillOval(150, 300, 30,30);
g.fillOval(170, 300, 30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(170,320,9 ,60 );

g.setColor(new Color(50, 148, 19));
g.fillOval(600,280, 30,40);
g.fillOval(590, 300, 30,30);
g.fillOval(610, 300, 30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(610,320,9 ,60 );

g.setColor(new Color(50, 148, 19));
g.fillOval(660,280, 30,40);
g.fillOval(650, 300, 30,30);
g.fillOval(670, 300, 30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(670,320,9 ,60 );

g.setColor(new Color(50, 148, 19));
g.fillOval(500,280, 30,40);
g.fillOval(490, 300, 30,30);
g.fillOval(510, 300,30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(510,320,9 ,60 );

g.setColor(new Color(50, 148, 19));
g.fillOval(460,280, 30,40);
g.fillOval(450, 300, 30,30);
g.fillOval(470, 300, 30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(470,320,9 ,60 );

g.setColor(new Color(50, 148, 19));
g.fillOval(360,280, 30,40);
g.fillOval(350, 300, 30,30);
g.fillOval(370, 300, 30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(370,320,9 ,60 );

g.setColor(new Color(50, 148, 19));
g.fillOval(407,280, 30,40);
g.fillOval(390, 300, 30,30);
g.fillOval(420, 300, 30,30);
g.setColor(new Color (162, 81, 31));
g.fillRect(417,320,9 ,60 );

//gedung biru
g.setColor(new Color (30, 223, 224));
g.fillRect(630,105,50 ,100 );

//lampu biru
g.setColor(Color.black);
g.fillRect(635,110,10 ,10 );
g.fillRect(650,110,10 ,10 );
g.setColor(new Color (244, 249, 21));
g.fillRect(665,110,10 ,10 );
g.setColor(Color.black);
g.fillRect(635,125,10 ,10 );
g.fillRect(650,125,10 ,10 );
g.fillRect(665,125,10 ,10 );
g.setColor(new Color (244, 249, 21));
g.fillRect(635,140,10 ,10 );
g.setColor(Color.black);
g.fillRect(650,140,10 ,10 );
g.fillRect(665,140,10 ,10 );
g.fillRect(635,155,10 ,10 );
g.fillRect(650,155,10 ,10 );
g.fillRect(665,155,10 ,10 );
g.fillRect(635,170,10 ,10 );
g.setColor(new Color (244, 249, 21));
g.fillRect(650,170,10 ,10 );
g.setColor(Color.black);
g.fillRect(665,170,10 ,10 );
g.fillRect(635,185,10 ,10 );
g.fillRect(650,185,10 ,10 );
g.fillRect(665,185,10 ,10 );

//gedung abu-abu
g.setColor(new Color (118, 119, 138));
g.fillRect(710,140,25 ,60 );

//lampu gedung abu-abu
g.setColor(new Color (244, 249, 21));
g.fillRect(715,145,5 ,5 );
g.fillRect(725,145,5 ,5 );
g.fillRect(715,155,5 ,5 );
g.fillRect(725,155,5 ,5 );
g.fillRect(715,165,5 ,5 );
g.fillRect(725,165,5 ,5 );
g.fillRect(715,175,5 ,5 );
g.fillRect(725,175,5 ,5 );
g.fillRect(715,185,5 ,5 );
g.fillRect(725,185,5 ,5 );
g.fillRect(715,195,5 ,5 );
g.fillRect(725,195,5 ,5 );

//tanah
g.setColor(new Color (0, 0, 0));
g.fillOval(600,200, 200,10);


//Membuat garis jalan
Graphics2D g2d = (Graphics2D) g;
g2d.setColor(Color.white);
float[] dash = {20.0f};
BasicStroke strok = new BasicStroke(3.0f, BasicStroke.CAP_SQUARE,
BasicStroke.JOIN_MITER, 1.0f, dash, 0.0f);
g2d.setStroke(strok);
g2d.draw(new Line2D.Double(10, 400, 1020, 400));

//========== mobil
g.setColor(new Color(255, 190, 0));
g.fillRect(130,375,100,30 ); //badan bawah
g.fillOval(130,350,100,45); //badan atas
g.fillArc (100,368,60,70,0,180);// atas ban
g.fillArc (205,368,60,70,0,180);// atas ban
g.setColor(Color.yellow);
g.fillArc (238,371,23,23,0,80);// lampu
g.setColor(Color.black); //ban
g.fillOval(118, 383, 32,32); //ban
g.fillOval(218, 383, 32,32); //ban
g.setColor(Color.white); //ban
g.fillOval(124, 389, 20,20); //ban
g.fillOval(224, 389, 20,20); //ban
g.setColor(Color.yellow);
g.fillArc (150,355,70,40,0,90);// atas ban
g.setColor(Color.black);
g.fillArc (154,356,64,36,0,90);// atas ban
g.setColor(Color.yellow);
g.fillArc (140,355,70,40,90,90);// atas ban
g.setColor(Color.black);
g.fillArc (143,356,68,36,90,90);// atas ban
g.setColor(Color.yellow);
g.fillRect(178,356,10,18 );

//==============Gambar Awan
g.setColor(new Color (0, 0, 0));
g.fillOval(74,50,40,70);
g.fillOval(40, 60, 60,50);
g.fillOval(90, 60, 60,50);

//Jalan ke gedung coklat
g.setColor(Color.BLACK);
int a[] = new int[] {725,780,875};
int b[] = new int [] {650,170,650};
g.fillPolygon(a, b, 3);

//Garis Jalan
g.setColor(Color.white);
g.drawLine(800, 950, 787, 270);

//tanah
g.setColor(new Color (0, 0, 0));
g.fillOval(710,250, 300,20);

//gedung oren
g.setColor(new Color (255, 118, 17));
g.fillRect(820,150,50 ,100 );

//lampu gedung oren
g.setColor(new Color (0, 0, 0));
g.fillRect(835,155,10 ,10 );
g.fillRect(852,155,10 ,10 );
g.fillRect(835,175,10 ,10 );
g.fillRect(852,175,10 ,10 );
g.fillRect(835,195,10 ,10 );
g.fillRect(852,195,10 ,10 );
g.fillRect(835,215,10 ,10 );
g.fillRect(852,215,10 ,10 );
g.fillRect(835,235,10 ,10 );
g.fillRect(852,235,10 ,10 );

//gedung coklat
g.setColor(new Color (43, 14, 14));
g.fillRect(750,80,80 ,190 );

//gedung
g.setColor(new Color (74, 3, 9));
g.fillRect(540,113,65 ,150 );

//lampu gedung merah
g.setColor(new Color (244, 249, 21));
g.fillRect(546,120,12 ,12 );
g.fillRect(566,120,12 ,12 );
g.fillRect(586,120,12 ,12 );
g.setColor(new Color (0, 0, 0));
g.fillRect(546,140,12 ,12 );
g.setColor(new Color (244, 249, 21));
g.fillRect(566,140,12 ,12 );
g.fillRect(586,140,12 ,12 );
g.fillRect(546,160,12 ,12 );
g.setColor(new Color (0, 0, 0));
g.fillRect(566,160,12 ,12 );
g.setColor(new Color (244, 249, 21));
g.fillRect(586,160,12 ,12 );
g.fillRect(546,180,12 ,12 );
g.fillRect(566,180,12 ,12 );
g.fillRect(586,180,12 ,12 );
g.fillRect(546,200,12 ,12 );
g.setColor(new Color (0, 0, 0));
g.fillRect(566,200,12 ,12 );
g.fillRect(586,200,12 ,12 );
g.setColor(new Color (244, 249, 21));
g.fillRect(546,220,12 ,12 );
g.fillRect(566,220,12 ,12 );
g.fillRect(586,220,12 ,12 );
g.fillRect(546,240,12 ,12 );
g.setColor(new Color (0, 0, 0));
g.fillRect(566,240,12 ,12 );
g.setColor(new Color (244, 249, 21));
g.fillRect(586,240,12 ,12 );

//gedung ungu
g.setColor(new Color (197, 4, 190));
g.fillRect(900,105,65 ,150 );

//tanah
g.setColor(new Color (0, 0, 0));
g.fillOval(730,260, 300,20);

//lampu gedung coklat
g.setColor(new Color (244, 249, 21));
g.fillRect(765,90,20 ,20 );
g.fillRect(795,90,20 ,20 );
g.fillRect(765,125,20 ,20 );
g.fillRect(795,125,20 ,20 );
g.fillRect(765,160,20 ,20 );
g.fillRect(795,160,20 ,20 );
g.fillRect(765,195,20 ,20 );
g.fillRect(795,195,20 ,20 );
g.fillRect(765,230,20 ,20 );
g.fillRect(795,230,20 ,20 );

//lampu gedung ungu
g.fillRect(912,110,15 ,15 );
g.fillRect(938,110,15 ,15 );
g.fillRect(912,135,15 ,15 );
g.setColor(new Color (0, 0, 0));
g.fillRect(938,135,15 ,15 );
g.setColor(new Color (244, 249, 21));
g.fillRect(912,160,15 ,15 );
g.fillRect(938,160,15 ,15 );
g.fillRect(912,185,15 ,15 );
g.fillRect(938,185,15 ,15 );
g.setColor(new Color (0, 0, 0));
g.fillRect(912,210,15 ,15 );
g.setColor(new Color (244, 249, 21));
g.fillRect(938,210,15 ,15 );
g.fillRect(912,235,15 ,15 );
g.fillRect(938,235,15 ,15 );

//mobil
//depan mobil
g.setColor(Color.LIGHT_GRAY);
g.fillOval(703, 375, 25, 25);
//badan mobil
g.setColor(Color.RED);
g.fillRect(700, 350, 15, 10);
g.fill3DRect(710, 375, 10, 25, true);
g.fill3DRect(620, 350, 90, 50,true);
//ban mobil
g.setColor(Color.WHITE);
g.fillOval(635, 385, 22, 22);
g.setColor(Color.DARK_GRAY);
g.fillOval(635, 390, 22, 22);
g.setColor(Color.WHITE);
g.fillOval(690, 385, 22, 22);
g.setColor(Color.DARK_GRAY);
g.fillOval(690, 390, 22, 22);

//jendela
g.setColor(Color.WHITE);
g.fillRect(695, 361, 10, 15);

//bintang
g.setColor(Color.ORANGE);
int w1[] = new int[] {480,500,520};//untuk posisi
int i1[] = new int [] {50,50,70};//untuk bentuk
g.fillPolygon(w1, i1, 3);

g.setColor(Color.ORANGE);
int x1[] = new int[] {480,500,520};
int y1[] = new int [] {70,50,50};
g.fillPolygon(x1, y1, 3);

g.setColor(Color.ORANGE);
int x2[] = new int[] {490,500,510};
int y2[] = new int [] {55,40,55};
g.fillPolygon(x2, y2, 3);

//daun
g.setColor(new Color (253, 165, 200));
g.fillOval(865, 455, 20,20);
g.fillOval(865, 437, 20,20);

//ranting bengkok
g.setColor(new Color (162, 81, 31));
g.fillArc (880,440,60,70,150,150);

//daun
g.setColor(new Color (0, 30, 60));
g.fillOval(885, 445, 50, 50);

//ranting bengkok
g.setColor(new Color (162, 81, 31));
g.fillArc (920,440,60,70,90,100);

//daun
g.setColor(new Color (0, 30, 60));//warna sama dengan background
g.fillOval(928, 448, 40, 40);

//daun
g.setColor(new Color (253, 165, 200));
g.fillOval(880, 445, 20,20);
g.fillOval(870, 480, 20,20);
g.fillOval(883, 495, 20,20);
g.fillOval(865, 495, 20,20);
g.fillOval(950, 500, 20,20);
g.fillOval(947, 485, 20,20);
g.fillOval(960, 490, 20,20);
g.fillOval(942, 440, 20,20);
g.fillOval(940, 422, 20,20);
g.fillOval(955, 426, 20,20);
g.fillOval(920, 430, 20,20);
g.fillOval(900, 430, 20,20);
g.fillOval(910, 418, 20,20);

//ranting lurus
g.setColor(new Color (162, 81, 31));
g.fillRect(920,480,11 ,100 );
g.fillOval(920, 500, 40, 7);
g.fillOval(918, 438, 7, 40);

//semak-semak
g.setColor(new Color (73, 195, 12));
g.fillOval(180, 540, 300, 100);
g.fillOval(0, 480, 300, 200);
g.fillOval(-100, 430, 200, 300);

//nama kelompok
g.setColor(new Color (162, 81, 31));
g.fillOval(500, 480, 20, 110);
g.fillRect(450, 490, 120, 50);

g.setColor(Color.black);
Font font1 = new Font("mistral", Font.BOLD, 20);
g.setFont(font1);
g.drawString("Perumahan", 457, 520);

}
}
}