class Employeethis {
    String name;
    double salary;

    Employeethis(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        Employeethis e = new Employeethis("Ram", 10000);
        e.display();
    }
}