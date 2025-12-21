import java.util.Scanner;

public class adddigit {

    public static int addDigits(int num) {
        int digit = 0;
        int count = 0;
        int temp = num;
        int sum = 0;

        // Count number of digits
        while (num != 0) {
            num /= 10;
            count++;
        }

        num = temp;

        // If single digit
        if (count == 1) {
            return num;
        }
        // If number is 0
        else if (count == 0) {
            return 0;
        }
        // More than one digit
        else {
            for (int i = 0; i < count; i++) {
                sum = 0;
                while (num != 0) {
                    digit = num % 10;
                    sum += digit;
                    num /= 10;
                }
                num = sum;
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        int num = sc.nextInt();

        // Function call
        int result = addDigits(num);

        // Output
        System.out.println(result);
    }
}
