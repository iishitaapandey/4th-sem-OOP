class Bank {
    void process() throws Exception {
        throw new Exception("Transaction Error");
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        try {
            b.process();
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}