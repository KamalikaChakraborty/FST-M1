package activities;

public class Activity2 {
    public static void main(String args[]) {
        int expectedSum = 30;
        int[] integerArray = {10, 77, 10, 54, -11, 10};
        System.out.println("Sum result: "+ sumResult(integerArray, expectedSum));
    }

    public static boolean sumResult(int[] numberArray, int expectedSumResult) {
        int sum = 0;
        for(int i=0; i<numberArray.length; i++) {
            if(numberArray[i]== 10)
                sum +=numberArray[i];
        }
        if(sum == expectedSumResult)
            return true;
        else
            return false;
    }
}
