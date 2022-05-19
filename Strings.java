import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is : " + name);

        // Concatination
        String firstName = "Aniket";
        String lastName = "Pradhan";
        String fulllname = firstName + " " + lastName;
        // Length
        System.out.println(fulllname);
        System.out.println(fulllname.length());

        // charAt
        for (int i = 0; i < fulllname.length(); i++) {
            System.out.println(fulllname.charAt(i));
        }

        // Compare
        if (firstName.compareTo(lastName) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("NOT Equal");
        }

        // Sub String
        String sentence = "My Name is Tony";
        // substring(beg index, end index)
        System.out.println(sentence.substring(11));
        System.out.println(sentence.substring(11, 13));

    }
}
