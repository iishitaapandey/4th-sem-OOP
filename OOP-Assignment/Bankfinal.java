class Bankfinal {
    final double rate = 5;

    double calc(double amt) {
        return amt * rate / 100;
    }

    public static void main(String[] args) {
        Bankfinal b = new Bankfinal();
        System.out.println(b.calc(1000));
    }
}