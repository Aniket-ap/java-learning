import java.util.Scanner;

public class FunctionsQues {

    // Todo ( Enter 3 numbers from the user & make a function to print their average
    // )
    public static void printAverage(int a, int b, int c) {
        int avg = (a + b + c) / 3;

        System.out.print("Average of above 3 numbers " + avg);
    }

    // Todo ( Write a function to print the sum of all odd numbers from 1 to n )
    public static void sumOfOddNums(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.print(sum);
    }

    // Todo ( Write a function which takes in 2 numbers and returns the greater of
    // those two )
    public static int greatestbwTwo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Todo ( Write a function that takes in the radius as input and returns the
    // circumference of a circle )
    public static double calCircumference(int radius) {
        double x = Math.PI;
        return 2 * x * radius;
    }

    // Todo Write a function that takes in age as input and returns if that person
    // is eligible to vote or not.
    public static void isEligibleVote(int age) {
        if (age >= 18) {
            System.out.println("Person is eligible for Vote");
        } else {
            System.out.println("Person is not eligible for Vote");
        }
    }

    // Todo ( Two numbers are entered by the user, x and n. Write a function to find
    // the value of one number raised to the power of another i.e. xn. )
    public static int exponentCalc(int x, int n) {
        int finalValue = 1;
        for (int i = 1; i <= n; i++) {
            finalValue *= x;
        }
        return finalValue;
    }

    // Todo ( Write a program to enter the numbers till the user wants and at the
    // end it should display the count of positive, negative and zeros entered. )
    public static void countTimes() {
        Scanner sc = new Scanner(System.in);

        int number,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;

        char choice;

        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();

            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }

    /* TOPBAR 1 */


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // printAverage(a, b, c);

        // sumOfOddNums(5);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int greatest = greatestbwTwo(a,b);
        // System.out.print(greatest);

        // int rad = sc.nextInt();
        // double circumference = calCircumference(rad);
        // System.out.println( circumference);

        // isEligibleVote(18);

        // Todo ( Write an infinite loop using do while condition )
        // while(true);

        // int expCal = exponentCalc(2, 3);
        // System.out.println(expCal);

        // countTimes();

    }
}
