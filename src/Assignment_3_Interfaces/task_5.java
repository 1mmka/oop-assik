package Assignment_3_Interfaces;

public class task_5 {
    public static void main(String[] args) throws Exception {
        BeerLover beerLover = new BeerLover();
        System.out.println(beerLover.isReadyToGoHome());
    }

    interface Drinker {
        void askForMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }

    interface Alcoholic extends Drinker{
        boolean READY_TO_GO_HOME = false;
        void sleepOnTheFloor();
    }

    static class BeerLover implements Alcoholic {
        public void askForMore(String message) {
            System.out.println(message);
        }

        public void sayThankYou() {
            System.out.println("thank you!");
        }

        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        public void sleepOnTheFloor() {
            System.out.println("sleep");
        }

    }
}
