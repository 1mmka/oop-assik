package Assignment_3_OOP2;

class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the object is null
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Iphone)) {
            return false;
        }

        Iphone other = (Iphone) obj;

        // Compare all fields
        return this.model.equals(other.model) &&
                this.color.equals(other.color) &&
                this.price == other.price;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}
