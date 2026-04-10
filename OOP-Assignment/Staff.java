class Staff {
    void work() {
        System.out.println("Staff Work");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Treat Patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Assist Doctor");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Manage Desk");
    }
}

class Stafftest {
    public static void main(String[] args) {
        Staff s;

        s = new Doctor();
        s.work();

        s = new Nurse();
        s.work();

        s = new Receptionist();
        s.work();
    }
}