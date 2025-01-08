package Assignment_2_3_OOP;

class Vehicle {
    double maxSpeed;
}

class Car extends Vehicle {
    int wheelCount;
    double weight;
}

class ElectricCar extends Car {
    int electricEnginePower;
}


public class task_3 {
    public static void main(String[] args) {
        ElectricCar electric_car = new ElectricCar();
        electric_car.maxSpeed = 360.9;
        electric_car.wheelCount = 4;
        electric_car.weight = 1500;
        electric_car.electricEnginePower = 500;

        System.out.println(electric_car.maxSpeed);
    }
}
