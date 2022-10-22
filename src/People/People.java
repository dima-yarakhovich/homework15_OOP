package People;

public class People {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;


    People(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году"+". Я работаю на должности "+jobTitle+". Будем знакомы.";
    }

}
