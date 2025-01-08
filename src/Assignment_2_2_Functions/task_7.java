package Assignment_2_2_Functions;

public class task_7 {
    public static void main(String[] args) {
        signIn("user");
        signIn("yerkhan");
    }


    public static void signIn(String username){
        if (username.equals("user")) {
            return;
        }
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
