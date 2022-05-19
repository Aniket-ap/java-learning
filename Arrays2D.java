import java.util.Scanner;

public class Arrays2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numMatrix = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // cols
            for (int j = 0; j < cols; j++) {
                numMatrix[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Output");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // For searching and element
        System.out.println("Enter the number you want search...");
        int searchNum = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numMatrix[i][j] == searchNum) {
                    System.out.println("Number Found!!!");
                    System.out.println("Position of the number is ( " + i + " " + j + " )");
                }
            }
        }
    }
}
