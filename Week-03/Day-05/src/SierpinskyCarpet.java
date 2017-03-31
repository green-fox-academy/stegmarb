import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static int dimension = 800;

  public static void mainDraw(Graphics graphics) {
    patternDrawer(graphics, 0, 0,dimension);
  }

  //    Don't touch the code below
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
    if (dimension < 10) {
      return;
    } else {
      g.setColor(Color.BLACK);
      g.fillRect((x + dimension/3), y + (dimension/3), dimension / 3, dimension / 3);
      patternDrawer(g, x, y, dimension/3 );
      patternDrawer(g, (x + (dimension/3)), y, dimension/3);
      patternDrawer(g, (x + (2*dimension/3)) , y, dimension/3);
      patternDrawer(g, x, (y + (dimension/3)), dimension/3);
      patternDrawer(g, (x + (2*dimension/3)), (y + (dimension/3)), dimension/3);
      patternDrawer(g, x, (y + (2*dimension/3)), dimension/3);
      patternDrawer(g, (x + (dimension/3)), (y + (2*dimension/3)), dimension/3);
      patternDrawer(g, (x + (2*dimension/3)), (y + (2*dimension/3)), dimension/3);
//      patternDrawer(g, x, y, dimension/3);

    }
  }
}
