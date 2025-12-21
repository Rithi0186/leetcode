import java.util.Scanner;

public class reversestring {

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        char temp;

        while (end > start) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        String input = sc.nextLine();

        // Convert string to char array
        char[] s = input.toCharArray();

        // Reverse the char array
        reverseString(s);

        // Print result
        System.out.println(new String(s));
    }
}
