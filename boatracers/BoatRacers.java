/*Megan Knoernschild
Boat Racers
*/
import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.Timer; 

public class BoatRacers {
   
   public static final int FINISH = 1800;

   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);
      
      System.out.println("Welcome to the hydrofoil racers competition!");
      System.out.println("This game needs three competitors to execute.");  
      System.out.println("Who is the green competitor?");
      String playerOne = console.next();
      System.out.println("Who is the red competitor?");
      String playerTwo = console.next();
      System.out.println("Who is the yellow competitor?");
      String playerThree = console.next();
   
      DrawingPanel panel = new DrawingPanel(1000, 800);
      Graphics g = panel.getGraphics();
   
   
      boolean done = false;
      int countRed = 0;
      int countYellow = 0;
      int countGreen = 0;
      
      int i=0;
      double angleRed = 0;
      double angleGreen = 0;
      double angleYellow = 0;
      
      while(done==false){
         Random rn = new Random();
         int answer = rn.nextInt(10) + 1;
      
         angleRed += getDetlaAngle();
         angleGreen += getDetlaAngle();
         angleYellow += getDetlaAngle();  
  
         try{
          
            raceFrame(g,angleRed,angleGreen,angleYellow,done,playerOne,playerTwo,playerThree);
         
            Thread.currentThread().sleep(50L);
         }
         catch(InterruptedException e)
         {
            e.printStackTrace();
         }
         
         if(angleRed> FINISH || angleGreen>FINISH || angleYellow> FINISH){
            done = true;
            raceFrame(g,angleRed,angleGreen,angleYellow,done,playerOne,playerTwo,playerThree);
         
         }
      
      }
   
   }
   public static void drawBoat(Graphics g, double degrees, double radius, Color color) { 
      double rad = Math.toRadians(degrees);
      int xcenter = 400;
      int ycenter = 360;
      int x = (int)(xcenter + Math.cos(rad) * radius);
      int y = (int)(ycenter + Math.sin(rad) * radius);
      g.setColor(color);
      g.fillOval(x, y, 30, 30);
   }
      
   public static void raceFrame(Graphics g,double angleRed,double angleGreen,double angleYellow,boolean done,String playerOne,String playerTwo,String playerThree) {
      g.setColor(Color.BLUE);
      g.fillRect(0, 0, 783, 2000);
      g.setColor(Color.BLACK);
      g.drawOval(50, 20, 700, 700);
      g.drawOval(100, 70, 600, 600);
      g.drawOval(150, 120, 500, 500);
   
      
      drawBoat(g, angleRed, 350, Color.RED);
      drawBoat(g, angleGreen, 300, Color.GREEN);
      drawBoat(g, angleYellow, 250, Color.YELLOW);
      
      recordFinish(g,angleRed,angleGreen,angleYellow,done,playerOne,playerTwo,playerThree);
   }
        
   public static void recordFinish(Graphics g, double angleRed, double angleGreen, double angleYellow,boolean done, String playerOne, String playerTwo, String playerThree){
      g.setColor(Color.WHITE);
      g.fillRect(800, 0, 400, 400);
   
      g.setColor(Color.BLACK);

      g.drawString("Red, " + playerTwo +": " + angleRed , 800, 100);
      g.drawString("Green, " + playerOne +": " + angleGreen, 800, 200);
      g.drawString("Yellow, " + playerThree +": " + angleYellow, 800, 300);

      String winnerString = "Winner: ";
      if(done){
         if(angleRed>angleGreen && angleRed>angleYellow){
            winnerString+="Red, " + playerTwo;
         }
         else if(angleGreen>angleRed && angleGreen>angleYellow){
            winnerString+="Green, " + playerOne;
         }
         else{
            winnerString+="Yellow, " + playerThree;
         }
         g.drawString(winnerString, 800, 500);
      }
   }   
      
   public static int getDetlaAngle(){
      Random rn = new Random();
      return rn.nextInt(10) + 1;
   }
}
