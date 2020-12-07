package arrays.misc;

import java.util.Arrays;

/*
Students are asked to stand in non-decreasing order of heights for an annual photo.
Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.
Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.
*/
public class HeightChecker {

    public int heightChecker(int[] heights) {
        int moves = 0;

        // create a copy of array, let's call it targetArray
        int[] targetArray = new int[heights.length];
        System.arraycopy(heights, 0, targetArray, 0, heights.length);

        //sort the original array
        Arrays.sort(targetArray);

        // compare the copy & original
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != targetArray[i])
                moves++;
        }

        return moves;
    }
}
