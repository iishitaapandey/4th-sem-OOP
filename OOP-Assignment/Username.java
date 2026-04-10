import java.util.*;

class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = sc.nextLine();

        String cleaned = user.trim().toLowerCase();
        System.out.println("Cleaned Username: " + cleaned);
    }
}