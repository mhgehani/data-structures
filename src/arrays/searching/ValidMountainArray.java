package arrays.searching;

import java.util.Objects;

/*
Given an array of integers arr, return true if and only if it is a valid mountain array.
*/
public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        boolean peak = false;
        boolean start = false;

        if (Objects.isNull(arr) || arr.length < 3) {
            return false;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            // flat mountain
            if (arr[i + 1] == arr[i]) {
                return false;
            }

            if (!peak) {
                if (arr[i + 1] < arr[i]) {
                    // peak is reached
                    peak = true;
                } else {
                    start = true;
                }
            } else {
                //check downward from peak
                if (arr[i + 1] > arr[i]) {
                    return false;
                }
            }
        }
        return start && peak;
    }
}
