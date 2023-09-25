package HomeWokr;

import java.util.Scanner;

public class GuessNumRandom {
    public static void main(String[] args) {
     /*   int i = 5;
        while (i >= 0) {

            int random = (int) (Math.random() * 11);
            System.out.println("Рандомне число " + random);
            if (random >= 0 && random <= 10) {
                System.out.println("WIIIINNNNN!!!!");
                break;
            }
            System.out.println(i);
            if (i == 0) {
                System.out.println("BUUUUMMM!!!");
            }
            i--;
       } */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть будь яке число ");

        int random = (int) (Math.random() * 11);

        for (int i = 0; i < 5; i++) {

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

