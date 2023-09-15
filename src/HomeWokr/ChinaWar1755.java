package HomeWokr;

public class ChinaWar1755 {
    static int liWarriors = 13;
    static int liArcher = 24;
    static int liHorses = 46;
    //воины Ли
    static int miWarriorsn = 9;
    static int minArcher = 35;
    static int minHorses = 12;

    public static void main(String[] args) {

        int allTyp = 860;

        double allWariosrLi = liWarriors * allTyp;
        double allArcherLie = liArcher * allTyp;
        double allHorsesLi = liHorses * allTyp;

        System.out.println("Воинов Ли " + allWariosrLi);
        System.out.println("Стрелков Ли " + allArcherLie);
        System.out.println("Всадников Ли " + allHorsesLi);
        System.out.println();

        double allWariosMi = miWarriorsn * allTyp * 1.5;
        double allArcherMi = minArcher * allTyp * 1.5;
        double allHorsesMi = minHorses * allTyp * 1.5;

        System.out.println("Воинов Минь " + allWariosMi);
        System.out.println("Стрелков Минь " + allArcherMi);
        System.out.println("Всадников Минь " + allHorsesMi);

        System.out.println();
        System.out.println("Воинов Ли меньше на " + (allWariosMi - allWariosrLi) + "шт");
        System.out.println("Стрелков Ли меньше на " + (allArcherMi - allArcherLie) + "шт");
        System.out.println("Всадников Ли больше на " + (allHorsesLi - allHorsesMi) + "шт");
        System.out.println();

        System.out.println("Общее количество воинов армии Ли " + (allWariosrLi + allArcherLie + allHorsesLi)+ "шт");
        System.out.println("Общее количество воинов армии Минь " + (allWariosMi + allArcherMi + allHorsesMi) + "шт");
    }
}
