import java.util.*;

public class recipie {
    String name;   //Name of the chocolate
    private List<ingredients> ing ;
   private  int endbars;

    public recipie(String name,int endbars) {
        this.name = name;
        this.ing = new ArrayList<>();
        this.endbars = endbars;

    }
public void add_ingredients(ingredients ing){
this.ing.add(ing);
}
    public String getName() {
        return name;
    }

    public List<ingredients> getIng() {
        return ing;
    }

    public void setoutputbars(int bars)
    {
        this.endbars = bars;
    }

    public int  getoutputbars() {
return endbars;
    }

    public  void add_ingredient(ingredients ing)
    {
       this.ing.add(ing);
    }


    public  void showrecipedetails()
    {
        System.out.println("Recipe: " +name);
       // System.out.println("Ingredients: "+ ing.size());
        System.out.println("End Bars: " +endbars);

        for(ingredients i:ing)
        {
            System.out.println(i);        }
    }

}


/*/
This is Recipe class
where it represents the chocolate recipe defining how many chocolate bars that could be made and what all ingredients which are required for production

Used straightforward operations like : add , retrieve, display for low complexity
 */