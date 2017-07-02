import java.util.*;
import java.io.*;
import java.awt.*;

public class GlitterBomb {
   public static void main(String[] args) throws FileNotFoundException {
      DrawingPanel p = new DrawingPanel(300, 300);
      Graphics g = p.getGraphics();
      Scanner console = new Scanner(System.in);
      System.out.println("Blast Site x?");
         int blastX = console.nextInt();
      System.out.println("Blast Site y?");
         int blastY = console.nextInt();
      System.out.println("Blast radius?");
         int radius = console.nextInt();
      System.out.println("Kaboom!");
      g.drawOval(blastX, blastY, (radius*2), (radius*2));
      int centerX = blastX + (radius);
      int centerY = blastY + (radius);
      Point pCenter = new Point(centerX,centerY);
      
      Scanner input = new Scanner(new File("cities.txt"));
      int numberCities = input.nextInt();
      for(int i = 0; i < numberCities; i++){
         int x = input.nextInt();
         int y = input.nextInt();
         Point pi = new Point(x,y);
         //if(x<(blastX)||x>(blastX+radius)||y<(blastY)||y>(blastY+radius)){
         if (pi.distance(pCenter) > (radius)){
            pi.setColor(Color.BLACK);
            pi.draw(g);
         }else{
            pi.setColor(Color.RED);
            pi.draw(g);
         }
      }
   }
}
     