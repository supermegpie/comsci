import java.awt.*;
import java.util.*; 


public class Point {
   int x;
   int y;
   Color point_color = Color.BLACK;

   public Point(int initialX, int initialY) {
      x = initialX;
      y = initialY;
   }
      
   public void translate(int dx, int dy) {
      x = x + dx;
      y = y + dy;
   }
      
   public void draw(Graphics g){
      g.setColor(point_color);
      g.fillOval(x, y, 3, 3);

      g.drawString("(" + x + ", " + y + ")", x, y);
      g.setColor(Color.BLACK);

   }
      
   public boolean isVertical(Point other) {
      if (other.x == x) {
         return true;
       }else{
         return false; 
       }
   }
      
   public void setColor(Color myColor){
      point_color = myColor;   
   }
      
      public double distance(Point other) {
         return Math.round(Math.sqrt(Math.pow ((other.x - x), 2.0) + Math.pow((other.y - y), 2.0)));
      }
}
