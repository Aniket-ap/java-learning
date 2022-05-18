import java.text.BreakIterator;
import java.util.Scanner;

public class Functions {
    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    // todo Make a function add two number and return sum
    public static int sumNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // todo Calculate Factorial of a number
    public static int calFactorial(int num) {
        if (num < 0) {
            System.out.println("Factorial of the given number cant be determine");
        }

        if (num == 0 || num == 1) {
            return num;
        }

        return num * calFactorial(num - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.next();

        // printName(name);
        // int sum = sumNumbers(23, 3);
        // System.out.print(sum);

        // int fact = calFactorial(-5);
        // System.out.println(fact);
    }
}
