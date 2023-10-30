package HomeWokr;

import java.util.Scanner;

public class GuessNumRandom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть будь яке число ");

        for (int i = 0; i <= 3; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Ви ввели не правильне число!");
                scanner.nextLine();
                if (i == 2) {
                    System.out.println("Залишилась остання спроба!");
                } else if (i == 3) {
                    System.out.println("Спроби закінчено, спробуйте зпочатку!");
                    break;
                }
            }

        }


        int random = (int) (Math.random() * 11);

        for (int j = 0; j < 5; j++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Введіть число!");
                scanner.nextLine();continue;
            }

            int numerUsers = scanner.nextInt();

            if (numerUsers > random) {
                System.out.println("Введіть трошечки менше число:");
            }
            if (numerUsers < random) {
                System.out.println("Веедшть трошечки більше число:");
            }
            if (numerUsers == random) {
                System.out.println("Ви вгадали!!!");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Рандомне число було: " + random);
    }

}

