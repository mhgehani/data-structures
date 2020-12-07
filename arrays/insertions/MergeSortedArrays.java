package arrays.insertions;

// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mLastIndex = m - 1;
        int nLastIndex = n - 1;
        int outputLastIndex = m + n - 1;

        while (mLastIndex >= 0 && nLastIndex >= 0) {
            if (nums1[mLastIndex] > nums2[nLastIndex]) {
                nums1[outputLastIndex--] = nums1[mLastIndex--];
            } else {
                nums1[outputLastIndex--] = nums2[nLastIndex--];
            }
        }

        // in case if nums1 is empty and nums2 still has elements that needs to copied
        while(nLastIndex >= 0){
            nums1[outputLastIndex--] = nums2[nLastIndex--];
        }
    }
}

