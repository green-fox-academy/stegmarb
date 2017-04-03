import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochLine {
  public static int width = 600;
  public static int height = 600;

  public static void mainDraw(Graphics graphics) {
    kochLine(graphics);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(width, height));
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

  public static void kochLine(Graphics g, int x1, int y1, int x2, int y2, boolean start) {
    if (start == true) {
      g.setColor(Color.BLACK);
      g.drawLine(x1, y1, x2, y2);
    } else {

    }
  }
}
