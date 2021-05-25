package string.StringCompression;

/**
 * Compress the string using the counts of repeated characters.
 * string aabcccccaa -> a2b1c5a3
 * if compressed string not smaller than original, return original
 * string has only lowercase letters
 */
public class Solution {
    public String compress(String initial) {
        int index = 0, count = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < initial.length(); i++) {
            count++;
            if (initial.charAt(i) != initial.charAt(index)) {
                sb.append(initial.charAt(index)).append(count);
                count = 0;
                index = i;
            }
        }

        sb.append(initial.charAt(index)).append(++count);

        String compressed = sb.toString();

        return compressed.length() > initial.length() ? initial : compressed;
    }
}
