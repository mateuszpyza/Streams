package pizza;



public class Main {
    public static void main(String[] args) {
        PizzaMenu.createPizzaMenu();
        System.out.println("Pizza wegetarianska:");
        AnswersToInquiries.printVegetarianPizzas();
        System.out.println();
        System.out.println("Pizza z selerem:");
        AnswersToInquiries.printPizzaContainingCelery();
        System.out.println();
        System.out.println("Czy jest dotępna pizza w której jest pomidor ipapryka: ");
        System.out.println(AnswersToInquiries.isSomeonePizzaContainTomatoAndPepper());
        System.out.println();
        System.out.println("Czy wszystkie pitce zawierają mozarella:");
        System.out.println(AnswersToInquiries.isAllPizzaContainMozzarella());
        System.out.println();
        System.out.println("Pizza z największą ilością kalorii:");
        AnswersToInquiries.printNameMaximumCaloriesPizza();
        System.out.println();
        System.out.println("Pizza z najmniejszą ilością kalorii:");
        AnswersToInquiries.printNameMinimumCaloriesPizza();

    }
}
