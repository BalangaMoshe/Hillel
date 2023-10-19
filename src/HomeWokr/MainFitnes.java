package HomeWokr;

public class MainFitnes {
    public static void main(String[] args) {
//         FitnesTreker fitTrek1 = new FitnesTreker("Антон ", 2000, "Січень", 10, "anton2000ant@gmail.com",
//                "+38093123456", "Антонюк", 72.5, 120.70, 2000);
//
//        System.out.println("Імя - " + fitTrek1.getName());
//        System.out.println("Рік народження - " + fitTrek1.getAgeJahr());
//        System.out.println("ВІК - " + (2023 - fitTrek1.getAgeJahr()));
//        System.out.println("Місяць народження - " + fitTrek1.getAgeMonat());
//        System.out.println("День народження - " + fitTrek1.getAgeDay());
//        System.out.println("E-Mail - " + fitTrek1.getEmail());
//        System.out.println("Тел. - " + fitTrek1.getTel());
//        System.out.println("Фамілія - " + fitTrek1.vorname);
//        System.out.println("Вага - " + fitTrek1.wage + "кг");
//        System.out.println("Тиск - " + fitTrek1.pressure);
//        System.out.println("К-ть кроків - " + fitTrek1.steps);
//        System.out.println("----------------------------");
//
//        FitnesTreker fitTrek2 = new FitnesTreker("Валера ", 2005, "Лютий ", 15, "valer15@gmail.com",
//                "+36789562214", "Валерянка ", 102.9, 180.120, 500);
//
//        System.out.println("Імя - " + fitTrek2.getName());
//        System.out.println("Рік народження - " + fitTrek2.getAgeJahr());
//        System.out.println("ВІК - " + (2023 - fitTrek2.getAgeJahr()));
//        System.out.println("Місяць народження - " + fitTrek2.getAgeMonat());
//        System.out.println("День народження - " + fitTrek2.getAgeDay());
//        System.out.println("E-Mail - " + fitTrek2.getEmail());
//        System.out.println("Тел. - " + fitTrek2.getTel());
//        System.out.println("Фамілія - " + fitTrek2.vorname);
//        System.out.println("Вага - " + fitTrek2.wage + "кг");
//        System.out.println("Тиск - " + fitTrek2.pressure);
//        System.out.println("К-ть кроків - " + fitTrek2.steps);
//        System.out.println("----------------------------");
//
//        fitTrek2.steps = 95632;
//        fitTrek2.setAgeDay(8);
//        fitTrek2.setAgeJahr(1941);
//        fitTrek2.setAgeMonat("Березень");
//
//        System.out.println("Правильна к-ть кроків - " + fitTrek2.getName() + fitTrek2.steps);
//        System.out.println("Правильний день народження - " + fitTrek2.getName() + fitTrek2.getAgeDay());
//        System.out.println("Правильний рік народження - " + fitTrek2.getName() + fitTrek2.getAgeJahr());
//        System.out.println("Правильний ВІК - " + fitTrek2.getName() + (2023 - fitTrek2.getAgeJahr()));
//        System.out.println("----------------------------");
//
//
//        FitnesTreker fitTrek3 = new FitnesTreker("Льоня ", 1986, "Липень ", 25, "leonid25@gmail.com",
//                "+380935698745", "Льон", 55.5, 120.60, 19000);
//
//        System.out.println("Імя - " + fitTrek3.getName());
//        System.out.println("Рік народження - " + fitTrek3.getAgeJahr());
//        System.out.println("ВІК - " + (2023 - fitTrek3.getAgeJahr()));
//        System.out.println("Місяць народження - " + fitTrek3.getAgeMonat());
//        System.out.println("День народження - " + fitTrek3.getAgeDay());
//        System.out.println("E-Mail - " + fitTrek3.getEmail());
//        System.out.println("Тел. - " + fitTrek3.getTel());
//        System.out.println("Фамілія - " + fitTrek3.vorname);
//        System.out.println("Вага - " + fitTrek3.wage + "кг");
//        System.out.println("Тиск - " + fitTrek3.pressure);
//        System.out.println("К-ть кроків - " + fitTrek3.steps);
//        System.out.println("----------------------------");
//
//        fitTrek3.steps = 15;
//        fitTrek3.setAgeDay(12);
//        fitTrek3.setAgeJahr(1998);
//        fitTrek3.setAgeMonat("Листопад");
//
//        System.out.println("Правильна к-ть кроків - " + fitTrek3.getName() + fitTrek3.steps);
//        System.out.println("Правильний день народження - " + fitTrek3.getName() + fitTrek3.getAgeDay());
//        System.out.println("Правильний рік народження - " + fitTrek3.getName() + fitTrek3.getAgeJahr());
//        System.out.println("Правильний ВІК - " + fitTrek3.getName() + (2023 - fitTrek3.getAgeJahr()));

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
