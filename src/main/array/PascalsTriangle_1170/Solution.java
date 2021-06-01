package array.PascalsTriangle_1170;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows < 1) {
            return result;
        }
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            result.add(new ArrayList<>(row));
        }

        return result;
    }
}

/*
        List<List<Integer>> result = new ArrayList<>();

        if (numRows < 1) {
            return result;
        }

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        result.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = result.get(i - 1);
            List<Integer> curr_row = new ArrayList<>();

            curr_row.add(1);

            for (int j = 1; j < i; j++) {
                curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            curr_row.add(1);
            result.add(curr_row);
        }

        return result;
 */
