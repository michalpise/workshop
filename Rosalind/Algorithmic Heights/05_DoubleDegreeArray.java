import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int vertexCount = scanner.nextInt();
        final int edgeCount = scanner.nextInt();
        int[] firstColumn = new int[edgeCount];
        int[] secondColumn = new int[edgeCount];
        for (int i = 0; i < edgeCount; i++) {
            firstColumn[i] = scanner.nextInt();
            secondColumn[i] = scanner.nextInt();
        }

        int[] degreeArray = new int[vertexCount];
        for (Integer vertex : firstColumn) degreeArray[vertex - 1]++;
        for (Integer vertex : secondColumn) degreeArray[vertex - 1]++;

        int[] sumArray = new int[vertexCount];
        for (int i = 0; i < edgeCount; i++) {
            sumArray[firstColumn[i] - 1] += degreeArray[secondColumn[i] - 1];
            sumArray[secondColumn[i] - 1] += degreeArray[firstColumn[i] - 1];
        }
       
        for (Integer sum : sumArray) {
            System.out.print(sum);
            System.out.print(" ");
        }
        System.out.println();
    }
}
