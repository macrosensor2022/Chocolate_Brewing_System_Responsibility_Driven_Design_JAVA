import java.util.ArrayList;
import java.util.List;

public class order_manager {
private  List<customer_order> orders=new ArrayList<>();
production_area prod;
//Inventory_sm inventory_sm;

public order_manager(production_area prod) {
    this.prod = prod;


}

public void addorder(customer_order order) {
orders.add(order);

}

public void process_order()
{
for(customer_order order:orders)
{
    prod.make_batch(order.getRecepie_name(),order.getQuantity());
}
}

public void display_order()
{
    if(orders.isEmpty())
    {
        System.out.println("There is no orders in the inventory");
        return;
    }
    for(int i=0;i<orders.size();i++)
    {
        customer_order order=orders.get(i);
        System.out.println("Order "+ (i+1)+":");
        System.out.println("Customer name: "+order.getCustomer_name());
        System.out.println("Customer order: " + order.getRecepie_name());
        System.out.println("Quantity: "+order.getQuantity());
        System.out.println();

    }
}

}


/*/
This class order_manager
Helps in managing the customer order in my system
mainly responsible for adding the order , process via production
display the order details


-- this focus on managing the orders(Like a receptionist)
It is interacting with the production_Area and produce the chocolate batches

Responsible to :
Store the orders in the list
adding the new customer orders
process the orders by making chocolate batches
display the info


It acts as a bridge in between the customer_requests and production_system
 */