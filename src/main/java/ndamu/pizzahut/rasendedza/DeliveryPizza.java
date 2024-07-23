package ndamu.pizzahut.rasendedza;

public class DeliveryPizza extends Pizza {
    private final String address;
    private final double deliveryFee;

    // Constructor, because delivery needs address
    public DeliveryPizza(Pizza pizza, String address) {
        super(pizza.getToppings(), pizza.getToppings().length);
        this.address = address;
        this.deliveryFee = calculateDeliveryFee();
    }

    // Calculate delivery fee, because drivers need to eat too
    public double calculateDeliveryFee() {
        double price = super.calculatePrice();
        if (price > 18) {
            return 3.0; // Discounted delivery for big spenders 🤑🤑
        } else {
            return 5.0; // Standard delivery fee
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Delivery Address: " + address + ". Delivery Fee: $" + deliveryFee + "\n";
    }
}
