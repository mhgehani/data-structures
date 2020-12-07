package arrays.accessing;

// Given an array nums of integers, return how many of them contain an even number of digits.
public class FindNumbersWithEvenNumberOfDigits {

    private int eventDigitCount = 0;

    public int findNumbers(int[] nums) {
        for (int num : nums) {
            
            int digits = getDigits(num);
            if(digits%2==0){
            // even digit
                eventDigitCount++;
            }
        }
        return eventDigitCount;
    }

    private int getDigits(int num) {
        int digits = 0;
        while(num>0){
            num=num/10;
            digits++;
        }
        return digits;
    }
}