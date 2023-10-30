package HomeWokr;

import java.util.Scanner;

public class ConterStr2 {
    static String teamName1;
    static int player1;
    static int player2;
    static int player3;
    static int player4;
    static int player5;
    static String teamName2;
    static int player1Team2;
    static int player2Team2;
    static int player3Team2;
    static int player4Team2;
    static int player5Team2;
    static int fragsTeam1;
    static int fragsTeam2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву першої команди: ");
        teamName1 = scanner.nextLine();
        System.out.println();

        System.out.println("Кількисть фрагів гравця номер 1, команди " + teamName1);
        if (scanner.hasNextInt()) {
            player1 = scanner.nextInt();
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Кількисть фрагів гравця номер 2, команди " + teamName1);
        if (scanner.hasNextInt()) {
            player2 = scanner.nextInt();
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Кількисть фрагів гравця номер 3, команди " + teamName1);
        if (scanner.hasNextInt()) {
            player3 = scanner.nextInt();
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Кількисть фрагів гравця номер 4, команди " + teamName1);
        if (scanner.hasNextInt()) {
            player4 = scanner.nextInt();
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Кількисть фрагів гравця номер 5, команди " + teamName1);
        if (scanner.hasNextInt()) {
            player5 = scanner.nextInt();
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }

        fragsTeam1 = player1 + player2 + player3 + player4 + player5;
        System.out.println("Фрагіг команди " + teamName1 + " " + fragsTeam1);
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

        //Фухх, погнали считать вторую команду

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введіть назву другої команди: ");
        teamName2 = scanner2.nextLine();
        System.out.println();

        System.out.println("Кількисть фрагів гравця номер 1, команди " + teamName2);
        if (scanner2.hasNextInt()) {
            player1Team2 = scanner2.nextInt();
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Кількисть фрагів гравця номер 2, команди " + teamName2);
        if (scanner2.hasNextInt()) {
            player2Team2 = scanner2.nextInt();
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Кількисть фрагів гравця номер 3, команди " + teamName2);
        if (scanner2.hasNextInt()) {
            player3Team2 = scanner2.nextInt();
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Кількисть фрагів гравця номер 4, команди " + teamName2);
        if (scanner2.hasNextInt()) {
            player4Team2 = scanner2.nextInt();
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Кількисть фрагів гравця номер 5, команди " + teamName2);
        if (scanner2.hasNextInt()) {
            player5Team2 = scanner2.nextInt();
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }

        fragsTeam2 = player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2;
        System.out.println("Фрагіг команди " + teamName2 + " " + fragsTeam2);
        System.out.println();


        System.out.println("Середнье арифметичне команди " + teamName1 + " " + (fragsTeam1 / 5) + " балів");
        System.out.println("Середнье арифметичне команди " + teamName2 + " " + (fragsTeam2 / 5) + " балів");
        System.out.println();

        if (fragsTeam1 > fragsTeam2) {
            System.out.println("Виграла команда " + teamName1 + " " + fragsTeam1 + " фрагів");
        } else if (fragsTeam1 < fragsTeam2) {
            System.out.println("Виграла команда " + teamName2 + " " + fragsTeam2 + " фрагів");
        } else if (fragsTeam1 == fragsTeam2) {
            System.out.println("НІЧИЯ!!!");

        }
    }
}
