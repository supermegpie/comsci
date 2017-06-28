//This class store information about each item and the number of the item on the order.
import java.awt.*;
import java.util.*;
public class ItemOrder {
   int quantity;
   Item item;
   
//This method constructs the item order for an item and its quantity.  
   public ItemOrder(Item item, int quantity) {
      this.item = item;
      this.quantity = quantity;
   }

//This method returns the cost for the item order.    
   public double getPrice() {
      return item.priceFor(quantity);
   }
   
//This methods finds and returns the item used in this order.
   public Item getItem() {
      return item;
   } 
}