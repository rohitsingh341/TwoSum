package co.rohit.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTry1 {
    public static void main(String[] args) {
        int[] nums = {2,7,1,5,6};
        int targetVal = 13;

        int[] twoNum = findTwoNum(nums, targetVal);
        System.out.println(Arrays.toString(twoNum));
    }

    private static int[] findTwoNum(int[] nums, int targetVal) {
        Map<Integer, Integer>  valueIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currVal = nums[i];
            Integer idx = valueIndexMap.get(targetVal - currVal);
            if (idx == null) {
                valueIndexMap.put(currVal, i);
            }
            else {
                return new int[] {nums[idx], nums[i]};
            }
        }

        return new int[] {-1, -1};
    }
}
