import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    Human maxim = new Human(1988, "Максим", "Минск");
    maxim.hello();
    Human anna = new Human(1993, "Аня", "Москва");
    anna.hello();
    Human kate = new Human(1992, "Катя", "Калининград");
    kate.hello();
    Human artem = new Human(1995, "Артем", "Москва");
    artem.hello();
    }

}