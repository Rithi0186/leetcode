import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // negative numbers are not palindrome
        }

        int rev = 0, digit;
        int temp = x;

        while (x != 0) {
            digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        return rev == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        int num = sc.nextInt();

        // Function call
        boolean result = isPalindrome(num);

        // Output
        System.out.println(result);
    }
}
