package recursion.problem_five;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Max: " + getMaxValue(new int[]{ 5, -3, 6, 1, 9, 4 }));
    }
    /**
     * Recursion to return the Max value from a given array
     * problem 5
     * @param arr
     * @return int
     */
    public static int getMaxValue(int[] arr){
        if(arr == null) return -1;
        int maxValue = arr[0];
        int remainingMaxValue = arr[0];
        if(arr.length < 1) return maxValue;
        else {
            if(arr.length == 1) maxValue = arr[0]; //base case
            else remainingMaxValue = getMaxValue(Arrays.copyOfRange(arr, 1, arr.length));
            if (remainingMaxValue > maxValue) maxValue = remainingMaxValue;
        }
        return maxValue;
    }
}
