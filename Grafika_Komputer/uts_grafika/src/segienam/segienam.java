package segienam;
import java.awt.*;
import javax.swing.*;
public class segienam extends JPanel {

public void poligon(Graphics g) {
 Graphics2D g2d = (Graphics2D) g;
 Polygon pol;
 int x[] = {375, 400, 450, 475, 450, 400};
 int y[] = {150, 100, 100, 150, 200, 200};
 pol = new Polygon(x, y, x.length);
 g2d.setPaint(Color.black);
 g2d.draw(pol);
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
 segienam panelGambar = new segienam();
 JFrame fr = new JFrame();
 fr.setSize(600,400);
 fr.getContentPane().add(panelGambar);
 fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 fr.setVisible(true);
 }
 }