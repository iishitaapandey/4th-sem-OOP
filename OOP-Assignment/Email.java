import java.util.*;

class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        if (email.endsWith("@gmail.com"))
            System.out.println("Valid Gmail Address");
        else
            System.out.println("Invalid Email");
    }
}