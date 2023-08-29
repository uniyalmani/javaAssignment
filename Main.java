import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Pizza vegRegularPizza = new Pizza("Veg", "veg", 300, true);
        Pizza nonVegRegularPizza = new Pizza("Non Veg", "non veg", 400, false);


        vegRegularPizza.addExtra("Extra Cheese");
        vegRegularPizza.addExtra("Extra Toppings");

        nonVegRegularPizza.addExtra("Extra Toppings");

        displayBill(vegRegularPizza);
        displayBill(nonVegRegularPizza);

        DeluxePizza deluxePizza = new DeluxePizza("Deluxe", 500, false);
        deluxePizza.addExtra("Extra Cheese");
        deluxePizza.addExtra("Extra Toppings");

        displayBill(deluxePizza);
    }


    public static void displayBill(Pizza pizza) {
        Map<String, Integer> bill = pizza.generateBill();
        System.out.println("Bill for ");
        for (Map.Entry<String, Integer> entry : bill.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}