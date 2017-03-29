import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 29..
 */
public class FunctionToCenter {
  public static int dimensionX = 500;
  public static int dimensionY = 500;
  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.
    fillWithLines(graphics);


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
  public static void toTheCenter (Graphics g, int x, int y) {
    g.setColor(Color.GREEN);
    g.drawLine(x, y, dimensionX/2, dimensionY/2);
  }
  public static void fillWithLines (Graphics g) {
    g.setColor(Color.GREEN);
    int centerX = dimensionY/2;
    int centerY = dimensionX/2;
    for (int i = 0; i < dimensionX; i+= 20) {
      for (int j = 0; j < dimensionY; j += 20) {
        if (i == 0 || i >= dimensionX - 20) {
          g.drawLine(j, i, centerX, centerY);
        } else if (j == 0 || j >= dimensionY - 20 ){
          g.drawLine(j, i, centerX, centerY);
        }
      }
    }
  }

}
