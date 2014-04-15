import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        if (n == 0) System.out.println("0");
        else {
            int a = 0;
            int b = 1;
            for (int k = 1; k < n; k++) {
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
    }
}
