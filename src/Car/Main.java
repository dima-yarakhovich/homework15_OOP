package Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "Росcии", "желтый", 1.7);
        Car audi = new Car("Audi", "A8 50L TDI", 2020, "Германии", "черный", 3.0);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0);
        Car kia = new Car("Kia", "Sportage", 2018, "Южная Корея", "красный", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}



