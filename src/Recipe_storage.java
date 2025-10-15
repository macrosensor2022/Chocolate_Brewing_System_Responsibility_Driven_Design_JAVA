public class Recipe_storage {

//recipie rp;
    private int count =0;
  private   recipie[] recipies;
public Recipe_storage(int size)
{
   // recipie[] recipies = new recipie[size];
    this.recipies = new recipie[size];
}

public void add_recepie(recipie r)
{

for(int i=0;i<count;i++)
{
if(recipies[i].getName().equalsIgnoreCase(r.getName()))
{
    System.out.println("Recipe already exists");
    return;
}
}

//Checking for the space

  if(count<recipies.length)
  {
      recipies[count]=r;
      count++;
      System.out.println("Recipe added successfully");
  }

  else {
      System.out.println("The recepie area is full buddy sorry :) ");
  }
}

public void show_recipies()
{
    if(count==0)
    {
        System.out.println("There is no recipies in the system");
        return;
    }

    for(int i=0;i<count;i++)
    {
        System.out.println(recipies[i].getName());
    }

}

public recipie find_recepie(String name )
{
    if(count==0)
    {
        System.out.println("There is no recipies in the system");
        return null;
    }

    for(int i=0;i<count;i++)
    {
        if(recipies[i].getName().equals(name))
        {
            System.out.println("Recipe " +name + " found successfully");
            return recipies[i];
        }
    }
    //return  "Recipe not found";
    System.out.println("Recipe not found");
    return null;
}


public void  remove_recepie(String name )
{
    if(count==0)
    {
        System.out.println("There is no recipies in the system");
    }

    int idx=-1;

    for(int  i=0;i<count;i++)
    {
        if(recipies[i].getName().equals(name))
        {
            idx=i;
            break;
        }
    }

if(idx==-1)
{
    System.out.println("Recepie not found");
    return ;
}

for(int i=idx;i<count-1;i++)
{
    recipies[i]=recipies[i+1];
}

recipies[count-1]=null;
count--;

    System.out.println("Recipie "+ name + " removed successfully");


}

public  void update_recepie(String recipie_name,recipie new_recipe )
{
    if(count==0)
    {
        System.out.println("There is no recipe in the system");
    }
    System.out.println("Original recipe available now");
    for(int i=0;i<count;i++)
    {
        System.out.println(recipies[i].getName());
    }

    System.out.println("Updating the recipes");
    boolean found=false;
    for(int i=0;i<count;i++)
    {

        if(recipies[i].getName().equalsIgnoreCase(recipie_name))
        {
            recipies[i]=new_recipe;
            found=true;
            System.out.println("Recipe "+recipie_name+" updated successfully");
            break;
        }
    }
    if(!found)
    {
        System.out.println("Recipe not found cannot update it ");
    }

}



}


/*/
This class is called as the recipe storage class where the main purpose is to :
manage and store all the chocolate recipes which is created by the user

In this case I used linear search for  finding the recipes where makes the logic easy and clear

This is a class which mainly supports the production system which serves as a lookup source when a batch needs to be produced


References: Array of objects gfg(https://www.geeksforgeeks.org/java/how-to-create-array-of-objects-in-java/)
 */