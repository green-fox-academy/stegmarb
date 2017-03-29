import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 29..
 */
public class ConnectDots {

  public static void mainDraw(Graphics graphics){
    int[][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    int[][] secret = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

    dotConnecter(graphics, box);
    dotConnecter(graphics, secret);

  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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
  public static void dotConnecter (Graphics g, int[][] dots) {
    int[] xPoints = new int[dots.length];
    int[] yPoints = new int[dots.length];

    for (int i = 0; i < dots.length ; i++) {
        xPoints[i] = dots[i][0];
        yPoints[i] = dots[i][1];
    }
    int nPoints = xPoints.length;
      g.setColor(Color.GREEN);
      g.drawPolygon(xPoints , yPoints, nPoints);
  }
}
