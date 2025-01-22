package Assignment_3_OOP2;

class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Orange"; // Default value for color
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 4321; // Default value for year
        this.color = "Orange"; // Default value for color
    }

    public void printDetails() {
        System.out.println("Manufacturer: " + manufacturer + ", Model: " + model +
                ", Year: " + year + ", Color: " + color);
    }

    public static void main(String[] args) {
        CarConcern car1 = new CarConcern("Aventador", 2022, "Red");
        CarConcern car2 = new CarConcern("Huracan", 2021);
        CarConcern car3 = new CarConcern("Gallardo");

        car1.printDetails();
        car2.printDetails();
        car3.printDetails();
    }
}
