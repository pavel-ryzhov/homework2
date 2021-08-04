public class N1 {
    public static void main(String[] args) {
        double a = 10;
        double b = 0;
        for (int i = 0; i < 7; i++) {
            b += a;
            a += a * 0.1;
        }
        System.out.println(b);
    }
}
