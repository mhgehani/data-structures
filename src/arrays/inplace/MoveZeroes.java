package arrays.inplace;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        /*int i = 0;
        int zero = -1;

        while (i < nums.length) {
            if (nums[i] == 0 && zero == -1) {
                zero = i;
            } else {
                if (zero != -1) {
                    // swap zero & non-zero elements
                    int temp = nums[i];
                    nums[i] = nums[zero];
                    nums[zero] = temp;
                    zero = i;
                }
            }
            i++;
        }*/

        int zeroPtr = -1;
        for (int i = 0; i < nums.length; i++) {
            //init zeroPtr
            if (nums[i] == 0 && zeroPtr == -1) {
                zeroPtr = i;
            }
            if (nums[i] != 0 && zeroPtr != -1) {
                // swap zero & non-zero elements
                int temp = nums[i];
                nums[i] = nums[zeroPtr];
                nums[zeroPtr++] = temp;
            }
        }

        /*
        using additional space

        int[] nums2 = new int[nums.length];
        int j = nums2.length - 1;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums2[k++] = nums[i];
            } else {
                nums2[j--] = nums[i];
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            nums[i] = nums2[i];
        }*/
    }
}
