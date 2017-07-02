/*Megan Knoernschild
ARRAY CLASSWORK
*/
import java.util.*;

public class ArrayClasswork{
   public static void  main(String args[]){
   
   int[] numbers = {1, 2, 3};
   int[] list = {2, 3, 4, 5};
   
   //int[] pi = makePi();
   //System.out.println(Arrays.toString(pi));
   
   //boolean num = sameFirstLast(numbers);
   //System.out.println(num);
   
   //int sums =findSum(list);
   //System.out.println(sums);
   
   //int number = findSmallest(list);
   //System.out.println(number);
   
   //swapEnds(list);
   //int[] swap = swapEnds(list);
   //System.out.println(Arrays.toString(swap));
   
   //firstFour(list);
   //int[] four = firstFour(list);
   //System.out.println(Arrays.toString(four));
   
   //doubleUp(list);
   //int[] big = doubleUp(list);
   //System.out.println("list is " + Arrays.toString(list));
   //System.out.println("big is " + Arrays.toString(big));
   }
   
   public static int[] makePi(){
      int[] pi = {3, 1, 4};
      //System.out.println(Arrays.toString(pi));
      return pi; 
   }

   public static boolean sameFirstLast(int[] numbers){
      if(numbers.length < 1){
         return false;
      }
      if (numbers[0] != numbers[numbers.length - 1]) {
         return false;
      }
      return true;
   }
 
   public static int findSum(int[] list){
      int sum = 0;
      for (int i = 0; i < list.length; i++) {
         sum += list[i];
      }
      return sum;
   }
   
   public static int findSmallest(int[] list){
      int smallest = list[0];
      int indexOfSmallest = 0;
      for (int i = 1; i < list.length - 1; i++){
         if (list[i] < smallest){
            smallest = list[i];
            indexOfSmallest = i;
         }
      }
      return indexOfSmallest;   
   }
  
   public static int[] swapEnds(int[] list){
      int[] result = new int[list.length];
      result[0] = list[list.length - 1];
      result[list.length - 1] = list[0];
      for (int i = 1; i < result.length - 1; i ++){
         result[i] = list[i];
      }
      return result;
   }

   public static int[] doubleUp(int[] list){  
      int[] result = new int[list.length * 2];
         for (int i = 0; i < result.length; i++){
            result[i] = list[i / 2];
         }
         return result;
   }

   public static int[] firstFour(int[] list){
      int index = list.length;
      for (int i = 0; i < list.length; i++){
         if (list[i] == 4 && i < index){
            index = i;
         }   
      } 
      int[] post4 = new int[index];
      for (int i = 0; i < post4.length; i++){
         post4[i] = list[i];
      }
      return post4;
   }
}


