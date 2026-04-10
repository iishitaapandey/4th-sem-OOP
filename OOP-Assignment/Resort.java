class Resort {
    int RNo, days;
    String name;
    float charges;

    float compute() {
        float amt = days * charges;
        if (amt > 11000)
            amt = amt * 1.02f;
        return amt;
    }

    void getinfo(int r, String n, float c, int d) {
        RNo = r;
        name = n;
        charges = c;
        days = d;
    }

    void dispinfo() {
        System.out.println(RNo + " " + name + " " + compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.getinfo(1, "Shlok", 2000, 6);
        r.dispinfo();
    }
}