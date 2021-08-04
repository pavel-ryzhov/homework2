public class N1 {
    public static void main(String[] args) {
        double a = 10;
        for (int i = 1; i < 7; i++) {
            a += a * 0.1;
        }
        System.out.println(a);
    }
}
