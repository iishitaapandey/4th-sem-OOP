import java.util.*;

class Library {
    String title, author, isbn;

    Library(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    public static void main(String[] args) {
        ArrayList<Library> list = new ArrayList<>();

        list.add(new Library("Java", "ABC", "101"));
        list.add(new Library("Python", "XYZ", "102"));

        for (Library b : list) {
            System.out.println(b.title + " " + b.author + " " + b.isbn);
        }
    }
}