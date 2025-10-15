import javax.sound.midi.Receiver;
import java.util.Scanner;

public class Main
{
    static void main() {

        System.out.println("-------Welcome to my Brewary System program where it is going to produce chocolate to the customer based on their preferences-------");

//Object Creation for inventory and recepie storage
Inventory_sm inventory = new Inventory_sm();   //Stores the ingredients like cocoa, sugar and the milk
Recipe_storage rps = new Recipe_storage(10);  //Stores the recepie for the chocolates
Scanner s = new  Scanner(System.in);


//Add ingredients to the system
        System.out.println("Enter the number of ingredients to be added to the system (Ingredients are ---> cocoa, milk , sugar etc) ?");
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the ingredients name : ");
            String name = s.next().toLowerCase();
            System.out.println("Enter the ingredient quantity : ");
            int quantity = s.nextInt();

            //Adding the ingredients to the inventory
            inventory.addingredients(name,quantity);
        }

//Adding the recipes
        System.out.println("Enter the number of the recipes to be added (For eg : recipe name: dark_chocolate(1st) and milk_chocolate(2nd)  : ");

int r= s.nextInt();
for(int i=0;i<r;i++)
{
    System.out.println("Enter the recipe name : ");
    String name = s.next().toLowerCase();
    System.out.println("Enter the ingredient quantity(number of bars to be produced) : ");
    int bars = s.nextInt();

    //Creating a recipe object
recipie rp = new  recipie(name,bars);

    System.out.println("Enter the number of ingredients in this recipe : ");
    int recing= s.nextInt();
    s.nextLine();

    for(int j = 0;j<recing;j++)
    {
        System.out.println("Enter the ingredient name : ");
        String ingredientName = s.next().toLowerCase();
        System.out.println("Enter the ingredient quantity required one : ");
        int qty = s.nextInt();
        s.nextLine();


        //Adding recipe to the recipe storage
rp.add_ingredients(new ingredients(qty,ingredientName));

    }
rps.add_recepie(rp);
}

//Set up production and order management
production_area pd= new production_area(rps,inventory);
order_manager om = new order_manager(pd);


//Taking the customer orders
        System.out.println("Enter the number of customer orders to be taken ?");
        int ordercount = s.nextInt();
        s.nextLine();


        for(int j = 0;j<ordercount;j++)
        {
            System.out.println("Enter the customer name : ");
            String customerName = s.next().toLowerCase();
            System.out.println("Enter the customer mobile number : ");
            String customerMobile = s.next().toLowerCase();
            System.out.println("Enter the recipe name to order? ");
            String recipeName = s.next().toLowerCase();

            System.out.println("Enter the  quantity : ");
            int qty = s.nextInt();
            s.nextLine();

            //Creates a customer order and add it to the order manager
            customer_order order = new customer_order(customerName,customerMobile,qty,recipeName);
            om.addorder(order);
        }

        //Order processing step

        System.out.println("Well I guess everything is done and now im gonna process the order......");
        om.process_order();


        //Display process of the orders that are made
        System.out.println("Order processed now displaying .....");
        om.display_order();

        System.out.println("Thank you for using the Brewary System");



        /* If really confused about how to display the output ill say how to do it :)
Enter the number of ingredients to be added to the system (Ingredients are ---> cocoa, milk , sugar etc) ?
3
Enter the ingredients name :
cocoa
Enter the ingredient quantity :
500
The ingredient cocoa is added with a increase in quantity of 500
Enter the ingredients name :
sugar
Enter the ingredient quantity :
300
The ingredient sugar is added with a increase in quantity of 300
Enter the ingredients name :
milk
Enter the ingredient quantity :
200
The ingredient milk is added with a increase in quantity of 200
Enter the number of the recipes to be added (For eg : recipe name: dark_chocolate(1st) and milk_chocolate(2nd)  :
1
Enter the recipe name :
dark_chocolate
Enter the ingredient quantity(number of bars to be produced) :
2
Enter the number of ingredients in this recipe :
2
Enter the ingredient name :
cocoa
Enter the ingredient quantity required one :
100
Enter the ingredient name :
sugar
Enter the ingredient quantity required one :
50
Recipe added successfully
Enter the number of customer orders to be taken ?
1
Enter the customer name :
vinay
Enter the customer mobile number :
99999
Enter the recipe name to order?
dark_chocolate
Enter the  quantity :
3
         */





    }
}


/*/

This main class is more about the process that is occuring in the system

References: Responsibility driven design : Stack overflow and medium blog(https://naveenkumarmuguda.medium.com/responsibility-driven-design-designing-with-stories-and-roles-acc2e903c69f)(To understand the concept)

 */