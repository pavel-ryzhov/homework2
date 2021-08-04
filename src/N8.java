public class N8 {
    public static void main(String[] args) {
        char[][] a = new char[4][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i >= j ? '*' : ' ';
            }
        }
        for (char[] chars : a) {
            for (int j = chars.length - 1; j >= 0; j--) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a[i].length - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
