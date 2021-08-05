import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int result = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            result += Math.abs(a);
        }

        if ((a > 0) == (b > 0) || a == 0 || b == 0){
            System.out.println(result);
        }else {
            System.out.println("-" + result);
        }

    }
}
