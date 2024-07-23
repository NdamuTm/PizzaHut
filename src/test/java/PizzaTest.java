import ndamu.pizzahut.rasendedza.Pizza;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void testCalculatePriceNoToppings() {
        String[] toppings = {};
        Pizza pizza = new Pizza(toppings, 0);
        double expectedPrice = 14.0;
        assertEquals(expectedPrice, pizza.calculatePrice());
    }

    @Test
    void testCalculatePriceWithToppings() {
        String[] toppings = {"Pepperoni", "Mushroom"};
        Pizza pizza = new Pizza(toppings, 2);
        double expectedPrice = 18.0;  // 14 + 2*2
        assertEquals(expectedPrice, pizza.calculatePrice());
    }

    @Test
    void testToStringNoToppings() {
        String[] toppings = {};
        Pizza pizza = new Pizza(toppings, 0);
        String expectedString = "Pizza with: . Price: $14.0\n";
        assertEquals(expectedString, pizza.toString());
    }

    @Test
    void testToStringWithToppings() {
        String[] toppings = {"Pepperoni", "Mushroom"};
        Pizza pizza = new Pizza(toppings, 2);
        String expectedString = "Pizza with: Pepperoni, Mushroom. Price: $18.0\n";
        assertEquals(expectedString, pizza.toString());
    }

    @Test
    void testToStringMaximumToppings() {
        String[] toppings = {"Pepperoni", "Mushroom", "Onion", "Sausage", "Bacon", "Olives", "Peppers", "Tomatoes", "Spinach", "Pineapple"};
        Pizza pizza = new Pizza(toppings, 10);
        String expectedString = "Pizza with: Pepperoni, Mushroom, Onion, Sausage, Bacon, Olives, Peppers, Tomatoes, Spinach, Pineapple. Price: $34.0\n";
        assertEquals(expectedString, pizza.toString());
    }
}
