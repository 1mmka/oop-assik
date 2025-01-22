package Assignment_3_OOP2;

class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "body_type1";

    public Bugatti() {
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static void main(String[] args) {
        Bugatti myBugatti = new Bugatti();
        System.out.println(myBugatti.getBody());

        myBugatti.setBody("body_type2");
        System.out.println(myBugatti.getBody());
    }
}
