// Floyd triangle
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// 1
// 01
// 101
// 1010
// 10101

package patterns;

public class pattern5 {
    public static void main(String args[]) {
        int n = 5;
        int num = 1;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
