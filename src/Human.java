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

    public void setBirthYear(int birthYear) {
        if (birthYear < 0){
            this.birthYear = 0;
        }else {
            this.birthYear = birthYear;
        }
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
    }

    public void setTown(String town){
            if (town == null) {
                this.name = "Информация не указана";
            } else {
                this.town = town;
            }
        }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null) {
            this.name = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
    }

    Human (int birthYear, String name, String town, String jobTitle){
        if (birthYear < 0){
            this.birthYear = 0;
        }else {
            this.birthYear = birthYear;
        }
        if (name == null){
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if (town == null) {
            this.name = "Информация не указана";
        }else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.name = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
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
