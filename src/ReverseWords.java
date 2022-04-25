import java.util.Arrays;
import java.util.stream.IntStream;

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
        byte[] bytes = new byte[s.length()];
        IntStream.iterate(s.length() - 1, i -> i - 1).limit(s.length())
                .forEach(value -> bytes[s.length() - value - 1] = s.getBytes()[value]);
        return new String(bytes);
    }
}