public class NimGame {

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Can win with " + n + " stones? " + canWinNim(n));

        n = 5;
        System.out.println("Can win with " + n + " stones? " + canWinNim(n));
    }
}
