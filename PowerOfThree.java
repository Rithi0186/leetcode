public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        int n = 27;   // change this value to test

        if (isPowerOfThree(n)) {
            System.out.println(n + " is a power of three");
        } else {
            System.out.println(n + " is NOT a power of three");
        }
    }
}
