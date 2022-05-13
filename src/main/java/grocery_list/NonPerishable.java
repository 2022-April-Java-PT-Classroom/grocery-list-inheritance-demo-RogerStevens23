package grocery_list;

public class NonPerishable extends Item
{
    // Constructor
    public NonPerishable(String name, int price)
    {
        super(name, price);
    }

    // Methods
    public void documentDonation()
    {
        System.out.println(super.name + " Has been donated!");
    }
}