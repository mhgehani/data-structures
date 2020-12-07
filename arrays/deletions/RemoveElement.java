package arrays.deletions;

/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int len = 0;
        int tail = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                len++;
            } else {

                // if tail hasn't crossed head & tail == head, keep shifting tail to left
                while (tail > i && nums[tail] == nums[i]) {
                    tail--;
                }

                // swap this element with last
                int temp = nums[tail];
                nums[tail--] = nums[i];
                nums[i] = temp;
                len++;

            }
        }
        return len;
    }
}