package com.ArraylistExample;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Access elements by index
        System.out.println("Element at index 1: " + numbers.get(1));

        // Change an element
        numbers.set(2, 35);
        System.out.println("Modified ArrayList: " + numbers);

        // Remove an element
        numbers.remove(0);
        System.out.println("After removing first element: " + numbers);

        // Check if an element exists
        boolean containsTwenty = numbers.contains(20);
        System.out.println("Contains 20? " + containsTwenty);
    }
}

