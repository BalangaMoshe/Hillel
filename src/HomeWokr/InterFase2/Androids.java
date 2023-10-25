package HomeWokr.InterFase2;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Андроїд звонить нікуди не буде!");
    }

    @Override
    public void sms() {
        System.out.println("СМС не відправить!");
    }

    @Override
    public void internrt() {
        System.out.println("В інтернект не піде!");
    }

    @Override
    public void getOSwersionLinux() {
        System.out.println("Андроїд руле, бо на лінухсі!)");
    }
}
