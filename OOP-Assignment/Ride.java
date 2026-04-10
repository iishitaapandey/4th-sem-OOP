abstract class Ride {
    int distance;

    Ride(int d) {
        distance = d;
    }

    abstract int fare();
}

class Bike extends Ride {
    Bike(int d) { super(d); }
    int fare() { return distance * 5; }
}

class Auto extends Ride {
    Auto(int d) { super(d); }
    int fare() { return distance * 8; }
}

class Car extends Ride {
    Car(int d) { super(d); }
    int fare() { return distance * 12; }
}

class Ridetest {
    public static void main(String[] args) {
        Ride r;

        r = new Bike(10);
        System.out.println(r.fare());

        r = new Auto(10);
        System.out.println(r.fare());

        r = new Car(10);
        System.out.println(r.fare());
    }
}