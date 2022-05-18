package dsalgo;

import java.util.Scanner;

public class Trailzerofactorial {

    public static int zeorinfact(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + (n / i);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = zeorinfact(num);
        System.out.println(result);
    }
}
