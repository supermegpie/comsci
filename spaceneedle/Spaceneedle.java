public class Spaceneedle {
   public static final int SIZE = 10;
   public static void main(String[] args){
   tip();
   top();
   dashLine();
   bottom();
   tip();
   stem();
   top();
   dashLine();
   }
  
   public static void tip(){
      for( int line = 1; line <= SIZE; line++) {
         for( int space = 1; space <= SIZE * 3; space++){
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   public static void top(){
      for ( int line = 1; line <= SIZE; line++) {
  
         for( int space = 1; space <= line * -3 + (SIZE *3); space++) {
            System.out.print(" ");
         }
         System.out.print("__");
         System.out.print("/");
         
         for(int slash = 1; slash <= line * 3 - 3; slash++) {
             System.out.print(":");
         }
         System.out.print("||");
         for( int space = 1; space <= line * 3 - 3; space++) {
             System.out.print(":");
         }
         System.out.print("\\");
         System.out.print("__");
         System.out.println("");
      }
   }
   public static void dashLine() {
      System.out.print("|");
      for( int dash = 1; dash <= (SIZE -1) * 6 + 6; dash++) { 
         System.out.print("\""); 
      }
      System.out.println("|");
   }
   public static void bottom() {
      for( int line = 1; line <= SIZE; line++) {
       
         for( int space = 1; space <= line * 2 - 2; space++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         for( int triangle = 1; triangle <= line * -2 + ((SIZE * 3) + 1) ; triangle++) {
            System.out.print("/\\");
         }
         System.out.print("_/");
         System.out.println("");
        
      }
   }
   public static void stem() {
      for( int line = 1; line <= (SIZE * SIZE); line++) {
         for( int space = 1; space <= (SIZE * 2) + 1; space++) {
            System.out.print(" ");
         }
         System.out.print("|");
         for( int modal = 1; modal <= SIZE - 2; modal++) {
            System.out.print("%");
         }
         System.out.print("||");
         for( int modal = 1; modal <= (SIZE - 2); modal++) {
            System.out.print("%");
         }
         System.out.println("|");
      }
     
   }
}






/*
            ||
            ||
            ||
            ||
         __/||\__
      __/:::||:::\__
   __/::::::||::::::\__
__/:::::::::||:::::::::\__
|""""""""""""""""""""""""|
\_/\/\/\/\/\/\/\/\/\/\/\_/
  \_/\/\/\/\/\/\/\/\/\_/
    \_/\/\/\/\/\/\/\_/
      \_/\/\/\/\/\_/
            ||
            ||
            ||
            ||
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         __/||\__
      __/:::||:::\__
   __/::::::||::::::\__
__/:::::::::||:::::::::\__
|""""""""""""""""""""""""|

*/