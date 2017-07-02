/*Name: Megan Knoernschild
Date: 12/02/2016
Project: Name Generator Project
Description: Program gives you a reindeer when you provide your full name and favorite type of cookie.

Soryy this is late. I received an extenstion because I was absent.
*/

import java.util.Random;
import java.util.Scanner;

public class NameGenerator{

   public static void main(String[] args){
   
      System.out.println("Welcome to the Reindeer Name Generator. We will generate names that your best reindeer friends can call you.\n");
       
      while(1==1){
         String firstName;
         String lastName;
         String favoriteCookie;
            
         Scanner console = new Scanner(System.in);
            
         System.out.println("Enter your first name (or \"quit\" to stop generator):");
         firstName = console.next();
         if("quit".equalsIgnoreCase(firstName)){
            System.exit(0);
         }
      
         System.out.println("Enter your last name:");
         lastName = console.next();
      
         System.out.println("Enter your favorite kind of cookie (i.e. \"sugar\"):");
         favoriteCookie = console.next();
            
            
         generateFinalName(newFirstName(firstName), lastName,favoriteCookie, findGeneration(firstName));
      }        
   }
   public static void generateFinalName(String newFirstName, String lastName, String favoriteCookie, String firstName){       
      String name = getRandomPrefix() +" "+ newFirstName +" "+ lastName + getRandomSuffix() + " the " + favoriteCookie + "-eating reindeer..."+ findGeneration(firstName);
      System.out.println("Your reindeer name will now be: "+ name + "\n\n");
   }
    
   private static String newFirstName(String firstName){
      String newFirstName = firstName.toUpperCase()+"ER";
      return newFirstName;
   }

   private static String getRandomPrefix(){
      Random random = new Random();
      int i = random.nextInt(4);
   
      if(i==0) 
         return "Merry";
      else if (i==1) 
         return "Super";
      else if (i==2) 
         return "Speedy";
      else 
         return "Jolly";
   }    
    
   private static String getRandomSuffix(){
      Random random = new Random();
      int i = random.nextInt(4);
   
      if(i==0) 
         return "oonie";
      else if (i==1) 
         return "ana";
      else if (i==2) 
         return "oopie";
      else 
         return "ippy";
   }
    
   private static String findGeneration(String firstName){
      int i = firstName.length() % 2;
   
      if(i==0) 
         return "the third.";
      else 
         return "junior.";
   }
}

