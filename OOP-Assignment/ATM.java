import java.util.*;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal: ");
        int amount = sc.nextInt();

        try {
            if (amount > balance)
                throw new Exception("Insufficient Balance");

            balance -= amount;
            System.out.println("Withdrawal successful. Remaining: " + balance);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}