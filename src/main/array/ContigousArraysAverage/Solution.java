package array.ContigousArraysAverage;

public class Solution {
    public double[] findAverage(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new double[0];
        }

        double[] result = new double[arr.length - k + 1];
        int windowStart = 0;
        double windowSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            if (windowEnd >= k - 1) {
                result[windowStart] = windowSum / k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return result;
    }
}
