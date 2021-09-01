package  uas_grafika;

import java.awt.BasicStroke;
import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.geom.*;
import javax.swing.SwingUtilities;


public class uas_grafika {

 public static void main( String [] args ) {
     JFrame frame = new JFrame();
     frame.setSize(1365, 730);
     final RPanel rPanel=new RPanel();
     frame.add(rPanel);
     frame.setVisible( true );
     frame.setTitle("Grafika Komputer");
     frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            super.windowClosing(e);
            rPanel.stop();
            System.exit(0);
        }    
    });     
}
}

class RPanel extends JPanel implements Runnable {

private float mWind = 1.05f; //arahangin
private float mGravity = 9.8f;
private double mRainChance = 0.99; //  0 to 1

private int mRepaintTimeMS = 16;
private float mRainWidth=1;
private double mDdropInitialVelocity = 20;
private double mDropDiam = 2;
private Color mColor= WHITE;
private Color lColor= WHITE;
private Color yColor= WHITE;
int x = 0;
int y = 800;


int x1=1110,y1=600,batase= 240;
   
Thread t = new Thread(this);
Thread animasi, repaint;
int xrang=0,yrang=450,a=450, batas = 1365;
int xOrang = -100, yOrang = 450, v = 1;

// <editor-fold defaultstate="collapsed" desc="Array">
private ArrayList<Rain> rainV;
private ArrayList<Drop> dropV;
private UpdateThread mUpdateThread;
 // </editor-fold>

public RPanel() {
    setPreferredSize(new Dimension(1365, 730));
    setFocusable(true);
    rainV = new ArrayList<>();
    dropV = new ArrayList<>();
    mUpdateThread=new UpdateThread();
    mUpdateThread.start();
    setBackground (new Color (47, 19, 3));
    requestFocusInWindow();
    initThread();
    //untuk memulai thread
    animasi.start();
    repaint.start();   
}

public void stop() {
    mUpdateThread.stopped=true;
}

public int getHeight() {
    return this.getSize().height;
}
public int getWidth() {
    return this.getSize().width;
}
    @Override
public void run() {
         repaint();
    }
    
private void initThread() {
        
        animasi = new Thread(new Runnable() {

            public void run() {
                while (true) {
                   
                    if (xOrang < 1365) {
                        if (v == 1) {
                            xOrang = xOrang + 10;
                            v = 2;
                        } else {
                            xOrang = xOrang + 10;
                            v = 1;
                        }
                    } else {
                        xOrang = -100;
                    }
                   
                    try {
                        //untuk mengatur kecepatan thread, semakin kecil nilai semakin cepat
                        Thread.sleep(150);
                    } catch (Exception e) {
                    }
                }
            }
        });

        repaint = new Thread(new Runnable() {

            public void run() {
                while (true) {
                    
                    if(a<batas){
                        a=a+15;
                        batas=240;
                    }else{
                        a=a-15;
                        batas=15;
                    }
                    try {
                        //untuk mengatur kecepatan thread, semakin kecil nilai semakin cepat
                       Thread.sleep(mRepaintTimeMS);
                    } catch (Exception e) {
                    }
                    //untuk memanggil repaint
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            repaint();
                        }
                    });
                }
            }
        });
    }
    
public void drawOrang(Graphics2D g2,int xrang, int yrang, int v) {
        g2.setStroke(new BasicStroke(6, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        Ellipse2D kepala = new Ellipse2D.Double(xrang + 38, yrang + 10, 20, 20);

       GeneralPath gp = new GeneralPath();
        gp.moveTo(xrang + 46, yrang + 32);
        gp.lineTo(xrang + 34, yrang + 52);
        gp.lineTo(xrang + 27, yrang + 73);

        gp.moveTo(xrang + 46, yrang + 32);
        gp.lineTo(xrang + 54, yrang + 55);
        gp.lineTo(xrang + 71, yrang + 72);

        gp.moveTo(xrang + 46, yrang + 32);
        gp.lineTo(xrang + 46, yrang + 69);
        gp.lineTo(xrang + 46, yrang + 93);
        gp.lineTo(xrang + 26, yrang + 112);

        gp.moveTo(xrang + 46, yrang + 69);
        gp.lineTo(xrang + 59, yrang + 93);
        gp.lineTo(xrang + 66, yrang + 118);
//=============================================================
        Ellipse2D kepala1 = new Ellipse2D.Double(xrang + 42, yrang + 10, 20, 20);
       GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(xrang + 46, yrang + 29);
        gp1.lineTo(xrang + 40, yrang + 48);
        gp1.lineTo(xrang + 40, yrang + 77);

        gp1.moveTo(xrang + 46, yrang + 29);
        gp1.lineTo(xrang + 49, yrang + 58);
        gp1.lineTo(xrang + 51, yrang + 74);

        gp1.moveTo(xrang + 46, yrang + 29);
        gp1.lineTo(xrang + 46, yrang + 68);
        gp1.lineTo(xrang + 52, yrang + 90);
        gp1.lineTo(xrang + 46, yrang + 120);

        gp1.moveTo(xrang + 46, yrang + 68);
        gp1.lineTo(xrang + 60, yrang + 92);
        gp1.lineTo(xrang + 38, yrang + 106);

        g2.setColor(new Color (100, 100,80));        
        if (v == 1) {
            g2.fill(kepala);
            g2.draw(gp);
            g2.draw(kepala);
        } else if (v == 2) {
            g2.fill(kepala1);
            g2.draw(gp1);
            g2.draw(kepala1);
        }
    }
   
private class UpdateThread extends Thread {
    public volatile boolean stopped=false;
    @Override
    public void run() {
        while (!stopped) {
            RPanel.this.repaint();
            try {
                Thread.sleep(180);
               
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
                 while (true) {
                 if (x <= 1365) {
                 y--;
                 x++;
                 }
                 else {
                 x=0;
                 y=800;
                     }
                 try {
                 repaint();
                 Thread.sleep(mRepaintTimeMS);
                  System.out.println(t);
                 } catch (Exception e) {
                 }                      
                 }           
        }
  
    }
}

@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    Graphics2D g2D = (Graphics2D) g;
    
    // <editor-fold defaultstate="collapsed" desc="warnawarni">
    //warnawarni========================================================================
    
    
       
    //==================================================================================
        GradientPaint lay = new GradientPaint(100, 100,new Color(0, 30, 60),100, 300, Color.CYAN);
       g2.setPaint(lay);
       g2.fill(new Rectangle2D.Double(0, 0, 1365, 370));
       
 
  // </editor-fold>
           
    // <editor-fold defaultstate="collapsed" desc="awan3">
    //awan3============================================
        g2.setColor(yColor);
        Shape e9 = new Ellipse2D.Double(y, 20, 60, 30);
        g2.fill(e9);
        Shape e10 = new Ellipse2D.Double(y+35, 10, 50, 50);
        g2.fill(e10);
        Shape e10a = new Ellipse2D.Double(y+15, 10, 50, 50);
        g2.fill(e10a);
        Shape e10b = new Ellipse2D.Double(y+55, 10, 50, 50);
        g2.fill(e10b);
        Shape e11 = new Ellipse2D.Double(y+60, 20, 60, 30);
        g2.fill(e11);
    //================================================= 
    // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="Matahari">
    // Matahari
        Shape e1 = new Ellipse2D.Double(550, 50, 100, 100);
        GradientPaint g1 = new GradientPaint(535, 80, Color.ORANGE, 550, 130, Color.YELLOW);
        g2.setPaint(g1);
        g2.fill(e1);

        //sinar matahari       
        g2.drawLine(500, 20, 580, 55);
        g2.drawLine(450, 60, 560, 80);
        g2.drawLine(430, 140, 570, 120);
        g2.drawLine(470, 200, 600, 140);
        g2.drawLine(550, 230, 600, 160);
        g2.drawLine(640, 10, 590, 90);
        g2.drawLine(730, 30, 600, 100);
        
        //awan3 menutupi matahari : sebelah kiri bawah
        g2.setColor(Color.white);
        Shape e12 = new Ellipse2D.Double(520, 130, 60, 30);// x,y,lengkungan
        g2.fill(e12);
        Shape e13 = new Ellipse2D.Double(555, 120, 50, 50);
        g2.fill(e13);
        Shape e13a = new Ellipse2D.Double(535, 120, 50, 50);
        g2.fill(e13a);
        Shape e13b = new Ellipse2D.Double(575, 120, 50, 50);
        g2.fill(e13b);
        Shape e14 = new Ellipse2D.Double(580, 130, 60, 30);
        g2.fill(e14);

        //awan4 menutupi matahari : sebelah kanan atas
        g2.setColor(Color.white);
        Shape e15 = new Ellipse2D.Double(580, 100, 60, 30);// x,y,lengkungan
        g2.fill(e15);
        Shape e16 = new Ellipse2D.Double(605, 90, 50, 50);
        g2.fill(e16);
        Shape e16a = new Ellipse2D.Double(595, 90, 50, 50);
        g2.fill(e16a);
        Shape e16b = new Ellipse2D.Double(635, 90, 50, 50);
        g2.fill(e16b);
        Shape e17 = new Ellipse2D.Double(640, 100, 60, 30);
        g2.fill(e17);

        //========================
    // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="gunung">
    //gunung
    //========= GUNUNG LINGKARAN =============
    GradientPaint g3 = new GradientPaint(1035, 80, Color.GREEN, 1050, 130, Color.GREEN);
    g2.setPaint(g3);
    g2.fillArc(200, 175, 400, 400, 0, 180); //gunung
    g2.fillArc(0, 200, 600, 350, 90,90 ); //gunung
    g2.fillArc(550, 100, 500, 550, 0, 180); //gunung
    g2.fillArc(750, 200, 700, 350, 0, 180); //gunung    
   //=======================================
    // </editor-fold>
         
    // <editor-fold defaultstate="collapsed" desc="awan2">
         //awan2=======================================
         g2.setColor(lColor);
        Shape c6 = new Ellipse2D.Double(x, 75, 60, 30);
        g2.fill(c6);
        Shape e7 = new Ellipse2D.Double(x+35, 65, 50, 50); // x,y,lengkungan
        g2.fill(e7);
        Shape e7a = new Ellipse2D.Double(x+15, 65, 50, 50);
        g2.fill(e7a);
        Shape e7b = new Ellipse2D.Double(x+55, 65, 50, 50);
        g2.fill(e7b);
        Shape e8 = new Ellipse2D.Double(x+60, 75, 60, 30);
        g2.fill(e8);
    //===========================================
    // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="jalan">
      //Membuat jalan lurus
        g.setColor(Color.black);
        g.fillRect(0, 500, 1365, 80); 
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="garis jalan">
        g2D.setColor(Color.white);
        float[] dash = {20.0f};
        BasicStroke strok = new BasicStroke(3.0f, BasicStroke.CAP_SQUARE,
        BasicStroke.JOIN_MITER, 1.0f, dash, 0.0f);
        g2D.setStroke(strok);
        g2D.draw(new Line2D.Double(10, 540, 1365, 540));
    // </editor-fold>
      
    // <editor-fold defaultstate="collapsed" desc="rumah">
     //atap rumah
     int x[] = {1200, 1300, 1100};
     int y[] = {250, 350, 350};
     g.setColor(new Color(76, 2, 2));
     g.fillPolygon(x, y, 3);
     
      //tembok rumah 
     int a[] = {1300, 1100, 1100, 1300};
     int b[] = {350, 350, 450, 450}; 
     g.setColor(new Color(40, 44, 2)); 
     g.fillPolygon(a, b, 4);
     
     //pintu rumah 
     int c[] = {1200, 1250, 1250, 1200}; 
     int d[] = {370, 370, 450, 450}; 
     g.setColor(new Color(118,69, 2)); 
     g.fillPolygon(c, d, 4);
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="rumah biru">
//cerobong asap
g.setColor(Color.black);
g.fillRect(790,388, 10,20);
//atap rumah
g.setColor(Color.black);
g.fillArc(750, 360, 70,70, -135, 90);
g.fillArc(830, 360, 70,70, -135, 90);
g.fillRect(784,395,80,25);
//warna tembok
g.setColor(Color.blue);
g.fillRect(760,420, 130,60);
//pintu
g.setColor(Color.white);
g.fillRect(780,450, 15,30);
//jendela
g.setColor(Color.orange);
g.fillRect(805,440, 20,20);
g.fillRect(845,440, 20,20);
// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="pohon">
        g.setColor(new Color(50, 148, 19));
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
        g.fillOval(680,380, 30,40);
        g.fillOval(670, 400, 30,30);
        g.fillOval(690, 400, 30,30);
        g.setColor(new Color (162, 81, 31));
        g.fillRect(690,420,9 ,60 );

        g.setColor(new Color(50, 148, 19));
        g.fillOval(800,300, 30,40);
        g.fillOval(790, 320, 30,30);
        g.fillOval(810, 320, 30,30);
        g.setColor(new Color (162, 81, 31));
        g.fillRect(810,340,9 ,60 );
        
        g.setColor(new Color(50, 148, 19));
        g.fillOval(890,300, 30,40);
        g.fillOval(880, 320, 30,30);
        g.fillOval(900, 320, 30,30);
        g.setColor(new Color (162, 81, 31));
        g.fillRect(900,340,9 ,60 );
        
        g.setColor(new Color(50, 148, 19));
        g.fillOval(990,300, 30,40);
        g.fillOval(980, 320, 30,30);
        g.fillOval(1000, 320, 30,30);
        g.setColor(new Color (162, 81, 31));
        g.fillRect(1000,340,9 ,60 );
        
        g.setColor(new Color(50, 148, 19));
        g.fillOval(990,380, 30,40);
        g.fillOval(980, 400, 30,30);
        g.fillOval(1000, 400, 30,30);
        g.setColor(new Color (162, 81, 31));
        g.fillRect(1000,420,9 ,60 );
        
        g.setColor(new Color(50, 148, 19));
        g.fillOval(1290,410, 30,40);
        g.fillOval(1280, 430, 30,30);
        g.fillOval(1300, 430, 30,30);
        g.setColor(new Color (162, 81, 31));
        g.fillRect(1300,440,9 ,60 );
        
        g.setColor(new Color(50, 148, 19));
        g.fillOval(1290,280, 30,40);
        g.fillOval(1280, 300, 30,30);
        g.fillOval(1300, 300, 30,30);
        g.setColor(new Color (162, 81, 31));
        g.fillRect(1300,320,9 ,60 );
        
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
        
        // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="mesjid">
// mesjid
g2.setColor(new Color(220, 134, 0));//warna hijau
g2.fillOval(234,300, 66,75);//kubah
g2.fillOval(180, 320, 16, 30);
g2.fillOval(340, 320, 16, 30);

g2.setColor(new Color(171, 170, 161));//warna abu-abu
g2.fillRect(232, 343, 70, 120);
g2.fillRect(195, 360, 30, 103);
g2.draw3DRect(195, 360, 30, 103,true);
g2.fillRect(165, 385, 20, 80);
g2.draw3DRect(165, 385, 20, 80,true);
g2.fillRect(310, 360, 30, 103);
g2.draw3DRect(310, 360, 29, 103,true);
g2.fillRect(350, 385, 20, 80);
g2.draw3DRect(350, 385, 20, 80,true);

g2.setColor(Color.gray);
g2.fillRect(235, 333, 65, 5);

g2.setColor(new Color(244, 249, 21));//kuning
g2.fillOval(242,350, 50,50);
g2.fillRect(242, 375, 50, 80);
//pintu kecil
g2.fillRect(318, 370, 15, 20);
g2.fillRect(318, 400, 15, 20);
g2.fillRect(318, 430, 15, 20);
g2.fillRect(203, 370, 15, 20);
g2.fillRect(203, 400, 15, 20);
g2.fillRect(203, 430, 15, 20);

g2.setColor(new Color(220, 134, 0));//warna hijau
g2.fillOval(154, 355, 12, 15);
g2.fillOval(369, 355, 12, 15);

g2.setColor(Color.white);
g2.fillRect(225, 338, 85, 5); //garis atas
g2.fillRect(180, 330, 15, 134);//garis samping
g2.fillRect(340, 330, 15, 134);//garis samping
g2.fillRect(155, 365, 10, 100);
g2.fillRect(370, 365, 10, 100);

g2.setColor(new Color(220, 134, 0));//warna hijau
g2.fillRect(225, 343, 10, 120);
g2.fillRect(300, 343, 10, 120);
g2.draw3DRect(180, 330, 15, 134,true);
g2.draw3DRect(340, 330, 15, 134,true);

g2.setColor(new Color(220, 134, 0));//warna coklat
g2.fillArc (262,360,30,30,0,90);
g2.fillRect(277, 375, 15, 80);
g2.fillArc (241,360,35,35,90,90);
g2.fillRect(242, 375, 16, 80);
g2.draw3DRect(155, 365, 10, 100,true);
g2.draw3DRect(370, 365, 10, 100,true);

g2.setColor(Color.black);
g2.fillOval(280,410, 7,7);
g2.fillOval(248,410, 7,7);
 // </editor-fold>
     
      
    // <editor-fold defaultstate="collapsed" desc="semak">   
     int xmak[] = {600, 630, 500};
     int ymak[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak, ymak, 3);
   
     int xmak1[] = {650, 680, 620};
     int ymak1[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak1, ymak1, 3);
     
     int xmak2[] = {700, 730, 670};
     int ymak2[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak2, ymak2, 3);
     
     int xmak3[] = {750, 780, 720};
     int ymak3[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak3, ymak3, 3);
     
     int xmak4[] = {800, 830, 770};
     int ymak4[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak4, ymak4, 3);
     
     int xmak5[] = {850, 880, 820};
     int ymak5[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak5, ymak5, 3);
     
     int xmak6[] = {900, 930, 870};
     int ymak6[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak6, ymak6, 3);
     
     int xmak7[] = {950, 980, 920};
     int ymak7[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak7, ymak7, 3);
     
     int xmak8[] = {1000, 1030, 970};
     int ymak8[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak8, ymak8, 3);
     
     int xmak9[] = {1050, 1080, 1030};
     int ymak9[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak9, ymak9, 3);
     
     int xmak10[] = {1100, 1130, 1080};
     int ymak10[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak10, ymak10, 3);
     
     int xmak11[] = {1150, 1180, 1080};
     int ymak11[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak11, ymak11, 3);
     
     int xmak12[] = {1200, 1230, 1130};
     int ymak12[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak12, ymak12, 3);
     
     int xmak13[] = {1250, 1280, 1180};
     int ymak13[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak13, ymak13, 3);
     
     int xmak14[] = {1350, 1330, 1230};
     int ymak14[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak14, ymak14, 3);
     
     int xmak15[] = {1400, 1380, 1280};
     int ymak15[] = {600, 730, 730};
     g.setColor(new Color(44, 133, 55));
     g.fillPolygon(xmak15, ymak15, 3);
     
      //semak
    g.setColor(new Color (73, 195, 12));
    g.fillOval(250, 650, 300, 100);
    g.fillOval(0, 600, 300, 200);
    g.fillOval(-90, 580, 200, 300);
    
    // </editor-fold>
    
    drawText(g2);
     
    // <editor-fold defaultstate="collapsed" desc="suketsuket">
        g.setColor(Color.green);
        g.fillOval(0, 470, 30,30);
        g.fillOval(25, 470, 30,30);
        g.fillOval(50, 470, 30,30);
        g.fillOval(15, 450, 30,30);
        g.fillOval(32, 450, 30,30);

        g.fillOval(90, 470, 30,30);
        g.fillOval(115, 470, 30,30);
        g.fillOval(140, 470, 30,30);
        g.fillOval(105, 450, 30,30);
        g.fillOval(122, 450, 30,30);

        g.fillOval(180, 470, 30,30);
        g.fillOval(205, 470, 30,30);
        g.fillOval(230, 470, 30,30);
        g.fillOval(195, 450, 30,30);
        g.fillOval(212, 450, 30,30);

        g.fillOval(270, 470, 30,30);
        g.fillOval(295, 470, 30,30);
        g.fillOval(320, 470, 30,30);
        g.fillOval(285, 450, 30,30);
        g.fillOval(302, 450, 30,30);
        
        g.fillOval(360, 470, 30,30);
        g.fillOval(385, 470, 30,30);
        g.fillOval(410, 470, 30,30);
        g.fillOval(375, 450, 30,30);
        g.fillOval(392, 450, 30,30);
        
        g.fillOval(510, 470, 30,30);
        g.fillOval(535, 470, 30,30);
        g.fillOval(560, 470, 30,30);
        g.fillOval(525, 450, 30,30);
        g.fillOval(542, 450, 30,30);

        g.fillOval(600, 470, 30,30);
        g.fillOval(625, 470, 30,30);
        g.fillOval(650, 470, 30,30);
        g.fillOval(615, 450, 30,30);
        g.fillOval(632, 450, 30,30);
        
        g.fillOval(600, 470, 30,30);
        g.fillOval(625, 470, 30,30);
        g.fillOval(650, 470, 30,30);
        g.fillOval(615, 450, 30,30);
        g.fillOval(632, 450, 30,30);
       
        g.fillOval(650, 470, 30,30);
        g.fillOval(675, 470, 30,30);
        g.fillOval(700, 470, 30,30);
        g.fillOval(665, 450, 30,30);
        g.fillOval(682, 450, 30,30);
        
        g.fillOval(740, 470, 30,30);
        g.fillOval(765, 470, 30,30);
        g.fillOval(790, 470, 30,30);
        g.fillOval(755, 450, 30,30);
        g.fillOval(772, 450, 30,30);
        
        g.fillOval(830, 470, 30,30);
        g.fillOval(855, 470, 30,30);
        g.fillOval(880, 470, 30,30);
        g.fillOval(845, 450, 30,30);
        g.fillOval(862, 450, 30,30);
        
        g.fillOval(920, 470, 30,30);
        g.fillOval(945, 470, 30,30);
        g.fillOval(970, 470, 30,30);
        g.fillOval(935, 450, 30,30);
        g.fillOval(952, 450, 30,30);
        
        g.fillOval(940, 470, 30,30);
        g.fillOval(965, 470, 30,30);
        g.fillOval(990, 470, 30,30);
        g.fillOval(955, 450, 30,30);
        g.fillOval(972, 450, 30,30);
        
        g.fillOval(1030, 470, 30,30);
        g.fillOval(1055, 470, 30,30);
        g.fillOval(1080, 470, 30,30);
        g.fillOval(1045, 450, 30,30);
        g.fillOval(1062, 450, 30,30);
    
        g.fillOval(1120, 470, 30,30);
        g.fillOval(1145, 470, 30,30);
        g.fillOval(1170, 470, 30,30);
        g.fillOval(1135, 450, 30,30);
        g.fillOval(1152, 450, 30,30);
        
        g.fillOval(1220, 470, 30,30);
        g.fillOval(1245, 470, 30,30);
        g.fillOval(1270, 470, 30,30);
        g.fillOval(1235, 450, 30,30);
        g.fillOval(1252, 450, 30,30);
        
        g.fillOval(1260, 470, 30,30);
        g.fillOval(1285, 470, 30,30);
        g.fillOval(1310, 470, 30,30);
        g.fillOval(1245, 460, 30,30);
        g.fillOval(1292, 470, 30,30);
     // </editor-fold>
     
    // <editor-fold defaultstate="collapsed" desc="mobil ke 2">    
     //========== mobil
g.setColor(new Color(255, 190, 0));
g.fillRect(130,495,100,30 ); //badan bawah
g.fillOval(130,470,100,45); //badan atas
g.fillArc (100,488,60,70,0,180);// atas ban
g.fillArc (205,488,60,70,0,180);// atas ban
g.setColor(Color.yellow);
g.fillArc (238,491,23,23,0,80);// lampu
g.setColor(Color.black); //ban
g.fillOval(118, 503, 32,32); //ban
g.fillOval(218, 503, 32,32); //ban
g.setColor(Color.white); //ban
g.fillOval(124, 509, 20,20); //ban
g.fillOval(224, 509, 20,20); //ban
g.setColor(Color.yellow);
g.fillArc (150,475,70,40,0,90);// atas ban
g.setColor(Color.black);
g.fillArc (154,476,64,36,0,90);// atas ban
g.setColor(Color.yellow);
g.fillArc (140,475,70,40,90,90);// atas ban
g.setColor(Color.black);
g.fillArc (143,476,68,36,90,90);// atas ban
g.setColor(Color.yellow);
g.fillRect(178,476,10,18 );
// </editor-fold>
 
    // <editor-fold defaultstate="collapsed" desc="mobil">
    //mobil
//depan mobil
g.setColor(Color.LIGHT_GRAY);
g.fillOval(703, 495, 25, 25);
//badan mobil
g.setColor(Color.RED);
g.fillRect(700, 470, 15, 10);
g.fill3DRect(710, 495, 10, 25, true);
g.fill3DRect(620, 470, 90, 50,true);
//ban mobil
g.setColor(Color.WHITE);
g.fillOval(635, 505, 22, 22);
g.setColor(Color.DARK_GRAY);
g.fillOval(635, 510, 22, 22);
g.setColor(Color.WHITE);
g.fillOval(690, 505, 22, 22);
g.setColor(Color.DARK_GRAY);
g.fillOval(690, 510, 22, 22);
    // </editor-fold>   
    
    // <editor-fold defaultstate="collapsed" desc="bendera">
    //bendera
g.setColor(Color.red);
g.fillRect(900,320,100 ,35 );
g.setColor(Color.white);
g.fillRect(900,350,100 ,35 );
g.fillRect(900,350,5 ,150 );
// </editor-fold>

    
    
    
    drawOrang(g2, xOrang, yOrang, v); 
    
    // <editor-fold defaultstate="collapsed" desc="Udan">
                 //DRAW RAIN
    g2.setColor(mColor);
    g2.setStroke(new BasicStroke(mRainWidth));
    Iterator<Rain> iterator = rainV.iterator();
    while (iterator.hasNext()) {
        Rain rain = iterator.next();
        rain.update();
        rain.draw(g2);
        if (rain.y >= getHeight()) {
            //create new drops (2-8)
            long dropCount = 1 + Math.round(Math.random() * 4);
            for (int i = 0; i < dropCount; i++) {
                dropV.add(new Drop(rain.x, getHeight()));
            }
            iterator.remove();
        }
    }
                //DRAW DROPS
     g2.setColor(mColor);
     Iterator<Drop> iterator2 = dropV.iterator();
        while (iterator2.hasNext()) {
            Drop drop = iterator2.next();
            drop.update();
            drop.draw(g2);

            if (drop.y >= getHeight()) {
                iterator2.remove();
            }
        }
        //CREATE NEW RAIN
        if (Math.random() < mRainChance) {
            rainV.add(new Rain());
        }       
    }

//*****************************************
public void drawText(Graphics2D g2) {
        GradientPaint g1 = new GradientPaint(1035, 125, Color.ORANGE, 1050, 130, Color.WHITE);
        g2.setFont(new Font("Comic sans ms", 1, 20));
        g2.setPaint(g1);
        g2.drawString("By: Khairul Aqram", 40+x1, 40+y1);
        g2.drawString("NIM : 190170125", 60+x1, 60+y1);
    }

class Rain {
    float x;
    float y;
    float prevX;
    float prevY;

public Rain() {
        Random r = new Random();
        x = r.nextInt(getWidth());
        y = 0;
    }

public void update() {
        prevX = x;
        prevY = y;
        x += mWind;
        y += mGravity;
    }

public void draw(Graphics2D g2) {
        Line2D line = new Line2D.Double(x, y, prevX, prevY);
        g2.draw(line);
    }
}

//*****************************************
private class Drop {

    double x0;  
    double y0;  
    double v0; //initial velocity
    double t;  //time
    double angle;
    double x;
    double y;

public Drop(double x0, double y0) {
        super();
        this.x0 = x0;
        this.y0 = y0;

        v0 = mDdropInitialVelocity;
        angle = Math.toRadians(Math.round(Math.random() * 180)); //from 0 - 180 degrees
    }

private void update() {
        // double g=10;
        t += mRepaintTimeMS / 100f;
        x = x0 + v0 * t * Math.cos(angle);
        y = y0 - (v0 * t * Math.sin(angle) - mGravity * t * t / 2);
    }

public void draw(Graphics2D g2) {
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, mDropDiam, mDropDiam);
        g2.fill(circle);
    }   
}
}