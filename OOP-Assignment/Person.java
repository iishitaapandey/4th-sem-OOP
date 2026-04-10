class Person {
    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects
        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person("Amit", 22);

        // Displaying details
        p1.display();
        p2.display();
    }
}