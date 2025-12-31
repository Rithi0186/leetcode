public class BaseballGame {

    public static int calPoints(String[] operations) {
        int[] score = new int[operations.length];
        int i = 0;

        for (String op : operations) {

            if (op.equals("+")) {
                score[i] = score[i - 2] + score[i - 1];
                i++;
            } 
            else if (op.equals("D")) {
                score[i] = 2 * score[i - 1];
                i++;
            } 
            else if (op.equals("C")) {
                i--; // remove last score
            } 
            else {
                score[i] = Integer.parseInt(op);
                i++;
            }
        }

        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += score[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] operations = {"5", "2", "C", "D", "+"};
        int result = calPoints(operations);
        System.out.println("Final Score = " + result);
    }
}
