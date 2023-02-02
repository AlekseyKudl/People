public class Human {
    private int birthYear;
    String name;
    private String town;

    String jobTitle;
    Human (int birthYear, String name, String town, String jobTitle) {
        if (name == null || name.isBlank()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.trim().length() == 0) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (birthYear < 0){
            this.birthYear = 0;
        }else {
            this.birthYear = birthYear;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }

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
