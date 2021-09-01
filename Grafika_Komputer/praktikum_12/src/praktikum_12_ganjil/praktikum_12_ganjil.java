package praktikum_12_ganjil;
import java.awt.*;
import java.awt.event.*;

public class praktikum_12_ganjil extends Frame implements Runnable {

    Thread animation;

    int frameDelay = 300;

    String frames[] = {
        "*    ",
        "**   ",
        "***  ",
        "**** ",
        "*****",
        " ****",
        "  ***",
        "   **",
        "    *",
        "     "
    };

    int numFrames = frames.length;
    int currentFrame = 0;
    long lastDisplay = 0;
    int screenWidth = 500; //lebar layar 
    int screenHeight = 600; //tinggi layar 

    public static void main(String[] args) {
        praktikum_12_ganjil app = new praktikum_12_ganjil(); // membuat objek baru modul_12

    }

    public praktikum_12_ganjil() {
        super("Animasi Sederhana"); // menamakan title window
        setup(); //memanggil fungsi setup
        setSize(screenWidth, screenHeight); //menentukan ukuran window
        addWindowListener(new WindowEventHandler() { //menambahkan fungsi windowlistener
        });
        show();//eksekusi menampilkan window
        animation = new Thread(this); //eksekusi animasi di dalam thread
        animation.start(); // memulai aniasi
    }

    private void setup() {
        setupMenuBar(); // setup menu di atas untuk exit
        setFont(new Font("Courier New", Font.BOLD, 18));// menentukan jenis dan ukuran font

    }

    void setupMenuBar() { // fusngsi setupo untuk menu bar
        MenuBar menuBar = new MenuBar();// membuat objek baru uuntuk menu bar
        Menu fileMenu = new Menu("File");//menambahkan objek yang akan berada di dalam menubar
        MenuItem fileExit = new MenuItem("Tutup");//mendambahkan sub menu yang akan vbera
        fileExit.addActionListener(new MenuItemHandler());
        fileMenu.add(fileExit);
        menuBar.add(fileMenu);
        setMenuBar(menuBar);
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 120; i < 150; i += 10) {
            g.drawString(frames[currentFrame], 60, i);
        }
        
        for (int i = 160; i < 210; i += 10) {
            g.drawString(frames[currentFrame], 80, i);
        }
        
        for (int i = 220; i < 290; i += 10) {
            g.drawString(frames[currentFrame], 100, i);
        }
        
        for (int i = 300; i < 390; i += 10) {
            g.drawString(frames[currentFrame], 120, i);
        }
        
        for (int i = 400; i < 510; i += 10) {
            g.drawString(frames[currentFrame], 140, i);
        }
    }

    @Override
    public void run() {
        do {
            long time = System.currentTimeMillis();
            if (time - lastDisplay > frameDelay) {
                repaint();
                try {
                    Thread.sleep(frameDelay); //berhenti selama frameDelay=100 
                } catch (InterruptedException ex) {
                }
                ++currentFrame;
                currentFrame %= numFrames;
                lastDisplay = time;
            } 
        } while (true);
    }

    public static abstract class WindowEventHandler extends WindowAdapter {

        public WindowEventHandler() {
        }

        @Override
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }

    }

    class MenuItemHandler implements ActionListener, ItemListener {

        public MenuItemHandler() {
        }

        @Override
        public void actionPerformed(ActionEvent av) {
            String s = av.getActionCommand();
            if ("Exit".equals(s)) {
                System.exit(0);
            }
        }

        @Override
        public void itemStateChanged(ItemEvent ie) {
            //
        }
    }

}