package People;

public class People {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;


    People(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name.length() > 0 && name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (town.length() > 0 && town != null) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
        if (jobTitle.length() > 0 && jobTitle != null) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Информация не указана";
        }
    }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году" + ". Я работаю на должности " + jobTitle + ". Будем знакомы.";
    }


}
