package HomeWokr.MusikPlayer;

public class MainMusik {
    public static void main(String[] args) {
//        StartPause startPause = new StartPause();
//
//        PopMusic popMusic = new PopMusic("Backstreet Boys ", " Spice Girls    ", " NSYNC ");
//        ClassicMusic classicMusic = new ClassicMusic("Andrea Bocelli ", " Enya ", " Sarah Brightman ");
//        RokMusik rokMusik = new RokMusik("Nirvana ", " Red Hot Chili Peppers ", " Pearl Jam ");
//
//        startPause.playMusic(popMusic);
//        System.out.println("----------------");
//        startPause.playMusic(classicMusic);
//        System.out.println("----------------");
//        startPause.playMusic(rokMusik);

        StartPause[] startPauses = {
                new StartPause()
        };
        MusicStyles[] musicStyles = {
                new PopMusic("Backstreet Boys ", " Spice Girls    ", " NSYNC "),
                new ClassicMusic("Andrea Bocelli ", " Enya ", " Sarah Brightman "),
                new RokMusik("Nirvana ", " Red Hot Chili Peppers ", " Pearl Jam ")
        };
        for (StartPause startPause : startPauses) {
            for (MusicStyles musicStyle : musicStyles) {
                startPause.playMusic(musicStyle);
                
            }
            
        }

    }
}
