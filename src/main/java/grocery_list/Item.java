package grocery_list;

public abstract class Item
{
    // Fields
    protected String name;
    protected int price;

    // Getters
    public String getName() {return name;}
    public int getPrice() {return price;}

    // Constructor
    public Item(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
}
