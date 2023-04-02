package activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();
        System.out.println("Enter integer value only: ");
        while(scan.hasNextInt() && list.size()<5) {
            list.add(scan.nextInt());
        }
        Integer nums[] = list.toArray(new Integer[0]);
        System.out.println("User input value list: "+ Arrays.toString(nums));
        int randomIndex = indexGen.nextInt(nums.length);
        System.out.println("Random generated index is " + randomIndex + " and the array value is "+nums[randomIndex]);
        scan.close();
    }
}
