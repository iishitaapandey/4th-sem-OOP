interface Filterable {
    void apply();
    void reset();
}

class ImageProcessor implements Filterable {
    public void apply() {
        System.out.println("Image Filter");
    }
    public void reset() {
        System.out.println("Reset Image");
    }
}

class FilterableTest {
    public static void main(String[] args) {
        ImageProcessor i = new ImageProcessor();
        i.apply();
        i.reset();
    }
}