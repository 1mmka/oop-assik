package Assignment_3_OOP2;

class Programmer {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        if (newSalary > salary) {
            salary = newSalary;
        }
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println(programmer.getSalary());

        programmer.setSalary(900);
        System.out.println(programmer.getSalary());

        programmer.setSalary(1200);
        System.out.println(programmer.getSalary());
    }
}
