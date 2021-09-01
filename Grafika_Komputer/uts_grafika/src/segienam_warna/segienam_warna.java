package segienam_warna;
import java.awt.*;
import javax.swing.*;

public class segienam_warna extends JPanel {
 
public void poligon(Graphics g) {
 Graphics2D g2d = (Graphics2D) g;
 Polygon pol;
 int x[] = {375, 400, 450, 475, 450, 400};
 int y[] = {150, 100, 100, 150, 200, 200};
 pol = new Polygon(x, y, x.length);
 g2d.setPaint(Color.red);
 g2d.fill(pol);
 }
 
@Override
public void paintComponent(Graphics g) {
 clear(g);
 poligon(g);
}
 
protected void clear(Graphics g) {
 super.paintComponent(g);
 }
 
public static void main(String[] args) {
 segienam_warna panelGambar = new segienam_warna();
 JFrame fr = new JFrame();
 fr.setSize(650,350);
 fr.getContentPane().add(panelGambar);
 fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 fr.setVisible(true);
 }
 }