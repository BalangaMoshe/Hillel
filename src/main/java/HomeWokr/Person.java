package HomeWokr;

import java.util.Arrays;
import java.util.Scanner;

public class Person {
    //    public static void main(String[] args) {
////        printHello2("Bro");
////        printHello2("Mascha");
////        printHello2("Mischa");
////        sumNumer1(2,4,6,8);
////        sumNumer2(5,5);
////        int a = 4;
////        int b = 5;
////        System.out.println(getting(a, b));
////        returnDem( 9);
////        varArgs(2, 5, 88, 55, 5666, 888);
////        varArgs(9, 999, 9, 999, 99, 99999, 999999);
////        varArgs(7, 77, 777, 7777, 77777, 77777);
//        int[] aaray = {1,2,3,4,5};
//        System.out.println(Arrays.toString(aaray));
//        arrArr(aaray);
//        System.out.println(Arrays.toString(aaray));
//
//    }
//
//    static void printHello2(String hello2) {
//        System.out.println("Hallo " + hello2);
//    }
//
//    static void sumNumer1(int a, int b, int c, int d) {
//        System.out.println("Sum all ist => " + ((a + b) + (c + d)));
//    }
//
//    static void sumNumer2(int a, int b) {
//        System.out.println("sum 2 =  " + a + b);
//    }
//
//    static int getting(int a, int b) {
//        int sum = a + b;
//        return sum;
//    }
//
//    static int returnDem(int x) {
//        if (x > 5) {
//            System.out.println("x > 5");
//            return 5;
//        } else if (x < 5) {
//            System.out.println("x < 5 ");
//            return 0;
//
//        } else {
//            System.out.println("Халепа");
//            return 100;
//        }
//    }
//
//    static void varArgs(int... numbs) {
//        int summ = 0;
//        for (int i:numbs) {
//           summ += i;
//
//        }
//        System.out.println(summ + " numbiki");
//    }
//    static void arrArr (int[] aray){
//        aray [0] = 99;
//        aray [1] = 88;
//
//    }

    static String antwortDa = "Так";
    static String antwortNet = "Ні";

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] people = new String[10];
        int personCount = 0;

        while (true) {
            for (int i = 0; i < 1; i++) {

                System.out.print("Введіть імя: ");
                String name = scanner.nextLine();
                System.out.print("Введіть фамілію: ");
                String vorname = scanner.nextLine();
                System.out.print("Введіть місто: ");
                String town = scanner.nextLine();
                System.out.print("Введіть номер телефону: ");
                String telNumer = scanner.nextLine();

//                personInfo1(name, vorname, town, telNumer);
//                people[personCount] = "Ім'я: " + name + ", Фамілія: " + vorname + ", Місто: " + town + ", Телефон: " + telNumer;
//                personCount++;
                String personInfo = personInfo1(name, vorname, town, telNumer);
                people[personCount] = personInfo;
                personCount++;
            }

            System.out.println("Додати ще одну людину? (Так або Ні)");
            String antwort = scanner.nextLine();
            if (antwort.equalsIgnoreCase(antwortNet)) {
                System.out.println("Добре, ми закінчили!");
                break;
            } else if (antwort.equalsIgnoreCase(antwortDa)) {
                System.out.println("Добре, продовжуємо!");
            } else {
                System.out.println("Відповідь не правильна!");
                System.out.println();
                break;
            }
        }

        for (int i = 0; i < personCount; i++) {
            System.out.println("Інформація про людину " + (i + 1) + ":");
            System.out.println(people[i]);
        }
    }


    static String personInfo1(String name, String vorname, String town, String telNumber) {
        String info = ("-->  ");
        info += ("Зателефонувати громадянинові " + name + " " + vorname + " з міста " + town + " можна за номером " + telNumber);
        return info;
    }

}
