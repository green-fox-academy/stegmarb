import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 29..
 */
public class GoToCenter {
  public static void mainDraw(Graphics draw2) {

    drawSometing(draw2,25, 125);
    drawSometing(draw2,75, 230);
    drawSometing(draw2,245, 12);


  }//    Don't touch the code below
    public static void main (String[]args){
      JFrame jFrame = new JFrame("Drawing");
      jFrame.setSize(new Dimension(300, 300));
      jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      jFrame.add(new ImagePanel());
      jFrame.setLocationRelativeTo(null);
      jFrame.setVisible(true);
    }
    public static class ImagePanel extends JPanel {
      @Override
      protected void paintComponent(Graphics draw) {
        super.paintComponent(draw);
        mainDraw(draw);
      }
    }
    public static void drawSometing (Graphics graphics, int x, int y) {
      graphics.setColor(Color.BLACK);
      graphics.drawLine(x, y, 150, 150);
    }
}

