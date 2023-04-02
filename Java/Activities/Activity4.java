package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String args[]) {
        int[] integerArray = {4, 3, 2, 10, 12, 1, 5, 6};
        System.out.println("Sorted array: "+ Arrays.toString(insertionSort(integerArray)));
    }

    public static int[] insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int sortingNumber = inputArray[i];
            int j = i - 1;
            while (j >= 0 && sortingNumber < inputArray[j]) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = sortingNumber;
        }
        return inputArray;
    }
}
