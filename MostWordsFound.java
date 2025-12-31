public class MostWordsFound {

    public static int mostWordsFound(String[] sentences) {
        int maxi = 0;

        for (int i = 0; i < sentences.length; i++) {
            int words = sentences[i].split(" ").length;
            maxi = Math.max(maxi, words);
        }

        return maxi;
    }

    public static void main(String[] args) {
        String[] sentences = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        };

        int result = mostWordsFound(sentences);
        System.out.println("Maximum number of words: " + result);
    }
}
