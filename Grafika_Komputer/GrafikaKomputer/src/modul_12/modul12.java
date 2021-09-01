import java.awt.*;
import java.awt.event.*;
public class modul12 extends Frame implements Runnable {
Thread animation;
// Mengatur waktu delay
int frameDelay = 100;
// Objek yang akan ditampilkan
String frames[] = {"*","**","***","****","*****","****","***","**","*"};
// Menentukan variabel yang diperlukan
int numFrames = frames.length;
int currentFrame = 0;
long lastDisplay = 0;
int screenWidth = 400; //lebar layar
int screenHeight = 400; //tinggi layar
public static void main(String args[]) {
modul12 app = new modul12();
}
public modul12() {
super("Animasi Sederhana");
setup();
setSize(screenWidth,screenHeight);
addWindowListener(new WindowEventHandler());
show();
animation = new Thread(this);
animation.start();
}
void setup() {
setupMenuBar();
setFont(new Font("default",Font.BOLD,18)); //mengatur font
}
void setupMenuBar() {
MenuBar menuBar = new MenuBar();
Menu fileMenu = new Menu("File");
MenuItem fileExit = new MenuItem("Tutup");
fileExit.addActionListener(new MenuItemHandler());
fileMenu.add(fileExit);
menuBar.add(fileMenu);
setMenuBar(menuBar);
}
public void paint(Graphics g) {
g.drawString(frames[currentFrame],100,175); //membuat frame
    }
public void run() {
// membuat animasi (perulangan)
do {
long time = System.currentTimeMillis();
if(time - lastDisplay > frameDelay) {
repaint();
try {
Thread.sleep(frameDelay); //berhenti selama frameDelay=100
}catch(InterruptedException ex){
}
++currentFrame;
currentFrame %= numFrames;
lastDisplay = time;
    }
} while (true);
    }
class MenuItemHandler implements ActionListener, ItemListener {
public void actionPerformed(ActionEvent ev){
String s=ev.getActionCommand();
if("Exit".equals(s)){
    System.exit(0);
    }
}
public void itemStateChanged(ItemEvent e){
    }
}
//Kelas yang digunakan agar tombol close pada frame bisa berfungsi
class WindowEventHandler extends WindowAdapter {
public void windowClosing(WindowEvent e){
    System.exit(0);
        }
    }
}
