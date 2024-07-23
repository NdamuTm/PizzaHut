import ndamu.pizzahut.rasendedza.DeliveryPizza;
import ndamu.pizzahut.rasendedza.Pizza;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeliveryPizzaTest {

    @Test
    void testCalculateDeliveryFee() {
        String[] toppings = {"Pepperoni", "Mushroom", "Onion"};
        Pizza pizza = new Pizza(toppings, 3);
        DeliveryPizza deliveryPizza = new DeliveryPizza(pizza, "123 Main St");
        double expectedFee = 3.0;  // since 14 + (2*3) = 20 > 18
        assertEquals(expectedFee, deliveryPizza.calculateDeliveryFee());
    }

    @Test
    void testToString() {
        String[] toppings = {"Pepperoni", "Mushroom", "Onion"};
        Pizza pizza = new Pizza(toppings, 3);
        DeliveryPizza deliveryPizza = new DeliveryPizza(pizza, "123 Main St");
        String expectedString = "Pizza with: Pepperoni, Mushroom, Onion. Price: $20.0\nDelivery Address: 123 Main St. Delivery Fee: $3.0\n";

        String actualString = deliveryPizza.toString();
        System.out.println("Actual: " + actualString);
        System.out.println("Expected: " + expectedString);

        assertEquals(expectedString, actualString);
    }

    @Test
    void testNoToppings() {
        String[] toppings = {};
        Pizza pizza = new Pizza(toppings, 0);
        DeliveryPizza deliveryPizza = new DeliveryPizza(pizza, "456 Elm St");
        String expectedString = "Pizza with: . Price: $14.0\nDelivery Address: 456 Elm St. Delivery Fee: $5.0\n";

        assertEquals(expectedString, deliveryPizza.toString());
    }

    @Test
    void testMaximumToppings() {
        String[] toppings = {"Pepperoni", "Mushroom", "Onion", "Sausage", "Bacon", "Olives", "Peppers", "Tomatoes", "Spinach", "Pineapple"};
        Pizza pizza = new Pizza(toppings, 10);
        DeliveryPizza deliveryPizza = new DeliveryPizza(pizza, "789 Oak St");
        String expectedString = "Pizza with: Pepperoni, Mushroom, Onion, Sausage, Bacon, Olives, Peppers, Tomatoes, Spinach, Pineapple. Price: $34.0\nDelivery Address: 789 Oak St. Delivery Fee: $3.0\n";

        assertEquals(expectedString, deliveryPizza.toString());
    }

    @Test
    void testDeliveryFeeBelowThreshold() {
        String[] toppings = {"Pepperoni"};
        Pizza pizza = new Pizza(toppings, 1);
        DeliveryPizza deliveryPizza = new DeliveryPizza(pizza, "101 Maple St");
        double expectedFee = 5.0;  // since 14 + (2*1) = 16 <= 18
        assertEquals(expectedFee, deliveryPizza.calculateDeliveryFee());
    }

    @Test
    void testEmptyAddress() {
        String[] toppings = {"Pepperoni", "Mushroom"};
        Pizza pizza = new Pizza(toppings, 2);
        DeliveryPizza deliveryPizza = new DeliveryPizza(pizza, "");
        String expectedString = "Pizza with: Pepperoni, Mushroom. Price: $18.0\nDelivery Address: . Delivery Fee: $5.0\n";

        assertEquals(expectedString, deliveryPizza.toString());
    }
}
