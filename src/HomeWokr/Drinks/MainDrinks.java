package HomeWokr.Drinks;

import java.util.Arrays;
import java.util.Scanner;

public class MainDrinks {
    public static void main(String[] args) {
        runDrinks();
    }

    static void runDrinks() {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        String userValueDrink;
        int totalDrinks = 0;

        DrinksMachine[] drinksArray = DrinksMachine.values();
        System.out.println("Вітаємо! Виберіть будь ласка будь-який напій: " + Arrays.toString(drinksArray));

        while (true) {
            userValueDrink = scanner.nextLine().toUpperCase();
            DrinksMachine drinks = null;

            for (DrinksMachine drinks1 : drinksArray) {
                if (userValueDrink.equals(drinks1.toString())) {
                    drinks = drinks1;
                    break;
                }
            }

            if (drinks != null) {
                double drinkPrice = getDrinkPrice(drinks);
                totalCost += drinkPrice;
                totalDrinks++;

                System.out.println(drinks + " коштує " + drinkPrice + " EUR");
                System.out.println("Ви обрали " + drinks + ". Загальна вартість: " + totalCost + " EUR");
                System.out.println("Бажаєте ще щось?");

            } else if (userValueDrink.toUpperCase().equals("NO")) {
                System.out.println("Загальна вартість обраних напоїв: " + totalCost + " EUR ");
                System.out.println("Загальна кількість обраних напоїв: " + totalDrinks + " штюк.");
                break;
            } else {
                System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        }
    }

    static double getDrinkPrice(DrinksMachine drink) {
        switch (drink) {
            case TEE:
                return Drinks.TEE_PRICE;
            case COFFE:
                return Drinks.COFFE_PRICE;
            case LIMONADO:
                return Drinks.LIMONADO_PRICE;
            case MOXITO:
                return Drinks.MOXITO_PRICE;
            case MINERALWOTER:
                return Drinks.MINERALWOTER_PRICE;
            case KOKA_KOLA:
                return Drinks.KOKA_KOLA_PRICE;
            default:
                return 0.0;
        }
    }
}
