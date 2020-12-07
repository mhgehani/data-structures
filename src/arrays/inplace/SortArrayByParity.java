package arrays.inplace;

/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
You may return any answer array that satisfies this condition.
*/
public class SortArrayByParity {

    // This is essentially same problem as moveZeroes. Here we just need to move Odds at the end

    public int[] sortArrayByParity(int[] A) {
        int odd = -1;
        for (int i = 0; i < A.length; i++) {

            //if element is odd & oddPtr isn't initialized -> init odd
            if (A[i] % 2 != 0 && odd == -1) {
                odd = i;
            }

            // if element is even and we have an odd element waiting to get swapped, swap it
            if (A[i] % 2 == 0 && odd != -1) {
                // swap even & odd elements, NOTE that we've also incremented oddPtr by 1 after swap
                int temp = A[i];
                A[i] = A[odd];
                A[odd++] = temp;
            }
        }
        return A;
    }
}
