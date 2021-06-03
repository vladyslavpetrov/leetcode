package string.AddBinary_1160;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() -1 , j = b.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += Character.getNumericValue(a.charAt(i--));
            }

            if (j >= 0) {
                sum += Character.getNumericValue(b.charAt(j--));
            }

            sb.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            sb.insert(0, carry);
        }

        return sb.toString();
    }
}
