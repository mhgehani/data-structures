package arrays.insertions;

import java.util.ArrayList;
import java.util.List;

/*
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.
Do the above modifications to the input array in place, do not return anything from your function.
*/
public class DuplicateZeroes {
    public void duplicateZeros(int[] arr) {
        int lastIndex = arr.length - 1;
        for (int i = lastIndex; i >= 0; i--) {
            // We'll move from right to left so that we don't overwrite elements
            if (arr[i] == 0) {
                // If '0' is encountered shift all elements right by 1 index while traversing from right to left
                for (int j = lastIndex; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                //if next index is not the last index, assign it's value with the previous index i.e. '0'
                if (i + 1 < lastIndex) {
                    arr[i + 1] = arr[i];
                }
            }
        }
    }

    // cleaner and faster solution
    public void duplicateZerosSoln2(int[] arr) {
        List<Integer> arrlist = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arrlist.add(arr[i]);
            if (arr[i] == 0) arrlist.add(0);
            if (arrlist.size() == arr.length) break;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrlist.get(i);
        }

    }
}
