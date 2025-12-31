public class FinalValueAfterOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};

        int result = finalValueAfterOperations(operations);
        System.out.println("Final value of X: " + result);
    }
}
