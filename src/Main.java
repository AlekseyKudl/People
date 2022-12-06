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
    }

}