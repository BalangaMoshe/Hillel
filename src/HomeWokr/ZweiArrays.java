package HomeWokr;

import java.util.Arrays;
import java.util.Scanner;

public class ZweiArrays {
    public static void main(String[] args) {

        //Пример 1
//        int [][] arra = new int[3][5];
//        for (int i = 0; i < arra.length ; i++) {
//            for (int j = 0; j < arra[i].length; j++) {
//                System.out.print(arra[i][j] + " ");
//            }
//            System.out.println();
//        }
        ///////////////////////////////////////пример2

//        int [][] arra = new int[3][5];
//        for (int i = 0; i < arra.length ; i++) {
//            for (int j = 0; j < arra[i].length; j++) {
//                arra[i][j] = (int) (Math.random() * 11);
//            }
//        }
//        for (int i = 0; i < arra.length ; i++) {
//            for (int j = 0; j < arra[i].length; j++) {
//                System.out.print(arra[i][j] + " ");
//            }
//            System.out.println();
//        }
//        0 2 4 9 3
//        7 4 0 5 5
//        6 3 3 6 8
        /////////////////////////////пример 3

//        int[][] array2 = {
//                {1, 5, 3, 6, 8},
//                {1, 8, 9, 6},
//                {1, 8, 99},
//                {55, 5},
//                {},
//        };
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                System.out.print(array2[i][j] + "\t");
//
//            }
//            System.out.println();
//
//        }
//        1	5	3	6	8
//        1	8	9	6
//        1	8	99
//        55	5

        ///////////////////////////////////////////////
//        int [][] array3 = new int[5][5];
//        for (int i = 0; i < array3.length; i++) {
//          for (int j = 0; j < array3.length ; j++) {
//                if (i == j)
//                    array3[i][j] = 1;
//               System.out.print(array3[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        1	0	0	0	0
//        0	1	0	0	0
//        0	0	1	0	0
//        0	0	0	1	0
//        0	0	0	0	1
///////////////////////////////////////////////

//        int[][] array3 = new int[5][5];
//        for (int i = 0; i < array3.length; i++) {
//            for (int j = 0; j < array3[i].length; j++) {
//                if ((i + j) == array3.length - 1) {
//                    array3[i][j] = 1;
//                }
//                System.out.print(array3[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        0	0	0	0	1
//        0	0	0	1	0
//        0	0	1	0	0
//        0	1	0	0	0
//        1	0	0	0	0
        //////////////////////////////////////////////

        // Тут будет домашка!
        int max = 9;
        int min = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення n: ");
        int num1 = 0;
        for (int i = 0; i < 1; i++) {
            while (true) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Ви ввели символ, а треба число!");
                    scanner.next();
                } else {
                    int userInput = scanner.nextInt();
                    if (userInput > max || userInput < min) {
                        System.out.println("Число треба шоб було від 1 до 9");
                    } else {
                        num1 = userInput;
                        System.out.println("Значення n(колл.РЯДОВ) = " + num1);
                        System.out.println("-----------");
                        break;
                    }
                }
            }
        }
        int n = num1; //мы проверили на подленность первое число

        System.out.print("Введіть значення m: ");
        int num2 = 0;

        for (int i = 0; i < 1; i++) {
            while (true) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Ви ввели символ, а треба число!");
                    scanner.next();
                } else {
                    int userInput2 = scanner.nextInt();
                    if (userInput2 > max || userInput2 < min) {
                        System.out.println("Число треба шоб було від 0 до 9");
                    } else {
                        num2 = userInput2;
                        System.out.println("Значення m(колл.СТОЛБОВ) = " + num2);
                        System.out.println("-----------");
                        break;
                    }
                }
            }
        }
        int m = num2; //мы проверили на подленность ВТОРОЕ число

        int[][] array = new int[n][m];

        // Заполняем рандомом до 10

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("BEFOR!!!");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array[i].length; j++) {
//                int kostyl = array[i][j];
//                array[i][j] = array[j][i];
//                array[j][i] = kostyl;
//            }
//        }
//        System.out.println("-------------------------------------");
//        System.out.println("AFTER!!!");
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
        int[][] array2 = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array2[j][i] = array[i][j];
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("AFTER!!!");


            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    System.out.print(array2[i][j] + "\t");
                }
                System.out.println();
            }


    }
}
