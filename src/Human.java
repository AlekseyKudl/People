public class Human {
    int birthYear;
    String name;
    String town;

    String jobTitle;
    Human (int birthYear, String name, String town){
        this.birthYear = birthYear;
        this.name = name;
        this.town = town;
    }
    Human (int birthYear, String name, String town, String jobTitle){
        this.birthYear = birthYear;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    void hello(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +". " +
                "Я родился в " + birthYear + " году. Будем знакомы!");
    }
    void hello2(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +". " +
                "Я родился в " + birthYear + " году. Я работаю на должности " + jobTitle+ ". Будем знакомы!");
    }
}
