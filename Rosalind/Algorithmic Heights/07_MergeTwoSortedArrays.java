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
        final int n = scanner.nextInt();
        final List<Integer> firstArray = readArray(n, scanner);
        final int m = scanner.nextInt();
        final List<Integer> secondArray = readArray(m, scanner);
        while (! firstArray.isEmpty() || ! secondArray.isEmpty()) {
            System.out.print(next(firstArray, secondArray));
            System.out.print(" ");
        }
        System.out.println();
    }

    static int next(List<Integer> firstArray, List<Integer> secondArray) {
        if (! firstArray.isEmpty()) {
            int element1 = firstArray.remove(0);
            if (! secondArray.isEmpty()) {
                int element2 = secondArray.remove(0);
                if (element1 < element2) {
                    secondArray.add(0, element2);
                    return element1;
                }
                else {
                    firstArray.add(0, element1);
                    return element2;
                }
            }
            else return element1;
        }
        else return secondArray.remove(0);
    }
}
