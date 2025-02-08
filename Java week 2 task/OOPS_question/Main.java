package OOPS_question;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Supra", 2016);
        ElectricCar electricCar1 = new ElectricCar("Audi", "e-tron gt", 2022, 380);

        Car[] cars = { car1, electricCar1 };

        for (Car car : cars) {
            car.startEngine();
        }
    }
}
