import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static int countWords(String sentence) {

        String[] words = sentence.split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {

            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        int totalCount = 0;
        for (int count : wordCountMap.values()) {
            totalCount += count;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        int wordCount = countWords(sentence);
        System.out.println("Total number of words: " + wordCount);
    }
}
