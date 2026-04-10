abstract class Payment {
    abstract void pay(double amt);
}

class CreditCard extends Payment {
    void pay(double amt) {
        System.out.println("Paid by Card: " + amt);
    }
}

class UPI extends Payment {
    void pay(double amt) {
        System.out.println("Paid by UPI: " + amt);
    }
}

class PaymentTest {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.pay(1000);

        p = new UPI();
        p.pay(500);
    }
}