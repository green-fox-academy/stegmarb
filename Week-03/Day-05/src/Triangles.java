import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class Triangles {
  public static int width = 1000;
  public static int height = 1000;

  public static void mainDraw(Graphics graphics) {
    int x = 500;
    int y = 500;
    triangles(graphics, x, y, 200);

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
  public static void triangles (Graphics g, int x, int y, int size) {
    int[] xArray = new int[3];
    int[] yArray = new int[3];
    for (int i = 0; i <3 ; i++) {
      if (i == 0) {
        xArray[i] = x-173;
        yArray[i] = y+100;
      } else if (i == 1) {
        xArray[i] = x;
        yArray[i] = y-200;
      } else {
        xArray[i] = x+173;
        yArray[i] = y+100;
      }
    }
    g.setColor(Color.BLACK);
    g.drawPolygon(xArray, yArray, xArray.length);
  }
}
