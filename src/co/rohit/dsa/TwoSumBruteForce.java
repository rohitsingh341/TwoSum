package co.rohit.dsa;

import java.util.Arrays;

public class TwoSumBruteForce {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int targetVal = 13;
        int[] indexes = getIndexes(nums, targetVal);

        System.out.println("Indexes of two elements whose addition is equal to " + targetVal + " is " + Arrays.toString(indexes));
    }

    public static int[] getIndexes(int[] nums, int targetVal) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i +1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetVal) {
                    return new int [] {i, j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
