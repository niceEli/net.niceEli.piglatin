package net.niceEli.piglatin;

public class PigLatin {

    public static void translate(String[] args) {
        StringBuilder translatedSentence = new StringBuilder();

        for (String word : args) {
            String pigLatin = translateToPigLatin(word.toLowerCase());
            translatedSentence.append(pigLatin).append(" ");
        }

        System.out.println(translatedSentence.toString().trim());
    }

    public static String translateToPigLatin(String englishWord) {
        // Check if the word ends with a vowel
        if (isVowel(englishWord.charAt(0))) {
            return englishWord + "-y";
        } else {
            // Find the index of the first vowel in the word
            int firstVowelIndex = findFirstVowelIndex(englishWord);
            if (firstVowelIndex == -1) {
                // If there are no vowels, return the word as is
                return englishWord;
            } else {
                // Split the word into two parts and rearrange them
                String prefix = englishWord.substring(0, firstVowelIndex);
                String suffix = englishWord.substring(firstVowelIndex);
                return suffix + "-" + prefix + "y";
            }
        }
    }

    private static boolean isVowel(char c) {
        return "aeiou".contains(String.valueOf(c));
    }

    private static int findFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                return i;
            }
        }
        return -1; // No vowels found
    }
}