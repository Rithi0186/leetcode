
import java.util.Scanner;

public class reverseInt{

    public static int reverse(int x) {
        int digit = 0;
        int temp = x;
        int rev = 0;

        while (temp != 0) {
            digit = temp % 10;

            // overflow check
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
            temp /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int result = reverse(x);
        System.out.println("Reversed number: " + result);
    }
}
