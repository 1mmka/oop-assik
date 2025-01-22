package Assignment_3_OOP2;

class Car2 {
    private String model;
    private int year;
    private String color;

    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }

    public static void main(String[] args) {
        Car2 car = new Car2();
        car.initialize("Tesla Model S", 2025, "Red");
        car.displayDetails();
    }
}
