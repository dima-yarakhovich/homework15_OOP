package Car;

public class Car {
    String brand;
    String model;
    String color;
    double engineVolume;
    int year;
    String country;

    Car(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand.length() > 0 && brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";

        }
        if (model.length() > 0 && model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (color.length() > 0 && color != null) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country.length() > 0 && country != null) {
            this.country = country;
        } else {
            this.country = "default";
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвет кузова, объём - " + engineVolume + " л.";
    }
}
