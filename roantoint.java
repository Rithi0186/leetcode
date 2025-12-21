import java.util.Scanner;

public class roantoint {
   



    public static int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }

    public static int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < n; i++) {
            int curr = value(arr[i]);

            if (i + 1 < n && curr < value(arr[i + 1])) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Numeral: ");
        String s = sc.next();
        System.out.println("Integer value: " + romanToInt(s));
        sc.close();
    }
}


