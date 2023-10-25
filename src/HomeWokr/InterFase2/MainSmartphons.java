package HomeWokr.InterFase2;

public class MainSmartphons {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();

        androids.getOSwersionLinux();
        androids.internrt();
        androids.call();
        androids.sms();
        System.out.println("-------------");

        iPhones.getOSwersionIOS();
        iPhones.internrt();
        iPhones.call();
        iPhones.sms();
//        Androids[] androids = {
//                new Androids()
//        };
//        for (Androids android : androids) {
//            android.sms();
//            android.call();
//            android.internrt();
//            android.getOSwersionLinux();
//        }
//        IPhones[] iPhones = {
//                new IPhones()
//        };
//        for (IPhones iPhone : iPhones) {
//            iPhone.sms();
//            iPhone.call();
//            iPhone.internrt();
//            iPhone.getOSwersionIOS();
//        }
//
    }
}
