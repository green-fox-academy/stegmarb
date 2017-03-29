import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 29..
 */
public class FunctionToCenter {
  public static int dimensionX = 200;
  public static int dimensionY = 500;
  public static void mainDraw(Graphics graphics){
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
    int centerX = dimensionX/2;
    int centerY = dimensionY/2;
    for (int i = 0; i < dimensionY; i+= 20) {
      for (int j = 0; j < dimensionX; j += 20) {
        if (i == 0 || i >= dimensionY - 20) {
          g.drawLine(j, i, centerX, centerY);
        } else if (j == 0 || j >= dimensionX - 20 ){
          g.drawLine(j, i, centerX, centerY);
        }
      }
    }
  }

}
