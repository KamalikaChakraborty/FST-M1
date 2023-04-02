package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String args[]) {
        Map<Integer, String> colours = new HashMap<Integer, String>();
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Black");
        colours.put(4, "Yellow");
        colours.put(5, "Green");
        System.out.println("Removed color is "+colours.get(2));
        colours.remove(2);
        System.out.println("Is Blue exists in the Map? "+colours.containsValue("Blue"));
        if(colours.containsValue("Green"))
            System.out.println("Green exists in the Map");
        else
            System.out.println("Green does not exist in the Map");
        System.out.println("Total size of the Map is "+colours.size());
    }
}
