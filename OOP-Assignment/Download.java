class Download implements Runnable {
    String name;

    Download(String n) {
        name = n;
    }

    public void run() {
        System.out.println("Downloading: " + name);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Download("File1"));
        Thread t2 = new Thread(new Download("File2"));

        t1.start();
        t2.start();
    }
}