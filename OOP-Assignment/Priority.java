class Priority extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Priority t1 = new Priority();
        Priority t2 = new Priority();

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}