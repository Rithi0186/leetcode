public class SolutionLengthLastWord {
    public int lengthOfLastWord(String s) {
        // Remove leading and trailing spaces
        String trimmed = s.trim();

        // Split the string by spaces
        String[] words = trimmed.split(" ");

        // If the string is empty after trimming, return 0
        if (words.length == 0) return 0;

        // Return the length of the last word
        return words[words.length - 1].length();
    }

    // Optional: main method to test
    public static void main(String[] args) {
        SolutionLengthLastWord solution = new SolutionLengthLastWord();
        String test = "Hello World  ";
        System.out.println(solution.lengthOfLastWord(test)); // Output: 5
    }
}
