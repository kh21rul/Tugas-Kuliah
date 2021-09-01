package segitiga;
import java.awt.*;
import javax.swing.*;
public class segitiga extends JPanel{
    public void segitiga(Graphics g) {
        Graphics2D se3 = (Graphics2D) g;
        int x[] = {50, 150, 250};
        int y[] = {250, 50, 250};
        se3.setColor(Color.black);
        se3.draw(new Polygon(x, y, x.length));
    }
    @Override
    public void paintComponent(Graphics g) {
        segitiga(g);
    }
    public static void main(String[] args) {
        segitiga panelGambar = new segitiga();
        JFrame fr = new JFrame();
        fr.setSize(650,350);
        fr.getContentPane().add(panelGambar);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}