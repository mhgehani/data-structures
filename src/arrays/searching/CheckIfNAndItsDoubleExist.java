package arrays.searching;

import java.util.HashSet;
/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
  */
public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : arr) {
            if (numbers.contains(num * 2) || (num % 2 == 0 && numbers.contains(num / 2))) {
                return true;
            }
            numbers.add(num);
        }
        numbers.clear();
        return false;
    }
}
