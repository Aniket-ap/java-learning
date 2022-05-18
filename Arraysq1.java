import java.util.Scanner;

public class Arraysq1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // todo: Take an array of names as input from the user and print them on the
        int size = sc.nextInt();
        // String[] names = new String[size];

        // for (int i = 0; i < names.length; i++) {
        // names[i] = sc.next();
        // }

        // for (int i = 0; i < names.length; i++) {
        // System.out.println("name " + (i + 1) + " is : " + names[i]);
        // }

        // todo: Find the maximum & minimum number in an array of integers.

        // int[] num = new int[size];

        // for (int i = 0; i < num.length; i++) {
        // num[i] = sc.nextInt();
        // }

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // // 2,1,4,3
        // for (int i = 0; i < num.length; i++) {
        // if (num[i] < min) {
        // min = num[i];
        // }
        // if (num[i] > max) {
        // max = num[i];
        // }

        // }

        // System.out.println("Largest number is : " + max);
        // System.out.println("Smallest number is : " + min);

        // todo: Take an array of numbers as input and check if it is an array sorted in
        // ascending order.
        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        // {3, 4, 6, 2} is not sorted in ascending order.

        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        boolean isAscending = true;

        // 1,2,3
        // 3,2,1
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
}
