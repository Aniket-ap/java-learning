import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        // Defining an Array
        // type[] arrayName = new type[size]

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        System.out.println("Enter a number to be search in Array");
        int searchNum = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNum) {
                System.out.println("Number is in " + i + " place");
            }
        }

    }
}
