/*Name: Megan Knoernschild
Date: 11/16/2016
Project: Birthday Project
Description: Program that tells you your birthday

Soryy this is late. I received an extenstion.
*/

import java.util.*;

public class Birthday {
   public static void main(String args[]) {
      Scanner console = new Scanner(System.in);
   
   
      System.out.println("This program tells you how many days");
      System.out.println("it will be until your next birthday");
   
   
      System.out.println("Please enter today's date:");
      System.out.println("What is the month (1-12)");
      int currentMonth = console.nextInt();
      System.out.println("What is the day (1-31)");
      int currentDay = console.nextInt();
   
      int currentAbsoluteDay = calculateAbsoluteDay(currentMonth, currentDay); 
      System.out.println(currentMonth + "/" + currentDay + " is day #" + currentAbsoluteDay + " of 365.");
   
   
      System.out.println("\nPlease enter your birthday:");
      System.out.println("What is the month (1-12)");
      int birthMonth = console.nextInt();
      System.out.println("What is the day (1-31)");
      int birthDay = console.nextInt();
   
      int birthAbsoluteDay = calculateAbsoluteDay(birthMonth, birthDay);
      System.out.println(birthMonth + "/" + birthDay + " is day #" + birthAbsoluteDay + " of 365.");
   
      calculateDaysUntilBday(currentAbsoluteDay, birthAbsoluteDay);   
      
   
      System.out.println("\nDid you know Beyonce was born on September 4th, 1981 and Megan was born on the same day in 1998?");
   }
  
   public static int calculateAbsoluteDay(int month, int day) {
      int totalDays = 0;
      for( int i = 1; i < month; i++){
         if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10){
            totalDays += 31;
         }
         else if(i==2){
            totalDays += 28;
         }
         else if(i==4 || i==6 || i==9 || i==11){
            totalDays += 30;
         }
         else{
            System.out.println("Invaild month. Month must be 1-12");
            System.exit(0);
         }
      }
      totalDays += day;
      return totalDays;
   }

   public static void calculateDaysUntilBday(int c, int b) {
      if(c == b) {
         System.out.println("\nHappy birthday!");
      }
      else if(c + 1 == b) {
         System.out.println("\nWow, your birthday is tomorrow!");
      }
      else if(c + 1 < b) {
         int days = b - c;
         System.out.println("\nYour next birthday is in " + days + " days.");     
      }
      else {
         int newdays = 365 - c + b;
         System.out.println("\nYour next birthday is in " + newdays + " days.");
      }
   }
}