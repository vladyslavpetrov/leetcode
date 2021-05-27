package array.SpiralMatrix_1168;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new LinkedList<>();
        }

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new LinkedList<>();

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        // 0 - right, 1 - down, 2 - left, 3 - up
        int direction = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            } else {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            direction = (direction + 1) % 4;
        }
        return result;
    }
}
