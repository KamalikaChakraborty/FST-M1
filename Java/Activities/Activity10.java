package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Alan");
        hs.add("Barry");
        hs.add("Irish");
        hs.add("Harry");
        hs.add("Pramod");
        hs.add("Diana");
        System.out.println("Total number of names is "+hs.size());
        hs.remove("Harry");
        hs.remove("Bruce");
        System.out.println("Name set after removing Harry: "+hs);
        System.out.println("Name set size after removing is "+hs.size());
        System.out.println("Is Irish present in the set? "+hs.contains("Irish"));
        System.out.println("Is Anita present in the set? "+hs.contains("Anita"));
    }
}
