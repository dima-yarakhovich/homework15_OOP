package Car;

public class Car {
    String brand;
    String model;
    String color;
    double engineVolume;
    int year;
    String country;

    Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engineVolume = engineVolume;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return brand +" " +model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвет кузова, объём - " + engineVolume + " л.";
    }
}
