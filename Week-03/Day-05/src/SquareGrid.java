import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static int dimension = 600;
  public static void mainDraw(Graphics graphics) {
    patternDrawer(graphics, 0, 0,dimension);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(dimension, dimension));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.WHITE);
      mainDraw(graphics);
    }
  }

  public static void patternDrawer(Graphics g, int x, int y, int dimension) {
    Graphics2D g2 = (Graphics2D) g;
    if (dimension < 40) {
      return;
    } else {
      g.setColor(Color.BLACK);
      g2.setStroke(new BasicStroke(dimension/35));
      g.drawRect((x + dimension/4), y + (dimension/4), dimension / 2, dimension / 2);
      patternDrawer(g, x, y, dimension/2);
      patternDrawer(g, x + (dimension/2), y, dimension/2);
      patternDrawer(g, x, y + (dimension/2), dimension/2);
      patternDrawer(g, x + (dimension/2), y + (dimension/2), dimension/2);
    }
  }
}
