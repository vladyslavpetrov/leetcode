package string.StringPermutation;

public class Solution {
    public boolean checkPermutation(String first, String second) {
        if (isFailFast(first, second)) {
            return false;
        }

        int[] letters = new int[128];

        for (char c : first.toCharArray()) {
            letters[c]++;
        }

        for (char c : second.toCharArray()) {
            letters[c]--;

            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }

    private boolean isFailFast(String first, String second) {
        return second == null || first == null || first.length() != second.length() || first.length() == 0;
    }
}
