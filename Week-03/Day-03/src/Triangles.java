import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 29..
 */
public class Triangles {
  public static int dimensionX = 500;
  public static int dimensionY = 500;
  public static void mainDraw(Graphics graphics){
    triangles(graphics);


  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(dimensionX, dimensionY));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
  public static void triangles (Graphics g) {
    int[] xPoints = {dimensionX / 2, dimensionX / 2 + 10, dimensionX / 2 - 10};
    int[] yPoints = {50, 72, 72};
    int nPoints = xPoints.length;
      for (int i = 1; i < dimensionX / 20; i++) {
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, nPoints);

    }
  }
}
