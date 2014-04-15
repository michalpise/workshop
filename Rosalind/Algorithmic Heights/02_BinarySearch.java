import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        final int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            int k = scanner.nextInt();
            System.out.print(binarySearch(k, a, 0, a.length - 1));
            System.out.print(" ");
        }
        System.out.println();

    }

    static int binarySearch(int k, int[] a, int left, int right) {
        if (left == right) return a[left] == k ? left + 1 : -1;
        int middle = (left + right) / 2;
        return a[middle] >= k ? binarySearch(k, a, left, middle) : binarySearch(k, a, middle + 1, right);
    }
}
