package praktikum_7;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class pratikum7 extends JPanel {
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        
        Graphics2D gd = (Graphics2D) g;
        gd.setColor(Color.red);
        gd.drawLine(100, 100, 400, 100);
        gd.drawLine(100, 100, 100, 400);
        gd.drawLine(100, 400, 400, 400);
        gd.drawLine(400, 100, 400, 400);
    }
    public static void main(String[] args) {
        pratikum7 g = new pratikum7();
        JFrame jf = new JFrame();
        jf.add(g);
        jf.setSize(600, 600);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
