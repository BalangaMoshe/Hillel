package HomeWokr;

import java.util.Scanner;

public class ConterStreik {
    static String team1;
    static String team2;
    static int fragsTeam1;
    static int fragsTeam2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву команди номер1: ");
        team1 = scanner.nextLine();
        System.out.println("Кількість фрагів команди " + team1);

        if (scanner.hasNextInt()) {
            fragsTeam1 = scanner.nextInt();
        }
        if (fragsTeam1 > 5) {
            System.out.println("Гравців не може бути більше 5");
            System.exit(0);
        }
        // Переходим до команди 2-ї

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введіть назву команди номер2: ");
        team2 = scanner1.nextLine();
        System.out.println("Кількість фрагів команди " + team2);

        if (scanner.hasNextInt()) {
            fragsTeam2 = scanner.nextInt();
        }
        if (fragsTeam2 > 5) {
            System.out.println("Гравців не може бути більше 5");
            System.exit(0);
        }
        if (fragsTeam1 > fragsTeam2) {
            System.out.println("Виграла команда " + team2 + ". Вбили " + fragsTeam1 + " гравців");
        } else if (fragsTeam1 < fragsTeam2) {
            System.out.println("Виграла команда " + team1 + ". Вбили " + fragsTeam2 + " гравців");

        } else if (fragsTeam1 == fragsTeam2) {
            System.out.println("Нічия!!!!");

        }


        // System.out.println("Команда " + team1 + " вбитих " + fragsTeam1);
        //System.out.println("Команда " + team2 + " вбитих " + fragsTeam2);


    }
}
