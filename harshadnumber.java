import java.util.Scanner;

public class harshadnumber {

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int digit, sum = 0;
        int temp = x;

        // Calculate sum of digits
        for (; x != 0; x = x / 10) {
            digit = x % 10;
            sum += digit;
        }

        // Check Harshad number
        if (temp % sum == 0) {
            return sum;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        int x = sc.nextInt();

        // Function call
        int result = sumOfTheDigitsOfHarshadNumber(x);

        // Output
        System.out.println(result);
    }
}
