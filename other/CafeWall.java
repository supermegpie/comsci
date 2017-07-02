/*Name:Megan Knoernschild
Date: October 27, 2016
Assignment: Cafe Wall
Description: Produce an image that demonstrates the cafe wall illusion.
*/

import java.awt.*;

public class CafeWall {
   public static final int MORTAR = 2;
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(650, 400);
      panel.setBackground(Color.GRAY);
      Graphics g = panel.getGraphics();
      
      drawRow(g, 0, 0, 4, 20);
      drawRow(g, 50, 70, 5, 30);
      drawGrid(g, 10, 150, 8, 4, 25, 0);
      drawGrid(g, 250, 200, 6, 3, 25, 10);
      drawGrid(g, 425, 180, 10, 5, 20, 10);
      drawGrid(g, 400, 20, 4, 2, 35, 35);
      
   } 
   
   
   //First Method of this demo, prints a row of black and white boxes 
         public static void drawRow(Graphics g, int x, int y, int pairs, int size){
            for (int i = 0; i < pairs; i++) {
               int boxWidth = size;
               int boxX = x;
               int boxY = y;
               
               g.setColor(Color.BLACK);
               g.fillRect(boxX + (i * 2 * size), boxY, boxWidth, boxWidth);
               
               g.setColor(Color.BLUE);
               g.drawLine(boxX + (i * 2 * size), boxY, boxX + (i * 2 * size) + size, boxY + size);
               g.drawLine(boxX + (i * 2 * size) + size, boxY, boxX + (i * 2 * size), boxY + size);
               
               g.setColor(Color.WHITE);
               g.fillRect(boxX + (i * 2 * size) + size, boxY, boxWidth, boxWidth);
            }
         }
          
          
         //Second Method uses the first method to create a grid (of rows) of black and white boxes 
         public static void drawGrid(Graphics g, int x, int y, int rows, int pairs, int size, int off){
            for (int i = 0; i < rows / 2; i++){
               drawRow(g, x, y + (size + MORTAR) * i * 2, pairs, size);
               drawRow(g, x + off, (y + size + MORTAR) + (size + MORTAR) * i * 2, pairs, size);
            }  
         }
         
   }
   
