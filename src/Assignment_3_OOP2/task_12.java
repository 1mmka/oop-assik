package Assignment_3_OOP2;

class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("bought 10 batons");
        } else {
            System.out.println("bought 1 loaf");
        }
    }
}
