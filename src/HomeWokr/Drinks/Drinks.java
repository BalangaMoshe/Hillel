package HomeWokr.Drinks;

public class Drinks {
    public static final double TEE_PRICE = 1.50;
    public static final double COFFE_PRICE = 2.50;
    public static final double LIMONADO_PRICE = 3.00;
    public static final double MOXITO_PRICE = 3.50;
    public static final double MINERALWOTER_PRICE = 4.00;
    public static final double KOKA_KOLA_PRICE = 4.50;

    private String name;
    private final double preis;

    Drinks(String name, double preis) {
        this.name = name;
       this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }
}

