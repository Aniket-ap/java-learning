import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        
        // todo For Loop

        // for(int counter=0; counter <= 10; counter++){
        // System.out.print(counter+ " ");
        // }

        // todo Sum of N natural numbers
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }

        System.out.println(sum);

        // todo While loop

        // int i = 0;
        // while (i < 11) {
        //     System.out.println(i);
        //     i++;
        // }

        // todo Do While loop

        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // } while (i < 11);

    }
}
