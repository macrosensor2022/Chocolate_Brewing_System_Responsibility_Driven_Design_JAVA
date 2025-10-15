public class customer_order {
    private  String customer_name;
private String customer_mobile;
private int quantity;
private String recepie_name;


public customer_order(String customer_name, String customer_mobile, int quantity, String recepie_name)
{
    this.customer_name=customer_name;
    this.customer_mobile=customer_mobile;
    this.quantity=quantity;
    this.recepie_name=recepie_name;
}
public String getCustomer_name() {
    return customer_name;
}

public String getCustomer_mobile() {
    return customer_mobile;
}
public int getQuantity() {
    return quantity;
}

public String getRecepie_name() {
    return recepie_name;
}

}


/*/
The customer_order class which  helps in representing single customer order in the system
helps in storing customer details and orders

-- this class is only intended to store the customer order  information
-- It is an independent class which is interacting with order_manager class only when it is added to the order list

In this each instance represents single customer request

 */