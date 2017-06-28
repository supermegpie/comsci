import java.util.*;
import java.io.*;

public class Homer {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("homer.txt"));
      int counts = 0;
      int h = input.nextInt();
      int w = input.nextInt();     
      char[][] points = new char[h][w];
      fillPoints(points,input);
      displayArray(points);
      
   }
   public static void fillPoints (char points[][],Scanner input){
      for (int row = 0; row < points.length; row++){
         for (int col = 0; col < points[0].length; col++){
            points[row][col] = (char)input.nextInt();
            ;
         }
      }
   }
   public static void displayArray (char points[][]){
      for (int row = 0; row < points.length; row++){
         for (int col = 0; col < points[0].length; col++){
            System.out.print(points[row][col]);
         }
         System.out.println();
      }
   }
      
}
      
      