import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Pizza {
    protected String type;
    protected String category;
    protected int basePrice;
    protected boolean serviceMode;
    protected Set<String> additions = new HashSet<>();
    protected static Map<String, Integer> additionsPriceMap = new HashMap<>();

    static {
        // Static initializer block to initialize the additionsPriceMap
        additionsPriceMap.put("vegToppings", 70);
        additionsPriceMap.put("nonVegToppings", 120);
        additionsPriceMap.put("ExtraCheese", 80);
        additionsPriceMap.put("paperBag", 20);
    }

    public Pizza(String type, String category, int basePrice, boolean serviceMode) {
        this.type = type;
        this.category = category;
        this.basePrice = basePrice;
        this.serviceMode = serviceMode;
    }

    public void addExtra(String addition) {
        this.additions.add(addition);
    }

    public Map<String, Integer> generateBill() {
        Map<String, Integer> bill = new HashMap<>();
        int cost = basePrice;

        bill.put("Base Price Of The Pizza", this.basePrice);

        for (String addition : this.additions) {
            if (this.category.equals("veg")) {
                if (addition.equals("Extra Cheese")) {
                    int extraCheesePrice = additionsPriceMap.get("ExtraCheese");
                    cost += extraCheesePrice;
                    bill.put("Extra Cheese Price", extraCheesePrice);
                } else if (addition.equals("Extra Toppings")) {
                    int extraToppingPrice = additionsPriceMap.get("vegToppings");
                    cost += extraToppingPrice;
                    bill.put("Extra Toppings Added", extraToppingPrice);
                }
            } else if (addition.equals("Extra Toppings")) {
                int nonVegToppingsPrice = additionsPriceMap.get("nonVegToppings");
                cost += nonVegToppingsPrice;
                bill.put("Extra Toppings Added", nonVegToppingsPrice);
            }
        }

        if (this.serviceMode) {
            bill.put("Paperbag Added", additionsPriceMap.get("paperBag"));
            cost += additionsPriceMap.get("paperBag");
        }

        bill.put("Total Price", cost);

        return bill;
    }
}
