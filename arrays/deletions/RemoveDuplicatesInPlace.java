package arrays.deletions;

import java.util.Objects;

/*
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
*/
public class RemoveDuplicatesInPlace {

    public int removeDuplicates(int[] nums) {

        int len = 1;
        int trav1 = 0;
        int trav2 = 0;

        if (Objects.isNull(nums) || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return len;
        }

        while (trav2 < nums.length) {
            if (nums[trav1] == nums[trav2]) {
                trav2++;
            } else {
                // if elements are unequal
                nums[++trav1] = nums[trav2++];
                len++;
            }
        }
        return len;
    }
}
