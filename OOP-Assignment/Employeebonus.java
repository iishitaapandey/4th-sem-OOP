abstract class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    abstract double bonus();
}

class Manager extends Employee {
    double salary;

    Manager(String n, int i, double s) {
        super(n, i);
        salary = s;
    }

    double bonus() {
        return salary * 0.2;
    }
}

class Developer extends Employee {
    double salary, incentive;

    Developer(String n, int i, double s, double inc) {
        super(n, i);
        salary = s;
        incentive = inc;
    }

    double bonus() {
        return salary * 0.1 + incentive;
    }
}

class Employeebonus {
    public static void main(String[] args) {
        Employee e;

        e = new Manager("Ram", 1, 10000);
        System.out.println(e.bonus());

        e = new Developer("Shyam", 2, 8000, 500);
        System.out.println(e.bonus());
    }
}