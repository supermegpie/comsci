/*Megan Knoernschild
Array Parameter Problems
*/
import java.util.*;

public class ArrayMysteries {
   public static void main(String args[]) {
   
      int[] num1 = {0,1,2,3,4};
      int[] num2 = {1,2,3,4,5};
      String[] suit ={"Clubs", "Diamonds", "Hearts", "Spades"};
      String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen", 
      "King","Ace"};
      
   
      //boolean see = allLess(num1, num2);
      //System.out.println(see); 
   
      String[] deck = new String[52];
      makeDeck(deck, suit, rank);
      System.out.println(Arrays.toString(deck));
      shuffleDeck(deck);
      System.out.println(Arrays.toString(deck));
   }
   
   public static boolean allLess(int[] num1, int[] num2){
       if(num1.length != num2.length){
          return false;
       }
       for (int i = 0; i < num1.length; i++){
          if(num1[i] >= num2[i]){
             return false;
          }
       }
       return true;
   }
   
   public static void makeDeck(String[] deck, String[] suit, String[] rank){  
      for (int j = 0; j < suit.length; j++){
            for (int i = 0 + (13 * j); i < rank.length * (j + 1); i++){
               deck[i] = rank[i - (13 * j)] + " of " + suit[j];
            }
      }
   }      
   
   public static void shuffleDeck(String[] deck){
   
   
   }
   
   
} 