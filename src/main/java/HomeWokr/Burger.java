package HomeWokr;

public class Burger {
    Burger(String brot, String fleish, String maio, String zwibel, String kese) {
        this.brot = brot;
        this.fleish = fleish;
        this.maio = maio;
        this.zwibel = zwibel;
        this.kese = kese;
        System.out.println("ЗВИЧАЙНИЙ БУРГЕР(усі компоненти) *** ");

    }
    Burger(String brot, String fleish, String maio, String zwibel, String kese, String fleish2) {
        this.brot = brot;
        this.fleish = fleish;
        this.maio = maio;
        this.zwibel = zwibel;
        this.kese = kese;
        this.fleish2 = fleish2;
        System.out.println("ДІЄТИЧНИЙ БУРГЕР(без майонезу) *** ");
    }

     Burger(String brot, String fleish, String zwibel, String kese) {
        this.brot = brot;
        this.fleish = fleish;
        this.zwibel = zwibel;
        this.kese = kese;
         System.out.println("КОРОЛІВСЬКИЙ БУРГЕР(подвійне мясо) *** ");
    }

    public Burger(String zwibel) {
        this.zwibel = zwibel;
        System.out.println("ВЄГАНСЬКИЙ(для похудєнія) *** ");
    }

    String brot;
    String fleish;
    String maio;
    String zwibel;
    String kese;
    String fleish2;

    String burgerNormal() {
        return brot + fleish + maio + zwibel + kese;
    }

    String burgerDiette() {
        return  brot + fleish + zwibel + kese;
    }

    String burgerTooFleish() {
        return brot + fleish + maio + zwibel + kese + fleish;
    }

    String burgerVegan() {
        return  zwibel;
    }

}
