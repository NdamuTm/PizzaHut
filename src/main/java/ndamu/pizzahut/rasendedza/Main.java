package ndamu.pizzahut.rasendedza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] availableToppings = {"Cheese", "Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon", "Extra cheese", "Black olives", "Green peppers", "Pineapple"};
        String[] toppings = new String[10];
        int toppingCount = 0;

        // Main loop, because what program is complete without one?
        while (toppingCount < 10) {
            System.out.println("\nAvailable Toppings:");
            for (int i = 0; i < availableToppings.length; i++) {
                System.out.println((i + 1) + ". " + availableToppings[i]);
            }
            System.out.println("Q. Quit");

            System.out.print("Select a topping by number (or Q to quit) >> ");
            String choice = scanner.next(); // imagine someone choosing pineapple 😂😂😂

            if (choice.equalsIgnoreCase("Q")) {
                break; // Finally, we get to leave
            } else {
                try {
                    int toppingChoice = Integer.parseInt(choice);
                    if (toppingChoice > 0 && toppingChoice <= availableToppings.length) {
                        toppings[toppingCount++] = availableToppings[toppingChoice - 1];
                        System.out.println(availableToppings[toppingChoice - 1] + " added!");
                    } else {
                        System.out.println("Invalid choice!"); // The user can't follow instructions
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number."); // The user can't follow instructions
                }
            }
        }

        // Create Pizza object
        Pizza pizza = new Pizza(toppings, toppingCount);

        // Ask for delivery
        System.out.println("Is this for delivery? Y or N >>");
        String delivery = scanner.next();

        if (delivery.equalsIgnoreCase("Y")) {
            // Get delivery address
            System.out.println("Enter delivery address >> ");
            scanner.nextLine(); // Consume newline left-over
            String address = scanner.nextLine();

            // Create DeliveryPizza object
            DeliveryPizza deliveryPizza = new DeliveryPizza(pizza, address);
            System.out.println(deliveryPizza);
        } else {
            System.out.println(pizza);
        }
        scanner.close();
    }
}
