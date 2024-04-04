public class DuplicateCharecters {
    public static void findDuplicateCharacters(String str) {
        int[] charFreq = new int[26];

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                charFreq[index]++;
            }
        }

        System.out.println("Duplicate characters in the string \"" + str + "\":");
        for (int i = 0; i < charFreq.length; i++) {
            if (charFreq[i] > 1) {
                char duplicateChar = (char) (i + 'a');
                System.out.println(duplicateChar + ": " + charFreq[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String str = "programming";
        findDuplicateCharacters(str);
    }
}
