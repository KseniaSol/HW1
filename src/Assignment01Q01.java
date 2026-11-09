public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String str: args) {
            char ch = str.charAt(0);
            int ascii = ch;
            if (ascii % 5 == 0) {
                System.out.println(ch);
            }

        }
    }
}
