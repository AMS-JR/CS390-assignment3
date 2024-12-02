package recursion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Recursion!");
        //Problem 3
        System.out.println("Reversed Array Elements: " + Arrays.toString(Recursion.reverseArrayElements(new Object[]{1, 3, 5, 7, 9, 13})));
        //problem 5
        System.out.println("Max: " + Recursion.getMaxValue(new int[]{ 5, -3, 6, 1, 9, 4 }));
    }
}
