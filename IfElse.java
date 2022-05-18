import java.util.*;

public class IfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // todo: Check Adult or not
        // int age = sc.nextInt();

        // if(age >= 18){
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Not Adult");
        // }

        // todo: Check even or odd
        // int num = sc.nextInt();
        
        // if(num % 2 == 0){
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }

        // todo: Greater b/w two numbers

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Both Numbers are Same");
        } else if(a > b){
            System.out.println("A is Greater then B");
        } else {
            System.out.println("B is Greater then A");
        }
        
    }
}
