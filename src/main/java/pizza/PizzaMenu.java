package pizza;

import java.util.Arrays;
import java.util.List;

public class PizzaMenu {
    private static List<Pizza> pizzas;

    public static void createPizzaMenu() {
        Pizza margarita = new Pizza(true, List.of("mozarella"), 206, "Margarita");
        Pizza scotti = new Pizza(true, Arrays.asList("mozarella", "pieczarki", "cebula"), 220, "Scotti");
        Pizza funghi = new Pizza(true, Arrays.asList("mozarella", "pieczarki", "cebula", "papryka"), 225, "Funghi");
        Pizza favorita = new Pizza(false, Arrays.asList("mozarella", "pieczarki", "papryka", "salami"), 230, "Favorita");
        Pizza vegetariana = new Pizza(true, Arrays.asList("mozarella", "cebula", "pomidor", "papryka", "seler"), 226, "Vegetariana");
        Pizza romantica = new Pizza(false, Arrays.asList("mozarella", "salami", "seler", "pomidor"), 237, "Romantica");
        Pizza americana = new Pizza(false, Arrays.asList("mozarella", "pieczarki", "salami"), 250, "Americana");
        Pizza laStrada = new Pizza(true, Arrays.asList("mozarella", "pomidor", "papryka", "seler"), 216, "La Strada");
        Pizza full = new Pizza(false, Arrays.asList("mozarella", "pieczarki", "salami", "cebula", "pomidor", "papryka", "seler"), 300, "Full");
        Pizza cebulita = new Pizza(true, Arrays.asList("mozarella", "cebula"), 238, "Cebulita");
        pizzas = Arrays.asList(margarita, scotti, funghi, favorita, vegetariana, romantica, americana, laStrada, full, cebulita);
    }

    public static List<Pizza> getPizzas() {
        return pizzas;
    }

}
