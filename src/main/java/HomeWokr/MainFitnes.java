package HomeWokr;

public class MainFitnes {

    public static void main(String[] args) {

        FitnesTreker users1 = new FitnesTreker("Льоня ", 1986, "Липень", 25, "leonid25@gmail.com",
                "+380935698745", "Льон", 55.5, "120/60", 19000);
        users1.vorname = ("Кузьмич");
        users1.wage = (705.0);
        users1.pressure = ("320/180");
        users1.steps = (1055000);
        users1.printAccountInfo();

        FitnesTreker users2 = new FitnesTreker("Валера ", 2005, "Лютий ", 15, "valer15@gmail.com",
                "+36789562214", "Валерянка ", 102.9, "180/120", 500);
        users2.printAccountInfo();

        FitnesTreker users3 = new FitnesTreker("Антон ", 2000, "Січень", 10, "anton2000ant@gmail.com",
               "+38093123456", "Антонюк", 72.5, "120/70", 2000);
        users3.printAccountInfo();

        FitnesTreker users4 = new FitnesTreker("Федя ", 1958, "Січень", 14, "fedka@gmail.com",
                "+38095983456", "Федит", 95.5, "160/90", 25000);
        users4.printAccountInfo();
        FitnesTreker users5 = new FitnesTreker("Русик ", 1936, "Липень", 15, "rusla@gmail.com",
                "+38089556445", "Руслік", 59.5, "100/40", 1980);
        users5.vorname = ("Русь");
        users5.wage = (85.0);
        users5.pressure = ("115/98");
        users5.steps = (14500);
        users5.printAccountInfo();

    }
}
