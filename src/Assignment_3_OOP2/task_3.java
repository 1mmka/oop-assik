package Assignment_3_OOP2;

class Skyscraper2 {
    private int floorsCount;
    private String developer;

    public Skyscraper2() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public Skyscraper2(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper2 skyscraper = new Skyscraper2(); // Default constructor
        Skyscraper2 skyscraperUnknown = new Skyscraper2(50, "Unknown");
    }
}
