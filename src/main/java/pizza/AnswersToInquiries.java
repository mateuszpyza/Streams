package pizza;

import java.util.List;


public class AnswersToInquiries {
    public static void printVegetarianPizzas() {
        List<Pizza> pizzas = PizzaMenu.getPizzas();
        pizzas.stream().filter(Pizza::isVegetarian)
                .forEach(pizza -> System.out.println(pizza.getName()));
    }

    public static void printPizzaContainingCelery() {
        List<Pizza> pizzas = PizzaMenu.getPizzas();
        pizzas.stream().filter(pizza -> pizza.getIngredients()
                .contains("seler")).forEach(pizza -> System.out.println(pizza.getName()));
    }

    public static boolean isSomeonePizzaContainTomatoAndPepper() {
        List<Pizza> pizzas = PizzaMenu.getPizzas();
        long i = pizzas.stream()
                .filter(pizza -> pizza.getIngredients().contains("pomidor") && pizza.getIngredients().contains("papryka"))
                .count();
        return i > 0;
    }

    public static boolean isAllPizzaContainMozzarella() {
        List<Pizza> pizzas = PizzaMenu.getPizzas();
        long numberOfPizzaContainMozzarella = pizzas.stream()
                .filter(pizza -> pizza.getIngredients().contains("mozarella"))
                .count();
        long numberOFPizza = pizzas.size();
        return numberOfPizzaContainMozzarella == numberOFPizza;
    }

    public static void printNameMaximumCaloriesPizza() {
        List<Pizza> pizzas = PizzaMenu.getPizzas();
        int maxKcal;
        maxKcal = pizzas.stream().map(Pizza::getCaloriesInKacal).toList()
                .stream()
                .max(Integer::compareTo)
                .get();
        pizzas.stream().filter(pizza -> pizza.getCaloriesInKacal() == maxKcal)
                .forEach(pizza -> System.out.println(pizza.getName()));

    }

    public static void printNameMinimumCaloriesPizza() {
        List<Pizza> pizzas = PizzaMenu.getPizzas();
        int minKcal;
        minKcal = pizzas.stream().map(Pizza::getCaloriesInKacal).toList()
                .stream()
                .min(Integer::compareTo)
                .get();
        pizzas.stream().filter(pizza -> pizza.getCaloriesInKacal() == minKcal)
                .forEach(pizza -> System.out.println(pizza.getName()));

    }
}