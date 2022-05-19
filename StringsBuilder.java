public class StringsBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // Char At
        System.out.println(sb.charAt(0));

        // set char at index
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // insert
        sb.insert(2, 'n');
        System.out.println(sb);
        
        // DLT THE EXTRA N
        sb.delete(2, 3);

        // Append
        StringBuilder str = new StringBuilder("H");
        str.append("e");
        str.append("l");
        str.append("l");
        str.append("o");
        System.out.println(str);
    }
}
