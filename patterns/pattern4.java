// 1
// 12
// 123
// 1234
// 12345

// 12345
// 1234
// 123
// 12
// 1

package patterns;

public class pattern4 {
    public static void main(String args[]) {
        int n = 5;

        // for(int i = 1; i<=n; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i<=n; i++){
            for(int j =1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
