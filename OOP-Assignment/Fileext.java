import java.util.*;

class Fileext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String file = sc.nextLine();

        int index = file.lastIndexOf('.');
        if (index != -1)
            System.out.println("Extension: " + file.substring(index + 1));
        else
            System.out.println("No extension found");
    }
}