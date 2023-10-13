package HomeWokr;

public class Burger {
    Burger(String brot, String fleish, String maio, String zwibel, String kese) {
        this.brot = brot;
        this.fleish = fleish;
        this.maio = maio;
        this.zwibel = zwibel;
        this.kese = kese;
    }
    Burger(String brot, String fleish, String maio, String zwibel, String kese, String fleish2) {
        this.brot = brot;
        this.fleish = fleish;
        this.maio = maio;
        this.zwibel = zwibel;
        this.kese = kese;
        this.fleish2 = fleish2;
    }

     Burger(String brot, String fleish, String zwibel, String kese) {
        this.brot = brot;
        this.fleish = fleish;
        this.zwibel = zwibel;
        this.kese = kese;
    }

    public Burger(String zwibel) {
        this.zwibel = zwibel;
    }

    String brot;
    String fleish;
    String maio;
    String zwibel;
    String kese;
    String fleish2;

    String burgerNormal() {
        return "ЗВИЧАЙНИЙ БУРГЕР(усі компоненти) *** " + brot + fleish + maio + zwibel + kese + "***";
    }

    String burgerDiette() {
        return "ДІЄТИЧНИЙ БУРГЕР(без майонезу) *** " + brot + fleish + zwibel + kese + "***";
    }

    String burgerTooFleish() {
        return "КОРОЛІВСЬКИЙ БУРГЕР(подвійне мясо) *** " + brot + fleish + maio + zwibel + kese + fleish + "***";
    }

    String burgerVegan() {
        return "ВЄГАНСЬКИЙ(для похудєнія) *** " + zwibel + "***";
    }

}
