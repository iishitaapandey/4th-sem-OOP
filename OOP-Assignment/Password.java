import java.util.*;

class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (pass.length() > 2) {
            String masked = pass.replaceAll(".(?=.{2})", "*");
            System.out.println("Masked Password: " + masked);
        } else {
            System.out.println("Password too short");
        }
    }
}