package HomeWokr;

public class ParalelepipedHW4 {
    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {
        a = 35;
        b = 40;
        c = 25;

        int volum = a * b * c;
        int lenght = a + b + c;

        System.out.println("Сумма всіх сторін трикутника = " + volum +"cм");
        System.out.println("Довжина всіх сторін трикутника = " + lenght + "cм");


    }
}
