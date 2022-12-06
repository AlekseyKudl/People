public class Human {
    int birthYear;
    String name;
    String town;
    Human (int birthYear, String name, String town){
        this.birthYear = birthYear;
        this.name = name;
        this.town = town;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    void hello(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +". " +
                "Я родился в " + birthYear + " году. Будем знакомы!");
    }
}
