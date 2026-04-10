class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(5, " Java");

        System.out.println("Modified: " + sb);
        System.out.println("Reversed: " + sb.reverse());
    }
}