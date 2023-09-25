package HomeWokr;

public class Japan {

    public static void main(String[] args) {

      /*  int count = 0;
        while (i <= 100) {
            i++;

            if (i / 10 == 4 || i % 10 == 4) {
                continue;
            }
            if (i / 10 == 9 || i % 10 == 9) {
                continue;
            }
            count++;
            System.out.println("Номер шатлу " + i);
        }
        System.out.println("Кількість пронумерованих " + count); */

        int counter = 0;
        for (int i = 1; i <= 155; i++) {
            if (i / 10 == 4 || i % 10 == 4 || i / 10 == 14) {
                continue;
            }
            if (i / 10 == 9 || i % 10 == 9) {
                continue;
            }
            counter++;
            System.out.println("Номер шатлу " + i);
        }
        System.out.println("Кількість пронумерованих " + counter);

    }
}

