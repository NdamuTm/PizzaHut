package ndamu.pizzahut.rasendedza;


public class Pizza {
    private final String[] toppings;

    // Constructor, because how else will we make a pizza?
    public Pizza(String[] toppings, int toppingCount) {
        this.toppings = new String[toppingCount];
        System.arraycopy(toppings, 0, this.toppings, 0, toppingCount);
    }

    // Calculate the price, because pizzas aren't free!
    public double calculatePrice() {
        double toppingPrice = 2.0;
        double basePrice = 14.0;
        return basePrice + (toppingPrice * toppings.length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza with: ");
        for (int i = 0; i < toppings.length; i++) {
            sb.append(toppings[i]);
            if (i < toppings.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(". Price: $").append(calculatePrice()).append("\n");
        return sb.toString();
    }

    // Get those toppings, because we need to know what we're eating
    public String[] getToppings() {
        return toppings;
    }
}
