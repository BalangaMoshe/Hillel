package HomeWokr;

import HomeWokr.EnUm.CarTupe;
import HomeWokr.EnUm.DriverLessons;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        runApp();
        System.out.println("Кількість ліцензій " + DriverLessons.COUNTER_DRIVER_LESSONS);
    }


    static void runApp() {
        Scanner scanner = new Scanner(System.in);
        CarTupe carTupe = null;
        int years = 0;
        CarTupe[] carTupes = CarTupe.values();

        for (int i = 0; i < 5; i++) {
            while (carTupe == null) {
                System.out.println("Виберіть тип транспорту з листу" + Arrays.toString(carTupes));
                String userUelueCartTupe = scanner.nextLine().toUpperCase();
                for (CarTupe tupe : carTupes) {
                    if (userUelueCartTupe.equals(tupe.toString())) {
                        carTupe = CarTupe.valueOf(userUelueCartTupe);
                        break;
                    }
                }
            }

            while (true) {
                System.out.println("Введіть ваш стаж водіння:");
                if (!scanner.hasNextInt()) {
                    System.out.println("Ви помилились!");
                    break;
                } else {

                    years = scanner.nextInt();
                    scanner.nextLine();

                    if (years >= 0 && years <= 99) {
                        break;
                    } else {
                        System.out.println("Введіть корректно!!!");
                    }
                    scanner.nextLine();

                }
            }
            boolean ok = false;

            switch (carTupe) {
                case MOTORCIKLE: {
                    System.out.println("Для: " + CarTupe.MOTORCIKLE + " треба категорія  " + Category.A);
                    ok = chekYers(years, Category.A);
                    break;
                }

                case CAR: {
                    System.out.println("Для: " + CarTupe.CAR + " треба категорія  " + Category.B);
                    ok = chekYers(years, Category.B);
                    break;
                }

                case TRUCK: {
                    System.out.println("Для: " + CarTupe.TRUCK + " треба категорія  " + Category.C);
                    ok = chekYers(years, Category.C);
                    break;
                }

                case BUS: {
                    System.out.println("Для: " + CarTupe.BUS + " треба категорія  " + Category.D);
                    ok = chekYers(years, Category.D);
                    break;

                }
            }
            if (ok) {
                new DriverLessons();
                System.out.println("Еее, тримай права!");
            } else {
                System.out.println("Тобі ше бракує трохи стажу!");
            }
            carTupe = null;
        }
    }

    static boolean chekYers(int years, Category category) {
        // boolean result = false;
        switch (category) {
            case A: {
                return years >= 3;
            }
            case B: {
                return years > 0;
            }
            case C: {
                return years >= 5;
            }
            case D: {
                return years >= 7;
            }
            default: {
                return false;
            }
        }
    }
}
