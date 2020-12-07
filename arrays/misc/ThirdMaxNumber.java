package arrays.misc;

import java.util.Arrays;
import java.util.Objects;

/*
Given a non-empty array of integers, return the third maximum number in this array.
If it does not exist, return the maximum number.
The time complexity must be in O(n).
*/
public class ThirdMaxNumber {

    public int thirdMax(int[] nums) {

        if (Objects.isNull(nums) || nums.length == 0) {
            return 0;
        }

        //sort the array
        Arrays.sort(nums);

        int max = Integer.MAX_VALUE;
        int count = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < max) {
                max = nums[i];
                count++;
            }

            // if 3rd Max is reached, return the max
            if (count == 3) {
                return max;
            }
        }
        return nums[nums.length - 1];
    }
}
