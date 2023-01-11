package pizza;

import java.util.List;

public class Pizza {
    private final boolean isVegetarian;
    private final List<String> ingredients;
    private final int caloriesInKcal;
    private final String name;

    public Pizza(boolean isVegetarian, List<String> ingredients, int caloriesInKacal, String name) {
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.caloriesInKcal = caloriesInKacal;
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCaloriesInKacal() {
        return caloriesInKcal;
    }

    public String getName() {
        return name;
    }

}
