package co.rohit.dsa;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;


public class TwoSumHashing {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15,15};
        int targetVal = 30;

        int[] indexes = getIndexes(nums, targetVal);
        System.out.println("Indexes of two elements whose addition is equal to " + targetVal + " is " + Arrays.toString(indexes));
    }

    public static int[] getIndexes(int[] nums, int targetVal) {

        Map<Integer, Integer> valueIndexMap = new HashMap<>();

        for (int i =0; i<nums.length; i++) {
            int currNum = nums[i];
            Integer index = valueIndexMap.get(targetVal - currNum);
            if (index != null) {
                return new int[] {index, i};
            }
            else {
                valueIndexMap.put(currNum, i);
            }
        }
        return new int[] {-1,-1};
    }

}
