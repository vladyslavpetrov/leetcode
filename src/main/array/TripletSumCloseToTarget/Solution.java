package array.TripletSumCloseToTarget;

import java.util.Arrays;

/**
 * Given an array of unsorted numbers and a target number,
 * find a triplet in the array whose sum is as close to the target number as possible,
 * return the sum of the triplet.
 * If there are more than one such triplet, return the sum of the triplet with the smallest sum.
 */
public class Solution {
    public int searchTriplet(int[] arr, int targetSum) {
        if (arr == null || arr.length < 3) {
            return -1;
        }

        Arrays.sort(arr);

        int smallestDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1, right = arr.length - 1;

            while (left < right) {
                int tempDiff = targetSum - arr[i] - arr[left] - arr[right];

                if (tempDiff == 0) {
                    return targetSum - tempDiff;
                }

                smallestDiff = Math.abs(tempDiff) < Math.abs(smallestDiff) ? tempDiff : smallestDiff;

                if (tempDiff < 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return targetSum - smallestDiff;
    }
}
