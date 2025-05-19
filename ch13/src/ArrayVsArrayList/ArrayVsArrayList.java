package ArrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        // Create arrays and ArrayLists
        // String[] friendsArray = new String[4]; // Empty array of fixed size
        String[] friendsArray2 = {"John", "Chris", "Eric", "Luke"}; // Array with initial values

        // ArrayList<String> friendsArrayList = new ArrayList<>(); // Empty ArrayList
        ArrayList<String> friendsArrayList2 = new ArrayList<>(
                Arrays.asList("John", "Chris", "Eric", "Luke")); // ArrayList with initial values

        // Get element by index
        System.out.println(friendsArray2[1]);           // Accessing array element
        System.out.println(friendsArrayList2.get(1));   // Accessing ArrayList element

        // Get size
        System.out.println(friendsArray2.length);       // Array size
        System.out.println(friendsArrayList2.size());   // ArrayList size

        // Add an element
        // ❌ Cannot add elements to a fixed-size array
        friendsArrayList2.add("Kapila");                // Add to end
        friendsArrayList2.add(1, "Savidu");             // Insert at index 1

        // Set/Update an element
        friendsArray2[0] = "Manusha";                   // Change array element
        friendsArrayList2.add(0, "Gunathilaka");        // Insert at beginning (not set)

        // Remove an element
        // ❌ Cannot directly remove elements from an array
        friendsArrayList2.remove("Kapila");             // Remove by value
        friendsArrayList2.remove(1);                    // Remove by index

        // Print contents
        System.out.println(Arrays.toString(friendsArray2));   // Print array
        System.out.println(friendsArrayList2);                // Print ArrayList
    }
}
