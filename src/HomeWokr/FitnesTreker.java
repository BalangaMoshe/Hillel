package HomeWokr;
public class FitnesTreker {
    private String name;
    private int ageJahr;
    private String ageMonat;
    private int ageDay;
    private String email;
    private String tel;
    public String vorname;
    public double wage;
    public String pressure;
    public int steps;
    private int age;


    public FitnesTreker(String name, int ageJahr, String ageMonat, int ageDay, String email, String tel,
                        String vorname, double wage, String pressure, int steps) {
        this.name = name;
        this.ageJahr = ageJahr;
        this.ageMonat = ageMonat;
        this.ageDay = ageDay;
        this.email = email;
        this.tel = tel;
        this.vorname = vorname;
        this.wage = wage;
        this.pressure = pressure;
        this.steps = steps;
    }
    public String getName() {
        return name;
    }
    public int getAgeJahr() {
        return ageJahr;
    }
    public String getAgeMonat() {
        return ageMonat;
    }
    public int getAgeDay() {
        return ageDay;
    }
    public String getEmail() {
        return email;
    }
    public String getTel() {
        return tel;
    }
    public int getAge() {
        return age;
    }
    public void setAgeJahr(int ageJahr) {
        this.ageJahr = ageJahr;
    }
    public void setAgeMonat(String ageMonat) {
        this.ageMonat = ageMonat;
    }
    public void setAgeDay(int ageDay) {
        this.ageDay = ageDay;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void printAccountInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Дата народження: " + ageDay + "/" + ageMonat + "/" + ageJahr);
        System.out.println("Емейл: " + email);
        System.out.println("Телефон: " + tel);
        System.out.println("Прізвище: " + vorname);
        System.out.println("Вага: " + wage + " кг");
        System.out.println("Тиск: " + pressure);
        System.out.println("Кількість пройдених за день кроків: " + steps);
        System.out.println("Вік: " + (2023 - ageJahr));
        System.out.println("------------------------");
    }

}
