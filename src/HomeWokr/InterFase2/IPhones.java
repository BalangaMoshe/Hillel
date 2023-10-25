package HomeWokr.InterFase2;

public class IPhones implements Smartphones,IOS{
    @Override
    public void call() {
        System.out.println("Звони мій Айфоне!");

    }

    @Override
    public void sms() {
        System.out.println("Пиши СМСа мій Aйфоне!");

    }

    @Override
    public void internrt() {
        System.out.println("Айфоне, зайди в інтернеКти!");

    }

    @Override
    public void getOSwersionIOS() {
        System.out.println("А шо, Айфуни не не Лінухсі))?");

    }
}
