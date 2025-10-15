import java.util.ArrayList;
import java.util.List;

public class Inventory_sm {
    private List<ingredients> inventory;
    private int chocolate_bars;
    int count=0;


    public Inventory_sm()
    {
        this.inventory = new ArrayList<>();
        chocolate_bars=0;
    }

 public  void addingredients(String name,int quantity)
 {
  for(ingredients i:inventory)
  {
      if(i.getName().equals(name))
      {

          i.addquantity(quantity);
          System.out.println("The ingredient " +  name+ " is added with a increase in quantity of " + quantity);
          return;
      }

  }
     inventory.add(new ingredients(quantity,name));
     System.out.println("The ingredient " + name+ " is added with a increase in quantity of " + quantity);

 }


 public boolean hasenough(String name,int required)
 {
     for(ingredients i:inventory)
     {
         if(i.getName().equals(name)) {


             if (i.getQuantity() >= required) {
                 System.out.println("There is enough quantity of ingredient to make the chocolate");
                 return true;
             }
             else
             {
                 System.out.println("Not enough "  + name + ". Need " + required+ "  ,but only have  " + i.getQuantity());
                 return false;
             }
         }


     }
     System.out.println("Ingredient "  + name+ " not found in the inventory");
     return false;
 }

 public void take_ingredients(String name,int quantity)
 {
     for(ingredients i:inventory)
     {
         if(i.getName().equals(name)) {
             if(i.getQuantity()>= quantity) {
                i.subquantity(quantity);
                 System.out.println("Taken " +  quantity+ " units of " + name);
             }
             else {
                 System.out.println("The amount of quantity you've given is more , need to order");

             }
             return;

         }
     }
     System.out.println("Ingredient "  + name+ " not found in the inventory ");
 }

     public void add_chocolate_bars(int bars)
     {
         System.out.println("Chocolate bars before : "+chocolate_bars);

        chocolate_bars=chocolate_bars+bars;
         System.out.println("The chocolate bars  is added to the inventory and the updated chocolate_bars right now is : " +  chocolate_bars);
     }

     public void display_inventory()
     {
         System.out.println("--------Current Inventory--------");
         for(ingredients i: inventory)
         {
             System.out.println(i.getName() + " --->  "+ i.getQuantity());

         }
         System.out.println("Chocolate bars --->  "+ chocolate_bars);
     }
}



/*/
This is the inventory_system class
The main purpose of this class is to manage all the ingredients and the chocolate_bars in stock

It acts as a control for the raw materials and the finished products

The inventory system class ensures that the production area always get to know whether there are enough ingredients to make the chocolate

Keep track of how many bars are produced

References: List syntaxes open ai


 */