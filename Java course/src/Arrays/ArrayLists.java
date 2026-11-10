package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers;
        numbers = new ArrayList<>();

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

        // Adding to the array
        strings.add("ABC");
        strings.add("DEF");
        strings.add("GHI");
        System.out.println(strings); // [ABC, DEF, GHI]

        strings.add(0, "start");
        System.out.println(strings); // [start, ABC, DEF, GHI]

        // Get a item by index
        strings.get(1);
        System.out.println(strings.get(1)); // ABC

        // Set a item by index
        strings.set(0, "index");
        System.out.println(strings); // [index, ABC, DEF, GHI]

        // Remove a item by index
        strings.remove(0);
        System.out.println(strings); // [ABC, DEF, GHI]

        // Renive a item by value
        strings.remove("ABC");
        System.out.println(strings); // [DEF, GHI]

        // Size
        System.out.println(strings.size()); // 2

        // Sorting
        strings.add("ABC"); // [DEF, GHI, ABC]
        Collections.sort(strings);
        System.out.println(strings); // [ABC, DEF, GHI]
    }
}
