package TreeSetExperiment;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExperiment {
    public static void main(String[] args) {
        // Create a TreeSet of Strings
        TreeSet<String> stringSet = new TreeSet<>();

        // Add elements to the TreeSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Fig");

        // Print the initial TreeSet
        System.out.println("Initial TreeSet: " + stringSet);

        // Remove an element
        stringSet.remove("Banana");
        System.out.println("After removing 'Banana': " + stringSet);

        // Add a new element
        stringSet.add("Grapes");
        System.out.println("After adding 'Grapes': " + stringSet);

        // Use an iterator to print elements
        System.out.println("Elements using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

