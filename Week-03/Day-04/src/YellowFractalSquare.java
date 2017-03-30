import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class YellowFractalSquare {
  public static int width = 900;
  public static int height = 900;

  public static void mainDraw(Graphics graphics) {
    fractalThirder(graphics, 0, 0, width, height);

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
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);

    }
  }

  public static void fractalThirder(Graphics g, int x, int y, int width, int heigth) {
    if (width < 3 || heigth < 3) {
      return;
    } else {
      g.setColor(Color.BLACK);
      g.drawRect(x, y, width, heigth);
      fractalThirder(g, x + (width / 3), y, width / 3, heigth / 3);
      fractalThirder(g, x, y + (heigth/3), width/3, heigth/3);
      fractalThirder(g, x + (2*(width/3)), y + (heigth/3), width/3, heigth/3);
      fractalThirder(g, x + (width / 3), y + (2*(heigth/3)), width/3, heigth/3);
    }
  }
}