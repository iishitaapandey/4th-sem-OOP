abstract class Shape {
    abstract void area();

    void display() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println(3.14 * 2 * 2);
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area();
    }
}