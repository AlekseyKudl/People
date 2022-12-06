import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static final Auto[] AUTOS = new Auto[11];
    public static void main(String[] args) {
    Human maxim = new Human(1988, "Максим", "Минск");
    Human anna = new Human(1993, "Аня", "Москва");

    Human kate = new Human(1992, "Катя", "Калининград");

    Human artem = new Human(1995, "Артем", "Москва");
    maxim.hello();
    anna.hello();
    kate.hello();
    artem.hello();
    maxim.jobTitle = "бренд-менеджер";
    anna.jobTitle = "методист образовательных программ";
    kate.jobTitle = "продакт-менеджер";
    artem.jobTitle = "директор по развитию бизнеса";
        maxim.hello2();
        anna.hello2();
        kate.hello2();
        artem.hello2();
// задание 3
        System.out.println("_________________________________________");

        AUTOS[0]= new Auto("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        AUTOS[1] = new Auto("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        AUTOS[2]= new Auto("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        //Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        AUTOS[3] = new Auto("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
        AUTOS[4] = new Auto("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        printFullinfo();

        //задание_3
        System.out.println("_______________________________________");
        maxim.setName(null);
        anna.setJobTitle(null);
        kate.setBirthYear(-1999);
        artem.setTown(null);
        maxim.hello2();
        anna.hello2();
        kate.hello2();
        artem.hello2();
        System.out.println("_____________________________________________________");

        AUTOS[5] = new Auto(null, "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        AUTOS[6] = new Auto("Hyundai", null, - 1.0, "оранжевый", 2016, "Южная Корея");
        AUTOS[7] = new Auto("Hyundai", "Avante", 1.6, null, 2016, "Южная Корея");
        AUTOS[8] = new Auto("Hyundai", "Avante", 0, "оранжевый", -100, "Южная Корея");
        AUTOS[9] = new Auto("Hyundai", "Avante", 1.6, "оранжевый", 0, null);
        AUTOS[10] = new Auto("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        printFullinfo();
    }
    private static void printFullinfo() {
        for (Auto auto : AUTOS) {
            if (auto != null) {
                System.out.println(auto);
            }
        }
    }

}