class Restaurant {
    static boolean ready = false;

    public static void main(String[] args) {
        Object lock = new Object();

        Thread chef = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Chef prepared food");
                ready = true;
                lock.notify();
            }
        });

        Thread waiter = new Thread(() -> {
            synchronized (lock) {
                while (!ready) {
                    try { lock.wait(); } catch (Exception e) {}
                }
                System.out.println("Waiter served food");
            }
        });

        waiter.start();
        chef.start();
    }
}