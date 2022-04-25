import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {

        ReverseWords obj = new ReverseWords();
        String newword = obj.reverseWords("hello Hii");
    }

    public static String reverseWords(final String original) {
        System.out.println("input string is " + original);
        String[] tokens = original.split("\\s");
        System.out.println("tokens are " + Arrays.toString(tokens));
        String tmp = original;
        for (String token : tokens) {
            tmp = tmp.replaceFirst(token, reverse(token));
        }
        System.out.println("final string is " + tmp);
        return tmp;
    }

    public static String reverse(String s) {

    }
}