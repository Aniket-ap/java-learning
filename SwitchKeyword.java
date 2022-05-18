import java.util.Scanner;

public class SwitchKeyword {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose one numbers b/w 1 , 2 or 3");

        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bounjor");
                break;

            default:
                System.out.println("Invalid Button");
        }
    }
}
