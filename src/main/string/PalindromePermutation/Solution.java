package string.PalindromePermutation;

public class Solution {
    public boolean isPalindromePermutation(String str) {
        if (str.length() == 0) {
            return false;
        }

        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a' ) + 1];

        for (char c : str.toCharArray()) {
            int numChar = getNumValue(c);
            if (numChar < 0) {
                return false;
            }
            table[numChar]++;
        }

        boolean foundOdd = false;

        for (char c : str.toCharArray()) {
            int numChar = getNumValue(c);

            if (table[numChar] % 2 == 1) {
                if (foundOdd) {
                    return false;
                }

                foundOdd = true;
            }
        }

        return true;
    }

    private int getNumValue(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (val < a && val > z) {
            return -1;
        }

        return val - a;
    }
}
