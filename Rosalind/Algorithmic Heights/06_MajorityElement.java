import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Main {
    static List<Integer> readArray(int size, Scanner scanner) {
        final List<Integer> array = new ArrayList<>(size);
        for (int i = 0; i < size; i++) array.add(scanner.nextInt());
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int k = scanner.nextInt();
        final int n = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            List<Integer> array = readArray(n, scanner);
            System.out.print(majorityElement(array));
            System.out.print(" ");
        }
        System.out.println();
    }

    static int majorityElement(List<Integer> array) {
        int candidate = 0;
        int count = 0;
        for (Integer element : array) {
            if (count == 0) candidate = element;
            if (candidate == element) count++;
            else count--;
        }
        count = 0;
        for (Integer element : array)
            if (element == candidate) count++;
        return count > array.size() / 2 ? candidate : -1;
    }
}
