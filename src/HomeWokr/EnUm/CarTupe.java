package HomeWokr.EnUm;

public enum CarTupe {
    CAR("Автівка Жігуль"),
    MOTORCIKLE("Мопед Верховина"),
    TRUCK("Грузовик Белаз"),
    BUS("Бус Богдан");
    private String type;

    //    private int x;
    CarTupe(String type) {
        this.type = type;
//        this.x = x;
    }

    public String getType() {
        return type;
    }

//    public int getX() {
//        return x;
//    }
}
