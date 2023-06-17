package co.rohit.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashingTry2 {
    public static void main(String[] args) {
        int[] nums = {33,6,9,3};
        int target = 12;

        Map<Integer,Integer> valueIndexMap = new HashMap<>();

        System.out.println(Arrays.toString(findNums(nums, target, valueIndexMap)));
    }

    private static int[] findNums(int[] nums, int target, Map<Integer, Integer> valueIndexMap) {
        for (int i = 0; i < nums.length; i++) {
            Integer currVal = nums[i];
            Integer idxFromMap = valueIndexMap.get(target - currVal);

            if (idxFromMap == null) {
                valueIndexMap.put(currVal, i);
            }
            else {
                //return new int[]{idxFromMap, i}; // return indexes or
                return new int[] {nums[idxFromMap], nums[i]}; // return values
            }
        }
        return new int[] {-1, -1};
    }
}
