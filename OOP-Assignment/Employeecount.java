class Employeecount {
    static int count = 0;

    Employeecount() {
        count++;
    }

    static void show() {
        System.out.println("Total: " + count);
    }

    public static void main(String[] args) {
        new Employeecount();
        new Employeecount();
        new Employeecount();

        show();
    }
}