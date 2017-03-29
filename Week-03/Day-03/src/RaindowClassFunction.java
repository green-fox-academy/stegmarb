import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class RaindowClassFunction {
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.


    //coloredSquare(graphics, 250, Color.RED);
    fillWithRainbows(graphics, 50);

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
  public static void coloredSquare (Graphics g, int size, Color color) {
    g.setColor(color);
    g.fillRect(150-size/2, 150-size/2, size, size);
  }
  public static void fillWithRainbows (Graphics g, int size) {
    for (int i = 0; i < 9250; i++) {
      int color1 = (int)(Math.random()*255);
      int color3 = (int)(Math.random()*255);
      int color2 = (int)(Math.random()*255);
      int pos1 = (int)(Math.random()*(300-size));
      int pos2 = (int)(Math.random()*(300-size));
      g.setColor(new Color(color1, color2, color3));
      g.fillRect(pos1, pos2, size, size);
    }
  }
}
