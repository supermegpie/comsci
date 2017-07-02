//This method stores all the information about each item. The items name, prices, 
//bulk quantities and bulk prices.
import java.awt.*;
import java.util.*;
import java.text.*;
public class Item {
      String name;
      double price;
      int bulkQuantity = 0;
      double bulkPrice;   
   
   //takes the name and price of an object and eliminates illegal prices with an exception
   public Item(String name, double price) {
      if(price < 0) {
         throw new IllegalArgumentException();
      }
      this.name = name;
      this.price = price;
   } 
   
   //takes the name of a bulk price item and its prices 
   //and blocks illegal price values belo 0.
   public Item(String name, double price, int bulkQuantity, double bulkPrice) {  
      if(price < 0 || bulkQuantity < 0 || bulkPrice < 0) {
         throw new IllegalArgumentException();
      }
      this.name = name;
      this.price = price;
      this.bulkQuantity = bulkQuantity;
      this.bulkPrice = bulkPrice;  
   }
   
   //returns the price of an item and considers the bulk quantity of an  item 
   // and uses the bulk price when appropriate.
   public double priceFor(int quantity) {
      if(quantity < 0) {
         throw new IllegalArgumentException();
      }
      
      double bulkPriceAmount = 0.0;
      double priceAmount = 0.0;
      if(bulkQuantity>0){
         bulkPriceAmount = (quantity / bulkQuantity) * bulkPrice;
         priceAmount = (quantity % bulkQuantity) * price;
      }else{
         priceAmount = quantity * price;
      }

      double itemPrice = bulkPriceAmount + priceAmount;
         
      return itemPrice;
   }
   
   //returns the written version of an item in a specific format.
   public String toString() {
      NumberFormat nf = NumberFormat.getCurrencyInstance();
      String textPrice = nf.format(price);
      String  textBulk = nf.format(bulkPrice);
      String itemName;
      if(bulkQuantity < 2) {
         itemName = name + ", " + textPrice;
      }else{
         itemName = name + ", " + textPrice + " (" + bulkQuantity + " for " + textBulk + ")";
      }
      return itemName;
   }
}
