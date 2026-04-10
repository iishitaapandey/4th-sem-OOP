import java.util.*;

class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second name: ");
        String s2 = sc.nextLine();

        if (s1.equals(s2))
            System.out.println("Same (Case-Sensitive)");
        else
            System.out.println("Different (Case-Sensitive)");

        if (s1.equalsIgnoreCase(s2))
            System.out.println("Same (Case-Insensitive)");
        else
            System.out.println("Different (Case-Insensitive)");
    }
}