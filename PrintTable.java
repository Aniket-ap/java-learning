import java.util.Scanner;

public class PrintTable {
    public static void main(String args[]) {
        System.out.println("Please Enter the number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
