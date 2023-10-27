package HomeWokr.EnUm;

public class TypeAutoClass {
    private String type;
    public static final TypeAutoClass auto = new TypeAutoClass("Автівка");
    public static final TypeAutoClass truck = new TypeAutoClass("КраЗ");
    public static final TypeAutoClass bus = new TypeAutoClass("Богдан");
    public static final TypeAutoClass moto = new TypeAutoClass("Верховина");

    private TypeAutoClass(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
