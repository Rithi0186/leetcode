import java.util.Scanner;

public class perfectnumber {

    public static boolean checkPerfectNumber(int num) {
        int sum = 0;

        // Find sum of all divisors except the number itself
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if sum equals the number
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        int num = sc.nextInt();

        // Function call
        boolean result = checkPerfectNumber(num);

        // Output
        System.out.println(result);
    }
}
