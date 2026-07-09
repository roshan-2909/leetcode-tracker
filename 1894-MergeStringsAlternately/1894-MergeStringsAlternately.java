// Last updated: 7/9/2026, 10:06:25 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;

        // merge alternately
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }

        // append remaining characters of word1
        while (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }

        // append remaining characters of word2
        while (j < word2.length()) {
            result.append(word2.charAt(j));
            j++;
        }

        return result.toString();
    }
}