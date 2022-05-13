package grocery_list;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

public class GroceryListTest
{
    GroceryList underTest = new GroceryList();
    Produce apples = new Produce("Apples", 4, 7);
    Canned beans = new Canned("Beans", 5);
    Cereal bran = new Cereal("Raisin Bran", 5);

    @Test
    public void shouldBeAbleToAddAProductToTheList()
    {
        underTest.addProduct(apples);
        assertThat(underTest.getNumProducts(), is(1));
    }
    @Test
    public void shouldBeAbleToAddProduceAndCannedGoodsToTheList()
    {
        underTest.addProduct(apples);
        underTest.addProduct(beans);
        assertThat(underTest.getNumProducts(), is(2));
    }
    @Test
    public void shouldBeAbleToSeeAListOfNonPerishableItems()
    {
        underTest.addProduct(apples);
        underTest.addProduct(beans);
        underTest.addProduct(bran);
        Collection<Item> nonPerishables = underTest.getAllNonPerishableItems();
        assertThat(nonPerishables, containsInAnyOrder(beans, bran));
    }
    @Test
    public void shouldBeAbleToDonateAllNonPerishableItems()
    {
        underTest.addProduct(apples);
        underTest.addProduct(beans);
        underTest.addProduct(bran);
        int itemsDonated = underTest.donateAllNonPerishables();
        assertThat(itemsDonated, is(2));
    }
    @Test
    public void shouldExtendDaysOfExpirationFrom7To8WhenWateringApples()
    {
        underTest.addProduct(apples);
        underTest.waterAllProduce();
        assertThat(apples.getDaysToExpire(), is(8));
    }
}