package helikopter;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

public class helikopter extends JFrame {
 public static void main(String[] args){
  new helikopter();
 }
 public helikopter() {
 this.setSize(900, 700); // MEMBUAT WINDOW
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.add(new PaintSurface(), BorderLayout.CENTER);
 AnimationThread t = new AnimationThread(this); //initialitation of thred variabel t
 t.start();
 this.show();
 }
}

class AnimationThread extends Thread {
 JFrame c;
 public AnimationThread(JFrame c){
  this.c = c;
 }
 public void run(){
  while(true){
    c.repaint(); // MENGHAPUS GAMBAR SETELAH BERPUTAR(delete picture after spining)
    try{
     Thread.sleep(20); // this is can set speed of animations as known fps(frame per second) 1000 same as 1 second so if you change to less than before so it make faster tahn before
    }
   catch(InterruptedException ex){}
  }
}
}

class PaintSurface extends JComponent{
    double x_pos = 100;
    int j = 0;
    int jb = 0;
    int jb1 = 0;
    int jb2 = 0;
    int jb3 = 0;
    int jb4 = 0;
    int jb5 = 0;
    int jb6 = 0;
    int jb7 = 0;

    int y0 = -145;
    int y1 = -35;
    int y2 = 75;
    int y3 = 185;
    int y4 = 295;
    int y5 = 405;
    int y6 = 515;
    int y7 = 625;
    int y8 = 725;

    //variabel gunung(variable for mountains)
    int gg = 0;
    int gg1 = 0;
    int gg2 = 0;
    int gg3 = 0;
    int gg4 = 0;
   
    double y_pos = 100;
    int rotation = 0;
    double angle = 0;
   
   
   
   
 public void paint(Graphics g){
  Graphics2D g2 = (Graphics2D)g; // MEMBERI VARIABLE G PADA GRAPHIC KE G2
  g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
     

    //Background
    g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, 900,700);
       
       
   
//Mountain1
        int m11 = (-161+gg);
        int m12 = (-100+gg);
        int m13 = (-14+gg);
        int m14 = (64+gg);
    g.setColor(new Color(125,125,0));
        int g11[] = {m11,m12,m13,m14,m11};
        int g21[] = {500,408,390,500,500};
        if(m11>=900){gg=-64;}
        int g31 = 5;
        g.fillPolygon(g11,g21,g31);
   
//Mountain 2
        int m21 = (18+gg1);
        int m22 = (110+gg1);
        int m23 = (231+gg1);
        int m24 = (312+gg1);
        if(m21>=900){gg1=-312;}
    g.setColor(new Color(200,200,0));
        int g12[] = {m21,m22,m23,m24,m21};
        int g22[] = {500,382,401,500,500};
        int g32 = 5;
        g.fillPolygon(g12,g22,g32);
//Gunung 3(mountain 3)
        int m31 = (274+gg2);
        int m32 = (370+gg2);
        int m33 = (437+gg2);
        int m34 = (592+gg2);
        if(m31>=900){gg2=-592;}
    g.setColor(new Color(150,150,0));
        int g13[] = {m31,m32,m33,m34,m31};
        int g23[] = {500,366,376 ,500,500};
        int g33 = 5;
        g.fillPolygon(g13,g23,g33);
//Mountain 4
        int m41 = (520+gg3);
        int m42 = (571+gg3);
        int m43 = (662+gg3);
        int m44 = (748+gg3);
        int m45 = (808+gg3);
        int m46 = (857+gg3);
        if(m41>=900){gg3=-857;}
    g.setColor(new Color(100,100,0));
        int g14[] = {m41,m42,m43,m44,m45,m46,m41};
        int g24[] = {500,351,380,429,405,500,500};
        int g34 = 7;
        g.fillPolygon(g14,g24,g34);
//Mountain 5
        int m51 = (821+gg4);
        int m52 = (928+gg4);
        int m53 = (1037+gg4);
        int m54 = (1250+gg4);
        if(m51>=900){gg4=-1250;}
    g.setColor(new Color(200,200,0));
        int g15[] = {m51,m52,m53,m54,m51};
        int g25[] = {500,371,435,500,500};
        int g35 = 5;
        g.fillPolygon(g15,g25,g35);

       
       
//Jalan Raya(this is code for the roads)
    g.setColor(Color.green);
        g.fillRect(0, 500, 900, 200);
    g.setColor(Color.gray);
        g.fillRect(0, 530, 900, 100);
    g.setColor(Color.WHITE);
   
    if(y0>=900){y0=-65;}
    if(y1>=900){y1=-65;}
    if(y2>=900){y2=-65;}
    if(y3>=900){y3=-65;}
    if(y4>=900){y4=-65;}
    if(y5>=900){y5=-65;}
    if(y6>=900){y6=-65;}
    if(y7>=900){y7=-65;}
    if(y8>=900){y8=-65;}

        g.fillRect(y0, 570, 65, 10);
        g.fillRect(y1, 570, 65, 10);
        g.fillRect(y2, 570, 65, 10);
        g.fillRect(y3, 570, 65, 10);
        g.fillRect(y4, 570, 65, 10);
        g.fillRect(y5, 570, 65, 10);
        g.fillRect(y6, 570, 65, 10);
        g.fillRect(y7, 570, 65, 10);
        g.fillRect(y8, 570, 65, 10);

      
//variabel yang digunakan objek bintang(this is variable for stars)      
        int pos0 = 100;
        int pos = 200;
        int pos1 = 100;
        int pos3 = 400;
        int pos4 = 450;
        int pos5 = 700;
        int pos6 = 600;
        int pos7 = 830;
        int pos8 = 0;
        int pos9 = 0;
        int pos10 = 0;
        int pos11 = 0;
        int pos12 = 0;
        int pos13 = 0;
        int pos14 = 0;
       
       
//Bintang 1(source code for star 1)
        int x1 = (0+jb+pos0);
        int x2 = (14+jb+pos0);
        int x3 = (16+jb+pos0);
        int x4 = (17+jb+pos0);
        int x5 = (31+jb+pos0);
        int x6 = (18+jb+pos0);
        int x7 = (16+jb+pos0);
        int x8 = (14+jb)+pos0;
        if(x1>=900){jb=-131;}

    g.setColor(Color.WHITE); 
        int r4[] = {x1, x2, x3, x4, x5, x6, x7, x8, x1};
    int r2[] = {17, 16, 0, 16, 17 , 19, 35, 20, 17};
    int r3 = 8;
        g.fillPolygon(r4, r2, r3);

//Bintang 2(source code for star 2)
        int x12 = (0+jb1+pos);
        int x22 = (14+jb1+pos);
        int x32 = (16+jb1+pos);
        int x42 = (17+jb1+pos);
        int x52 = (31+jb1+pos);
        int x62 = (18+jb1+pos);
        int x72 = (16+jb1+pos);
        int x82 = (14+jb1+pos);
       
        if(x12>=900){jb1=-231;}
       

    g.setColor(Color.WHITE); 
        int r42[] = {x12, x22, x32, x42, x52, x62, x72, x82, x12};
    int r22[] = {17+pos1, 16+pos1, 0+pos1, 16+pos1, 17+pos1, 19+pos1, 35+pos1, 20+pos1, 17+pos1};
    int r32 = 8;
        g.fillPolygon(r42, r22, r32);

//Bintang 3(source code for star 3)
        int x13 = (0+jb2+pos3);
        int x23 = (14+jb2+pos3);
        int x33 = (16+jb2+pos3);
        int x43 = (17+jb2+pos3);
        int x53 = (31+jb2+pos3);
        int x63 = (18+jb2+pos3);
        int x73 = (16+jb2+pos3);
        int x83 = (14+jb2+pos3);
       
        if(x13>=900){jb2=-431;}
       
       

    g.setColor(Color.WHITE); 
        int r43[] = {x13, x23, x33, x43, x53, x63, x73, x83, x13};
    int r23[] = {17+pos1, 16+pos1, 0+pos1, 16+pos1, 17+pos1, 19+pos1, 35+pos1, 20+pos1, 17+pos1};
    int r33 = 8;
        g.fillPolygon(r43, r23, r33);
       
//Bintang 4(source code for star 4)
        int x14 = (0+jb3+pos4);
        int x24 = (14+jb3+pos4);
        int x34 = (16+jb3+pos4);
        int x44 = (17+jb3+pos4);
        int x54 = (31+jb3+pos4);
        int x64 = (18+jb3+pos4);
        int x74 = (16+jb3+pos4);
        int x84 = (14+jb3+pos4);
       
        if(x14>=900){jb3=-481;}
       

    g.setColor(Color.WHITE); 
        int r44[] = {x14, x24, x34, x44, x54, x64, x74, x84, x14};
    int r24[] = {17+150, 16+150, 0+150, 16+150, 17+150, 19+150, 35+150, 20+150, 17+150};
    int r34 = 8;
        g.fillPolygon(r44, r24, r34);
       
//Bintang 5(source code for star 5)
        int x15 = (0+jb4+pos5);
        int x25 = (14+jb4+pos5);
        int x35 = (16+jb4+pos5);
        int x45 = (17+jb4+pos5);
        int x55 = (31+jb4+pos5);
        int x65 = (18+jb4+pos5);
        int x75 = (16+jb4+pos5);
        int x85 = (14+jb4+pos5);
       
        if(x15>=900){jb4=-731;}

    g.setColor(Color.WHITE); 
        int r45[] = {x15, x25, x35, x45, x55, x65, x75, x85, x15};
    int r25[] = {17+175, 16+175, 0+175, 16+175, 17+175, 19+175, 35+175, 20+175, 17+175};
    int r35 = 8;
        g.fillPolygon(r45, r25, r35);
       
//Bintang 6(source code for star 6)
        int x16 = (0+jb5+pos6);
        int x26 = (14+jb5+pos6);
        int x36 = (16+jb5+pos6);
        int x46 = (17+jb5+pos6);
        int x56 = (31+jb5+pos6);
        int x66 = (18+jb5+pos6);
        int x76 = (16+jb5+pos6);
        int x86 = (14+jb5+pos6);
       
        if(x16>=900){jb5=-631;}

    g.setColor(Color.WHITE); 
        int r46[] = {x16, x26, x36, x46, x56, x66, x76, x86, x16};
    int r26[] = {17+75, 16+75, 0+75, 16+75, 17+75, 19+75, 35+75, 20+75, 17+75};
    int r36 = 8;
        g.fillPolygon(r46, r26, r36);
       
//Bintang 7 (source code for star 7)
        int x17 = (0+jb6+pos7);
        int x27 = (14+jb6+pos7);
        int x37 = (16+jb6+pos7);
        int x47 = (17+jb6+pos7);
        int x57 = (31+jb6+pos7);
        int x67 = (18+jb6+pos7);
        int x77 = (16+jb6+pos7);
        int x87 = (14+jb6+pos7);
       
        if(x17>=900){jb6=-881;}

    g.setColor(Color.WHITE); 
        int r47[] = {x17, x27, x37, x47, x57, x67, x77, x87, x17};
    int r27[] = {17+50, 16+50, 0+50, 16+50, 17+50, 19+50, 35+50, 20+50, 17+50};
    int r37 = 8;
        g.fillPolygon(r47, r27, r37);
       
//Bintang 8 (source code for star 8)
        int x18 = (0+jb7+pos8);
        int x28 = (14+jb7+pos8);
        int x38 = (16+jb7+pos8);
        int x48 = (17+jb7+pos8);
        int x58 = (31+jb7+pos8);
        int x68 = (18+jb7+pos8);
        int x78 = (16+jb7+pos8);
        int x88 = (14+jb7+pos8);
       
        if(x18>=900){jb7=-31;}

    g.setColor(Color.WHITE); 
        int r48[] = {x18, x28, x38, x48, x58, x68, x78, x88, x18};
    int r28[] = {17+130, 16+130, 0+130, 16+130, 17+130, 19+130, 35+130, 20+130, 17+130};
    int r38 = 8;
        g.fillPolygon(r48, r28, r38);
       
       
       
       
    //ekor helychoper(the tail of helychoper)
    g.setColor(Color.RED); 
        int o[] = {460,624,660,720,680 ,515,460};
    int i[] = {316,300,264,264,320 ,389,316};
    int u = 7;
        g.fillPolygon(o, i, u);
      
       //kaki Helichoper(the feet of helychoper)
    g.setColor(Color.ORANGE);
        g.fillRoundRect(333,413,165,19,30,30);
        g.fillRoundRect(359,444,165,19,30,30);
    g.setColor(Color.RED); 
        int w[] = {361,362,380,495,474,361};
    int l[] = {421,428,446,446,421,421};
    int z = 6;
    g.fillPolygon(w,l,z);
       
       //Badan Helychoper(body of Helychoper)
    g.setColor(Color.RED);
        g.fillOval(337, 289, 186, 145);
    g.setColor(Color.BLACK);
        g.drawOval(337, 289, 186, 145);
       

    //penompang baling2 utama
    g.setColor(Color.GRAY);
        g.fillRoundRect(418, 256, 20, 43, 20, 20); 
       
   
    //Baling2 utama  
    int x = 268;
    int y = 228;
    int pjg = 321;
    int tgg = 60;
   
    g.setColor(Color.GREEN);
        g.fillArc(x, y, pjg, tgg, 0+j, 10);
        g.fillArc(x, y, pjg, tgg, 40+j, 10);
        g.fillArc(x, y, pjg, tgg, 80+j, 10);
        g.fillArc(x, y, pjg, tgg, 120+j, 10);
        g.fillArc(x, y, pjg, tgg, 160+j, 10);
        g.fillArc(x, y, pjg, tgg, 200+j, 10);
        g.fillArc(x, y, pjg, tgg, 240+j, 10);
        g.fillArc(x, y, pjg, tgg, 280+j, 10);
        g.fillArc(x, y, pjg, tgg, 320+j, 10);
   g.setColor(new Color(0,119,0));
        g.fillArc(x, y, pjg, tgg, 20+j, 10);
        g.fillArc(x, y, pjg, tgg, 60+j, 10);
        g.fillArc(x, y, pjg, tgg, 100+j, 10);
        g.fillArc(x, y, pjg, tgg, 140+j, 10);
        g.fillArc(x, y, pjg, tgg, 180+j, 10);
        g.fillArc(x, y, pjg, tgg, 220+j, 10);
        g.fillArc(x, y, pjg, tgg, 260+j, 10);
        g.fillArc(x, y, pjg, tgg, 300+j, 10);
        g.fillArc(x, y, pjg, tgg, 340+j, 10);
   g.setColor(new Color(0, 255,255));
        g.fillOval(346,304, 108, 114);
  
        //Penutup baling2 utama
   g.setColor(Color.GRAY);
        g.fillOval(418, 250, 20, 15);
  
        int p = 619;
        int q = 248;
        int p1 = 614;
        int q1 = 243;
        int r = 83;
        int r1 = 93;
   g.setColor(new Color(0, 255, 255));
        g.fillArc(p1, q1, r1, r1, 0+j, 15);
        g.fillArc(p1, q1, r1, r1, 30+j, 15);
        g.fillArc(p1, q1, r1, r1, 60+j, 15);
        g.fillArc(p1, q1, r1, r1, 90+j, 15);
        g.fillArc(p1, q1, r1, r1, 120+j, 15);
        g.fillArc(p1, q1, r1, r1, 150+j, 15);
        g.fillArc(p1, q1, r1, r1, 180+j, 15);
        g.fillArc(p1, q1, r1, r1, 210+j, 15);
        g.fillArc(p1, q1, r1, r1, 240+j, 15);
        g.fillArc(p1, q1, r1, r1, 270+j, 15);
        g.fillArc(p1, q1, r1, r1, 300+j, 15);
        g.fillArc(p1, q1, r1, r1, 330+j, 15);
       
        //Baling2 ekor
  g.setColor(new Color(119,119,119));
        g.fillArc(p, q, r, r, 0+j, 15);
        g.fillArc(p, q, r, r, 30+j, 15);
        g.fillArc(p, q, r, r, 60+j, 15);
        g.fillArc(p, q, r, r, 90+j, 15);
        g.fillArc(p, q, r, r, 120+j, 15);
        g.fillArc(p, q, r, r, 150+j, 15);
        g.fillArc(p, q, r, r, 180+j, 15);
        g.fillArc(p, q, r, r, 210+j, 15);
        g.fillArc(p, q, r, r, 240+j, 15);
        g.fillArc(p, q, r, r, 270+j, 15);
        g.fillArc(p, q, r, r, 300+j, 15);
        g.fillArc(p, q, r, r, 330+j, 15);
       
    g.setColor(new Color(70,70,70));
        g.fillOval(648, 277, 25, 25);
       
        //increment untuk pergerakan semua objek
        //this bellow is increment for make the object move
        //baling2
        j+=6;
       
        //bintang(for the stars)
        jb1+=1;
        jb+=1;
        jb2+=1;
        jb3+=1;
        jb4+=1;
        jb5+=1;
        jb6+=1;
        jb7+=1;
       
        //jalan raya(for the roads)
        y0+=6;
        y1+=6;
        y2+=6;
        y3+=6;
        y4+=6;
        y5+=6;
        y6+=6;
        y7+=6;
        y8+=6;
       
        //gunung(for the mountains)
        gg+=2;
        gg1+=2;
        gg2+=2;
        gg3+=2;
        gg4+=2;
       
}
}