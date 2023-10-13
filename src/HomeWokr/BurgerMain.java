package HomeWokr;

public class BurgerMain {
    public static void main(String[] args) {
        Burger normal = new Burger("Булка " , "Мясо, " , "Майонез, ","Цибуля, ","Сир.");
        System.out.println(normal.burgerNormal());
        System.out.println("-------------------");

        Burger diette = new Burger("Булка, ","Мясо, ","Цибуля, ","Сир.");
        System.out.println(diette.burgerDiette());
        System.out.println("-------------------");

        Burger tooFleich = new Burger("Булка, ","Мясо, ","Майонез, ","Цибуля, ","Сир, ","Телятина.");
        System.out.println(tooFleich.burgerTooFleish());
        System.out.println("-------------------");

        Burger vegan = new Burger("Цибуля.");
        System.out.println(vegan.burgerVegan());
    }
}
