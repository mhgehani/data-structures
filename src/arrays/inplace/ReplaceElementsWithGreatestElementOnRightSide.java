package arrays.inplace;


import java.util.Objects;

/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
After doing so, return the array.
*/
public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {

        if (Objects.isNull(arr) || arr.length == 0) {
            return arr;
        }

        // initially max = -1
        int max = -1;

        // revere iteration as we need to replace elements by it's right greatest
        for (int i = arr.length - 1; i >= 0; i--) {
            // compute newMax for next comparison
            int newMax = Math.max(arr[i], max);

            //assign max to current
            arr[i] = max;

            //assign newwMax to max
            max = newMax;
        }


        return arr;
    }
}
