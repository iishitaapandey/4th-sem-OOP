interface Bank {
    int rate();
}

class SBI implements Bank {
    public int rate() { return 5; }
}

class HDFC implements Bank {
    public int rate() { return 6; }
}

class BankTest {
    public static void main(String[] args) {
        System.out.println(new SBI().rate());
        System.out.println(new HDFC().rate());
    }
}