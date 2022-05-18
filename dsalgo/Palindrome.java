package dsalgo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int remainder, temp;

        temp = num;
        while (num > 0) {
            remainder = num % 10;
            sum = (sum * 10) + remainder;
            num = num / 10;
        }

        if (temp == sum) {
            System.out.println("Its a palindrome number");
        } else {
            System.out.println("Its not a Palindrome number");
        }
    }
}
