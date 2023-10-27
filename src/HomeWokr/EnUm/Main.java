package HomeWokr.EnUm;

import HomeWokr.TypeAuto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  System.out.println(TypeAutoClass.auto.getType());
        // System.out.println(TypeAutoClass.bus);
        // System.out.println(TypeAuto.moto.getType());
        //TypeAuto.valueOf("auto");
        // TypeAuto.values();

        Scanner scanner = new Scanner(System.in);
        String userUalue = scanner.nextLine();
        TypeAuto userTupAuto = null;

        TypeAuto[] typeAuto = TypeAuto.values();

        for (TypeAuto auto : typeAuto) {
            if (auto.toString().equals(userUalue)) ;
            userTupAuto = TypeAuto.valueOf(userUalue);
        }

        if (userTupAuto != null) {
            System.out.println(userTupAuto);
            System.out.println(userTupAuto.getType());
        }else
            System.out.println("bad");

    }
}
