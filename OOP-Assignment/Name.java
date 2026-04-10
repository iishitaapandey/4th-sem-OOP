import java.util.*;

class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = sc.next();

        System.out.print("Enter last name: ");
        String last = sc.next();

        String full = first + " " + last;
        System.out.println("Full Name: " + full);
    }
}