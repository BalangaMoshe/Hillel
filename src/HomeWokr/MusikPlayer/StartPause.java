package HomeWokr.MusikPlayer;

public class StartPause extends Start{
    @Override
    public void playMusic(MusicStyles musicStyles) {
        System.out.println(musicStyles.getName1() + " грай ");
        System.out.println(musicStyles.getName2() + " моя мила ");
        System.out.println(musicStyles.getName3()+ " музика грай! ");

    }
}
