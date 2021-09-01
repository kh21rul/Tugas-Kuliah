package segilima ;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class segilima extends JPanel {

  private static final long serialVersionUID = 1L;

  public void gambar(Graphics g)
  {
    Graphics2D se3 = (Graphics2D) g;
    int x[] = {45, 125, 205, 170,80};
    int y[] = {350, 300, 350, 450, 450};
    se3.setColor(Color.black);
    se3.draw(new Polygon(x,y,x.length));
  }
  @Override
  public void paintComponent(Graphics g) {
    clear(g);
    gambar(g);
  }

protected void clear(Graphics g) {
    super.paintComponent(g);
  }

  public static void main(String[] args) {
  segilima panelGambar = new segilima();
JFrame fr= new JFrame();
fr.setSize (600,600);
fr.getContentPane().add(panelGambar);
fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
fr.setVisible(true);
  }
}
