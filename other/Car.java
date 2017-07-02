import java.awt.*;
import java.util.*;

public class Car {
   int efficiency;
   int mileage;
   int tankCapacity;
   int fuelLevel;
   
   //fuel efficiency = miles/gallon
   //tank capacity = gallons
   public Car (int initialEfficiency, int initialMileage, int initialTank) throws IllegalArgumentException {
      efficiency = initialEfficiency;
      mileage = initialMileage;
      tankCapacity = initialTank;
      fuelLevel = 0;
   }
      
   public void drive (int distance) {
      mileage += distance;
      fuelLevel = fuelLevel - (distance / efficiency);      
   }
   
   public int getMileage () {
      return mileage;
   
   }
   
   public int getGasInTank () { 
      return fuelLevel;      
   }
   
   public void addGas (int moreGas) throws IllegalArgumentException {
      fuelLevel += moreGas;
   }
}