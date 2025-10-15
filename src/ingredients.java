public class ingredients {
    int quantity;
    String name;

    ingredients(int quantity, String name) {
        this.quantity = quantity;
        this.name = name;

    }

    public String toString() {
            return name + " ( " + quantity+ " units)";
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }


    public void addquantity(int quantity) {
        this.quantity += quantity;
    }

    public  void subquantity(int quantity) {
        this.quantity -= quantity;
        if(this.quantity<0){
            this.quantity=0;
        }
    }

    public  void showingredients()
    {
        System.out.println(name+ " " +quantity);
    }





}


/*/
This class ingredients that only represent the single ingredient that is used for the chocolate recipes that is given
in this case each ingredient has a specific name and the quantity
It is available in the inventory and required in the recipe
 */