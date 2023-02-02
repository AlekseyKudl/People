import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static final Auto[] AUTOS = new Auto[11];
    public static void main(String[] args) {
    Human maxim = new Human(1988, "Максим", "Минск","бренд-менеджер");
    Human anna = new Human(1993, "Аня", "Москва","методист образовательных программ");

    Human kate = new Human(1992, "Катя", "Калининград","продакт-менеджер");

    Human artem = new Human(1995, "Артем", "Москва","директор по развитию бизнеса");
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
        System.out.println("_____________________________________________________");

    }
    private static void printFullinfo() {
        for (Auto auto : AUTOS) {
            if (auto != null) {
                System.out.println(auto);
            }
        }
        System.out.println("_____________________________________________________");

        //задание 1 урок 2
        //Владимир, который родился в 2001 году, живет в Казани, сейчас нигде не работает.
        Human vlad = new Human(2001, "Владимир", "Казань", "безработный");
        vlad.hello2();
        System.out.println("_____________________________________________________");
        //Роза обыкновенная из Голландии, стоимость штуки — 35,59 рублей.
        //Хризантема, стоимость штуки — 15 рублей, срок стояния — 5 дней.
        //Пион из Англии, стоимость штуки — 69,9 рублей, срок стояния — 1 день.
        //Гипсофила, страна происхождения — Турция, стоимость штуки — 19,5 рублей, срок стояния — 10 дней.


        Flowers rose = new Flowers("Роза обыкновенная", "Голландия", 35.59, 0);
        Flowers hriz = new Flowers("Хризантема", "", 15, 5);
        Flowers pion = new Flowers("Пион", "Англия", 69.9, 1);
        Flowers gips = new Flowers("Гипсофила", "Турция", 19.5, 10);
        System.out.println(rose);
        rose.plant();
        hriz.plant();
        pion.plant();
        gips.plant();
        Bouquet bouquet1 = new Bouquet(
                new Flowers[]{rose, rose, rose, hriz, hriz, pion, gips});
        Bouquet bouquet2 = new Bouquet(
                new Flowers[]{rose, rose, hriz, hriz, gips});
        System.out.println(bouquet1);
        System.out.println(bouquet2);
    }

}