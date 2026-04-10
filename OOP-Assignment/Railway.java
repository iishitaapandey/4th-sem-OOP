class Railway {
    int seats = 1;

    synchronized void book() {
        if (seats > 0) {
            System.out.println("Ticket booked successfully");
            seats--;
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {
        Railway r = new Railway();

        new Thread(() -> r.book()).start();
        new Thread(() -> r.book()).start();
    }
}