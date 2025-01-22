package Assignment_3_Interfaces;

public class task_6 {
    public static void main(String[] args) throws Exception {
        Screen screen = new Screen();
        screen.onSelect();
        screen.refresh();
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    static class Screen implements Selectable, Updatable {
        public void onSelect() {
            System.out.println("select");
        }

        public void refresh() {
            System.out.println("refresh");
        }
    }
}
