import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        String s = sc.next();
        String t = sc.next();

        // Function call
        boolean result = isAnagram(s, t);

        // Output
        System.out.println(result);
    }
}
