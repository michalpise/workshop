import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int maxVertex = scanner.nextInt();
        scanner.nextInt();
        List<Integer> firstColumn = new ArrayList<>();
        List<Integer> secondColumn = new ArrayList<>();
        while (scanner.hasNextInt()) {
          int vertex = scanner.nextInt();
          firstColumn.add(vertex);
          vertex = scanner.nextInt();
          secondColumn.add(vertex);
        }
        int[] degreeArray = new int[maxVertex];
        for (Integer vertex : firstColumn) degreeArray[vertex - 1]++;
        for (Integer vertex : secondColumn) degreeArray[vertex - 1]++;
        for (int vertex = 0; vertex < degreeArray.length; vertex++) {
            System.out.print(degreeArray[vertex]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
