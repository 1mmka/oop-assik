package Assignment_2_3_OOP;

class Terran {
    public void outputText() {
        System.out.println("terran class");
    }
}

class Human extends Terran {
    public void speak_human() {
        System.out.println("human class extends terran class");
    }
}

class Woman extends Human {
    public void speak_woman() {
        System.out.println("woman class extends human class");
    }
}

public class task_2 {
    public static void main(String[] args) {
        Woman woman_object = new Woman();
        woman_object.speak_woman();
        woman_object.speak_human();
        woman_object.outputText();

        Human human_object = new Human();
        human_object.speak_human();
        human_object.outputText();

        Terran terran_object = new Terran();
        terran_object.outputText();
    }
}