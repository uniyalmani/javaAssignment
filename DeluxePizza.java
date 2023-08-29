public class DeluxePizza extends Pizza {
    public DeluxePizza(String type, int basePrice, boolean serviceMode) {
        super(type, "deluxe", basePrice, serviceMode);
        addExtra("Extra Cheese");
        addExtra("Extra Toppings");
    }
}