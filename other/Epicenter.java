import java.util.*;
import java.io.*;
import java.awt.*;

public class GlitterBomb {
   public static void main(String[] args) throws FileNotFoundException {
      DrawingPanel p = new DrawingPanel(300, 300);
      Graphics g = p.getGraphics();
      Scanner console = new Scanner(System.in);
      System.out.println("Blast Site x?");
         int blastX = console.next();
      System.outl.println("Blast Site y?");
         int blastY = console.next();
      System.out.println("Blast radius?");
         int radius = console.next();
      System.out.println("Kaboom!");
      g.drawOval(blastX, blastY, blastRadius, blastRadius);
      
      Scanner input = new Scanner(new File("cities.txt"));
      int numberCities = input.nextInt();
      for(int i = 0; i < numberCities; i++){
         int x = input.nextInt();
         int y = input.nextInt();
         Point pi = new Point(x,y);
         if(x<(blastX-radius)||x>(blastX+radius)||y<(blastY-radius)||y>(blastY+radius)){ 
            p1.setColor(Color.BLACK);
         }else{
            p1.setColor(Color.RED);
         }
      }
   }
}
      