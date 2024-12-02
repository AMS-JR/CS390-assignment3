package recursion;

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
}
