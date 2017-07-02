/*Name: Megan Knoernschild
Date: October 27, 216
Assignment: Cafe Wall Doodle
Description: Draw a figure using DrawingPanal
*/

import java.awt.*;

public class Doodle {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(650, 400);
      panel.setBackground(Color.BLACK);
      Graphics g = panel.getGraphics();
      
         g.setColor(Color.ORANGE);
         g.fillOval(350, 200, 60, 150);
         g.fillOval(330, 200, 40, 160);
         g.fillOval(325, 200, 35, 160);
         g.fillOval(315, 200, 35, 160);
         g.fillOval(290, 200, 40, 160);
         g.fillOval(270, 200, 60, 150);
         
         g.setColor(Color.GREEN);
         g.fillRect(330, 150, 10, 45);
         g.fillRect(500, 100, 100, 200);
         
         g.setColor(Color.WHITE);
         g.fillOval(150, 50, 50, 150);
         g.fillOval(155, 165, 25, 70);
         g.fillOval(160, 165, 25, 70);
         g.fillOval(165, 165, 25, 70);
         g.fillOval(170, 165, 25, 70);
         g.setColor(Color.BLACK);
         g.fillOval(162, 96, 10, 10);
         g.fillOval(185, 96, 10, 10);
         g.fillRect(500, 100, 10, 10);
         g.fillRect(520, 100, 10, 10);
         g.fillRect(540, 100, 10, 10);
         g.fillRect(560, 100, 10, 10);
         g.fillRect(570, 100, 10, 10);
         g.fillRect(580, 100, 10, 10);
         
         g.fillRect(520, 150, 20, 20);
         g.fillRect(560, 150, 20, 20);
        
         g.fillRect(500, 200, 10, 10);
         g.fillRect(520, 200, 10, 10);
         g.fillRect(540, 200, 10, 10);
         g.fillRect(560, 200, 10, 10);
         g.fillRect(570, 200, 10, 10);
         g.fillRect(580, 200, 10, 10);
         
    }
      
}