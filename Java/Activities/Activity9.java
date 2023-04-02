package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String args[]) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Alan");
        myList.add("Barry");
        myList.add("Irish");
        myList.add("Harry");
        myList.add("Pramod");
        System.out.println("Name list:");
        for (String name : myList) {
            System.out.println(name);
        }
        System.out.println("Third name is "+ myList.get(2));
        System.out.println("Irish is present in the list? "+myList.contains("Irish"));
        System.out.println("Anita is present in the list? "+myList.contains("Anita"));
        System.out.println("Total number of names is "+myList.size());
        myList.remove("Harry");
        System.out.println("Name list after removing Harry: "+myList);
        System.out.println("Name list size after removing is "+myList.size());
    }
}
