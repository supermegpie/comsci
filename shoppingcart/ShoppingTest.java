import java.awt.*;
import java.util.*;
public class ShoppingTest {
   public static void main(String[] args){
     Item sillyPutty = new Item("silly putty", 3.95, 10, 19.99);
     Item GameOfLife = new Item("Game of Life circuit", 3.50, 10, 14.95);
     Item bottleBubbles = new Item("bottle o bubbles", 0.99);
     Item nintendoWii = new Item("Nintendo Wii system", 199.99);
    
     outputDataItem(sillyPutty, 25);
     outputDataItem(GameOfLife, 5);
     outputDataItem(bottleBubbles, 100);
     outputDataItem(nintendoWii, 2);

     Catalog test = new Catalog("test catalog");
     test.add(sillyPutty);
     test.add(GameOfLife);
     test.add(bottleBubbles);
     test.add(nintendoWii);
     outputDataCatalog(test, 1);
      
     ItemOrder test1 = new ItemOrder(sillyPutty, 25);
     ItemOrder test2 = new ItemOrder(GameOfLife, 5);
     ItemOrder test3 = new ItemOrder(bottleBubbles, 100);
     ItemOrder test4 = new ItemOrder(nintendoWii, 2);
     outputDataItemOrder(test1);
     outputDataItemOrder(test2);
     outputDataItemOrder(test3);
     outputDataItemOrder(test4);
     
     ShoppingCart test11 = new ShoppingCart();
     outputDataShoppingCart(test11);
   }
   
   public static void outputDataItem(Item item, int quantity) {
      double itemPrice = item.priceFor(quantity);
      System.out.println("The price of " + quantity + " " + item.name + " orders is " + itemPrice);
      item.toString();
      System.out.println(item);
      System.out.println();
   }
   
   public static void outputDataCatalog(Catalog catalog, int index) {
      System.out.println("The size of " + catalog.getName() + " is " + catalog.size());
      System.out.println("The catalog Name is " + catalog.getName());
      System.out.println("The item at index #1 is " + catalog.get(index));
      System.out.println();
   }
   
   public static void outputDataItemOrder(ItemOrder itemOrder) {
      System.out.println("The cost of this item order is " + itemOrder.getPrice());
      System.out.println(itemOrder.getItem());
      System.out.println();
   }
   
   public static void outputDataShoppingCart(ShoppingCart shoppingCart){
      System.out.println("The total cost of this shopping cart is " + shoppingCart.getTotal());
      //System.out.println("This shopping cart has a discount: " + shoppingCart.setDiscount()); 
   }
}