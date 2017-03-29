import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 29..
 */
public class PurpleSteps3D {
  public static void mainDraw(Graphics graphics){
    stepDrawer(graphics, 10);


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
  public static void stepDrawer (Graphics g, int size) {
    int standardSize = size;
    int startingPos = 25;
    for (int i = 0; i < 7; i++) {
      g.setColor(new Color(89, 13, 114));
      g.drawRect(startingPos, startingPos, size, size);
      g.setColor(new Color(190, 40, 224));
      g.fillRect(startingPos+1, startingPos+1, size-1, size-1);
      startingPos+=size;
      size+=standardSize;
    }
  }

}
