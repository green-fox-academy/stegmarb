import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class Circles {
  public static int width = 600;
  public static int height = 600;

  public static void mainDraw(Graphics graphics) {
    circles(graphics, 0, 0, 200);

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

  public static void circles(Graphics g, int x, int y, int size) {
    g.setColor(Color.BLACK);
    g.drawOval(x, y, size, size);
  }
}


