package HomeWokr.MusikPlayer;

public abstract class MusicStyles {
        private String name1;
        private String name2;
        private String name3;

    public MusicStyles(String name1, String name2, String name3) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }
}
