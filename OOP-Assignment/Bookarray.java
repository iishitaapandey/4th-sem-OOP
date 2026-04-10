class Bookarray {
    String title, author;
    double price;

    Bookarray(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    public static void main(String[] args) {
        Bookarray[] b = {
            new Bookarray("Java", "A", 200),
            new Bookarray("Python", "B", 300)
        };

        for (Bookarray x : b) {
            System.out.println(x.title + " " + x.author + " " + x.price);
        }
    }
}