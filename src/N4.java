import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int result = 0;
        if (b >= 0) {
            for (int i = 0; i < b; i++) {
                result += a;
            }
            System.out.println(result);
        }else{
            for (int i = 0; i < -1 * b; i++) {
                result += a;
            }
            System.out.println(-1 * result);
        }

    }
}