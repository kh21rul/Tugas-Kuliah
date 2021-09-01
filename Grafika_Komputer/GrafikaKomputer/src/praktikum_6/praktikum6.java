package praktikum_6;
import java.awt.*;
import javax.swing.*;
public class praktikum6 extends JPanel{
public void titik(Graphics g) {
Graphics2D t2k = (Graphics2D) g;
t2k.setColor(Color.BLUE);
t2k.drawLine(30, 30, 150, 150);
}
@Override
public void paintComponent(Graphics g) {
titik(g);
}
protected void clear(Graphics g) {
super.paintComponent(g);
}
public static void main(String[] args) {
praktikum6 panelGambar = new praktikum6();
JFrame fr = new JFrame();
fr.setSize(650,350);
fr.getContentPane().add(panelGambar);
fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
fr.setVisible(true);
}
}
