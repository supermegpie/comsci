//This class records information about the record of all of the items.
import java.awt.*;
import java.util.*;
public class Catalog {
   String catalogName;
   String item;
   ArrayList<Item> items = new ArrayList<Item>();
   
//This method constructs the object.
   public Catalog(String catalogName) {
      this.catalogName = catalogName;
   }
   
//This method adds an item tothe array list of items.
   public void add(Item item) {
      items.add(item);
   }
   
//This method returns the length of the item list.
   public int size() {
      return items.size();
   } 
   
//This method finds the item at a particular index.
   public Item get(int index) {
      return items.get(index);
   }

//This method returns the name of the catolog.
   public String getName() {
      return catalogName;
   }  
}