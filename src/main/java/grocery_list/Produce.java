package grocery_list;

public class Produce extends Item
{
    // Fields
    private int daysToExpire;

    // Getters
    public int getDaysToExpire() {return daysToExpire;}

    // Constructor
    public Produce(String name, int price, int daysToExpire)
    {
        super(name, price);
        this.daysToExpire = daysToExpire;
    }

    // Methods
    public void water()
    {
        daysToExpire += 1;
    }


    @Override
    public String toString()
    {
        return "Produce{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", daysToExpire = " + daysToExpire +
                '}';
    }
}