package arrays.misc;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
Find all the elements of [1, n] inclusive that do not appear in this array.
Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
*/
public class FindAllNumbersDisappearedInAnArray {

    // Time -> O(n+n) = O(2n) = O(n) , Space -> O(1)
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> numbers = new ArrayList<Integer>();

        // O(n)
        for (int i = 0; i < nums.length; i++) {

            // find the index where the element should be.
            // Math.abs() -> for the number that is already marked
            int index = Math.abs(nums[i]) - 1;

            // marking that index as -ve
            if (nums[index] >= 0) {
                // negate the index (just for marking)
                nums[index] = -nums[index];
            }
        }

        // O(n)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                //if there's a number which is not marked, the missing number is i+1
                numbers.add(i + 1);
            }
        }
        return numbers;
    }
}
