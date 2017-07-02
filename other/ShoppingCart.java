//This class stores information about the order overall
import java.awt.*;
import java.util.*;
public class ShoppingCart {
   boolean discount = false;
     
//This method construct an emppty list of item orders.   
   public ShoppingCart(){
      ArrayList<Item> shoppingCart = new ArrayList<Item>();
   }

//This method add an item order to the shoppping cart list 
//and replaces any previous order for the same item. 
   public void add(ItemOrder itemOrder) {
      shoppingCart.add(itemOrder);
   }

//This method declares whether or not the order gets a discount.   
   public void setDiscount(boolean discount) {
      this.discount = discount;
   }

//This method returns the total cost of the shopping cart.
   public double getTotal() {
      double totalPrice = 0;
      for(inti = 0; i < catalog.size(); i++){
         totalPrice += itemOrder.getPrice(i);
      } 
      
      if(discount == true) {
         totalPrice = 0.9 * totalPrice;
      } 
      return totalPrice;    
   }
}