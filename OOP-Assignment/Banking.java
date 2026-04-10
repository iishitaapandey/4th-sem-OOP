class Banking {
    int balance = 1000;

    void withdraw(int amt) {
        synchronized (this) {
            balance -= amt;
            System.out.println("Remaining: " + balance);
        }
    }

    public static void main(String[] args) {
        Banking b = new Banking();

        new Thread(() -> b.withdraw(200)).start();
        new Thread(() -> b.withdraw(300)).start();
    }
}