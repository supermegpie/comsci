//This class records information about the record of all of the items.
import java.awt.*;
import java.util.*;
public class Catalog {
   String catalogName;
   String item;
   ArrayList<Item> items = new ArrayList<Item>();
   
   public Catalog(String catalogName) {
      this.catalogName = catalogName;
   }
   
   public void add(Item item) {
      items.add(item);
   }
   
   public int size() {
      return items.size();
   } 
   
   public Item get(int index) {
      return items.get(index);
   }
   
   public String getName() {
      return catalogName;
   }  
}