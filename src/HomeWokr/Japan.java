package HomeWokr;

public class Japan {

    public static void main(String[] args) {

        int i = 0;
        while (i < 100) {
            i++;

            if (i / 10 == 4 || i % 10 == 4) {
                continue;
            }
            if (i / 10 == 9 || i % 10 == 9) {
                continue;
            }
            System.out.println("Номер шатлу " + i);
        }
        System.out.println("Кількість пронумерованих " + i);
    }
}
