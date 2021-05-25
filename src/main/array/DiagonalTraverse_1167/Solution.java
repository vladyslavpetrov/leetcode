package array.DiagonalTraverse_1167;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
 */

public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        List<Integer> temp = new ArrayList<>();

        int resultIndex = 0;

        for (int i = 0; i < (m + n) - 1; i++) {

            temp.clear();

            int row = i < n ? 0 : (i - n) + 1;
            int col = i < n ? i : n - 1;

            while (row < m && col > -1) {
                temp.add(mat[row++][col--]);
            }

            if (i % 2 == 0) {
                Collections.reverse(temp);
            }

            for (Integer integer : temp) {
                result[resultIndex++] = integer;
            }
        }

        return result;
    }
}
