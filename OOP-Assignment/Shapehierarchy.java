class Shape {
    void display() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println(3.14 * 2 * 2);
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println(4 * 5);
    }
}

class Shapehierarchy {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}