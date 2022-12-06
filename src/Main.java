import javax.swing.*;

public class Main {
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

    }

}