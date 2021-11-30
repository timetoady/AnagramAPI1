import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String firstWord, String secondWord) {
        char[] wordArray1 = firstWord.toLowerCase().toCharArray();
        char[] wordArray2 = secondWord.toLowerCase().toCharArray();
        Arrays.sort(wordArray1);
        Arrays.sort(wordArray2);
        String sorted1 = new String(wordArray1);
        String sorted2 = new String(wordArray2);
        if (sorted1.equals(sorted2)) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "This function compares two words to see if they are anagrams of each other, returning true if so and false if not.";
    }
}
