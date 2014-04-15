import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (a[i] > a[j]) count++;
        System.out.println(count);
    }
}
