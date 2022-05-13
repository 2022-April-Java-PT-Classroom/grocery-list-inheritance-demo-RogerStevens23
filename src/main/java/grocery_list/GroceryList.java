package grocery_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GroceryList
{
    // Fields
    private Map<String, Item> myList = new HashMap<>();

    // Getters
    public int getNumProducts() {return myList.size();}
    public Collection<Item> getAllNonPerishableItems()
    {
        Collection<Item> nonPerishables = new ArrayList<>();
        for(Item item : myList.values())
        {
            if(item instanceof NonPerishable)
            {
                nonPerishables.add(item);
            }
        }
        return nonPerishables;
    }

    // Methods
    public void addProduct(Item itemToAdd)
    {
        myList.put(itemToAdd.getName(), itemToAdd);
    }
    public int donateAllNonPerishables()
    {
        int numItemsToDonate = 0;
        for(Item item : myList.values())
        {
            if(item instanceof NonPerishable)
            {
                ((NonPerishable) item).documentDonation();
                numItemsToDonate++;
            }
        }
        return numItemsToDonate;
    }
    public void waterAllProduce()
    {
        for(Item item : myList.values())
        {
            if(item instanceof Produce)
            {
                ((Produce) item).water();
            }
        }
    }
}