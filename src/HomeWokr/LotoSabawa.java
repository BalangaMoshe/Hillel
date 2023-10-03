package HomeWokr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotoSabawa {
    static int max = 9;
    static int min = 0;

    public static void main(String[] args) {

        int[] numerUser = new int[7];

        System.out.println("Запрошуємо Вас в программу Лото Забава!");
        System.out.println("Введіть 7 чисел від 0 до 9. ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numerUser.length; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Ви ввели символ, а треба число!");
                break;
            }
            int userInput = scanner.nextInt();

            if (userInput > max) {
                System.out.println("Число більше 9!");
                break;
            }
            numerUser[i] = userInput;
        }
        System.out.println(Arrays.toString(numerUser) + " --- Числа, які ввів користувач!");

        //тепер заполняем Массиф рандомніми числами

        int[] numerPCrandom = new int[7];

        for (int i = 0; i < numerPCrandom.length; i++) {

            int randomPC = (int) (Math.random() * (max - min + 1) + min);
            numerPCrandom[i] = randomPC;
        }
        System.out.println(Arrays.toString(numerPCrandom) + " --- Числа загадані програмою Лото-Забава!");
        System.out.println("---------------------");

        // тепер в сортировку!

        Arrays.sort(numerPCrandom);
        System.out.println(Arrays.toString(numerPCrandom) + " Відсорьовано масив Забави");

        Arrays.sort(numerUser);
        System.out.println(Arrays.toString(numerUser) + " Відсорьовано масив Користувача");
        System.out.println("---------------------");

        // погнали сравнивать!


        for (int i = 0; i < numerPCrandom.length; i++) {

            if (numerPCrandom[i] == numerUser[i]) {
                System.out.println("Число Забави[" + i + "] = " + numerPCrandom[i] + ", Число користувача[" + i + "] = " + numerUser[i]);
            } else {
                System.out.println("Нажаль збігів в [" + i + "] нема :(");
            }
        }


    }
}

//    int random1 = (int) (Math.random() * (max - min + 1) + min);
//        arrayStatic[i]=random1;
//                System.out.print(random1+" ");
//                }
//                System.out.println("Числа, загадані програмою Лото-Забава");


//Сортировка массивов ВАРИАНТ 1

//        int[] array = {1, 5, 8, 6, 1, -55, -20, -999, 2};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println();


//Сортир Масс ВАРИАНТ 2
//        int counter = 0;
//        int[] hallo = {-5, -55, -55, -6, -99, -777, 8, 0, 25, 3};
//        for (int j = 0; j < hallo.length; j++) {
//            for (int i = 0; i < hallo.length - 1 - i; i++) {      //-1-i!!!!
//                counter++;
//                if (hallo[i] < hallo[i + 1]) {
//                    int numer = hallo[i];
//                    hallo[i] = hallo[i + 1];
//                    hallo[i + 1] = numer;
//                }
//            }
////        }
//        System.out.println(Arrays.toString(hallo));
//        System.out.println("Kount " + counter);

//        int element = 88;
//        int index = -1;
//        int[] massiv2 = {1, 2, 8, 99, 88, 6, -2};
//
//        for (int i = 0; i < massiv2.length; i++) {
//            if (massiv2[i] == element) {
//                index = i;
//                System.out.println("ich hab gefindet " + index);
//                break;
//            }
//            System.out.println(Arrays.toString(massiv2));
//
//

