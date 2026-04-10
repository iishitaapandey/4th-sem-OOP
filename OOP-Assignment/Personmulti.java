class Person {
    void role() {
        System.out.println("Person");
    }
}

class Employee extends Person {
    void role() {
        System.out.println("Employee");
    }
}

class Manager extends Employee {
    void role() {
        System.out.println("Manager");
    }
}

class Personmulti {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.role();
    }
}