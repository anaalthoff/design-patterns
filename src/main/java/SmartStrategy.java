// ConcreteStrategy

import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    private static class Order {
        StringDrink drink;
        StringRecipe recipe;

        Order(StringDrink drink, StringRecipe recipe) {
            this.drink = drink;
            this.recipe = recipe;
        }
    }

    private List<Order> pendingOrders = new ArrayList<>();
    private boolean happyHourStarted = false;

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            recipe.mix(drink); // já é happy hour → entrega imediata
        } else {
            pendingOrders.add(new Order(drink, recipe)); // salva para happy hour
        }
    }

    public void happyHourStarted(StringBar bar) {
        happyHourStarted = true;
        // Executa todos os pedidos pendentes
        for (Order order : pendingOrders) {
            order.recipe.mix(order.drink);
        }
        pendingOrders.clear();
    }

    public void happyHourEnded(StringBar bar) {
        happyHourStarted = false;
    }
}
