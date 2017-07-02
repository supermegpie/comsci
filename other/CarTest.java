import java.awt.*;

public class CarTest { 
   public static void main(String[] args){
      Car mySubaru = new Car(15, 35000, 18);
      Car myHylander = new Car(25, 2000, 12);
      Car myPrius = new Car(50, 10000, 15);
      
      outputData(mySubaru, 100,40);
      outputData(myHylander, 200,10);
      outputData(myPrius, 20,30);
   }  
   
   public static void outputData(Car car, int distance,int moreGas) {
   
      //Adds a certain amount of gasoline and reports the amount of gas in the tank
      car.addGas(moreGas);
      System.out.println("The current fuel level after adding " + moreGas  + " gallons is " + car.getGasInTank() + " gallons");
      car.drive(distance);
      //Check the new milage level of car after driving a certain distance
      System.out.println("After driving " + distance + " miles the mileage is " + car.getMileage());
      //Check the amount of fuel in the tank
      System.out.println("After driving " + distance + " miles the current fuel level is " + car.getGasInTank() + " gallons");
      System.out.println();
   } 
}   