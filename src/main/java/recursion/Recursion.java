package recursion;

import java.util.Arrays;

public class Recursion {
    private Recursion() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Returns the reverse of an array using recursion.
     * problem 3
     * @param arr
     */
    public static Object[] reverseArrayElements(Object[] arr){
        return reverseArrayElements(arr, 0, arr.length-1);
    }

    /**
     * Returns the reverse of an array using recursion
     * @param arr
     * @param beginIndex
     * @param endIndex
     */
    private static Object[] reverseArrayElements(Object[] arr, int beginIndex, int endIndex){
        if(beginIndex == arr.length) return new Object[]{};
        if(beginIndex == endIndex || beginIndex > endIndex) return arr;
        else{
            Object temp = arr[beginIndex];
            arr[beginIndex] = arr[endIndex];
            arr[endIndex] = temp;
            return reverseArrayElements(arr, beginIndex + 1, endIndex - 1);
        }
    }

    /**
     * Recursion to return the Max value from a given array
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
