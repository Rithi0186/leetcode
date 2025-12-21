import java.util.Scanner;

public class plusOne{

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;     // add 1
                return digits;   // no carry needed
            }
            digits[i] = 0;       // carry forward
        }

        // If all digits are 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size
        int n = sc.nextInt();
        int[] digits = new int[n];

        // Read digits
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        // Call function
        int[] ans = plusOne(digits);

        // Print result
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
