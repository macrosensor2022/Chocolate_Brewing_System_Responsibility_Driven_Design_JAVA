public class production_area {
    private Recipe_storage recipe_storage;
    private Inventory_sm inventory_sm;
    //private recipie rp;

    public production_area(Recipe_storage recipe_storage,Inventory_sm inventory_sm)
    {
        this.recipe_storage = recipe_storage;
        this.inventory_sm =  inventory_sm;
    }
    public void make_batch(String name, int batchsize) {
        recipie r  = recipe_storage.find_recepie(name);
        if(r==null)
        {
            System.out.println("Recipe not found");
            return;
        }

        for(ingredients ig: r.getIng())
        {
            int required_qty= ig.getQuantity()*batchsize;

            if(!inventory_sm.hasenough(ig.getName(), required_qty))
            {
                System.out.println("Not enough "+ig.getName()+" to make the batch");
                return;
            }
        }

        for(ingredients ig: r.getIng())
        {
            int required_qty= ig.getQuantity()*batchsize;
            inventory_sm.take_ingredients(ig.getName(), required_qty);
        }

        int produced_bars= r.getoutputbars()*batchsize;
        inventory_sm.add_chocolate_bars(produced_bars);
        System.out.println("Batch made successfully " + produced_bars + " bars produced");

    }


    public void restock(String name, int qty)
    {
        inventory_sm.addingredients(name, qty);
        System.out.println("Restocked " +qty + " of "+ name);
    }


    public void packaging(int bars)
    {
        System.out.println("Packaging "+bars+" chocolate bars");
        System.out.println("Packaging completed");

    }




}


/*/

Class production_area which acts as the main circuit for the chocolate factory

The purpose include recipe creation  , batch production , and helps in integrating with the inventory system

The coupling mechanism which involves Inventory_sm and Recipe_storage classes

Main Responsibilities include:
--Create new recipes and store them
--Based on recipe requirements produce chocolate batches
--help in updating inventory after the production
 */