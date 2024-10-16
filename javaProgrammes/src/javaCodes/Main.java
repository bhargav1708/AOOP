package javaCodes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {3, 5, 7, 2, 8};
        MinMax<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Min: " + intMinMax.min(intArray));
        System.out.println("Max: " + intMinMax.max(intArray));

        // String array
        String[] strArray = {"apple", "orange", "banana", "pear"};
        MinMax<String> strMinMax = new MinMaxImpl<>();
        System.out.println("\nString Array: " + Arrays.toString(strArray));
        System.out.println("Min: " + strMinMax.min(strArray));
        System.out.println("Max: " + strMinMax.max(strArray));

        // Character array
        Character[] charArray = {'a', 'z', 'e', 'r', 'b'};
        MinMax<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("\nCharacter Array: " + Arrays.toString(charArray));
        System.out.println("Min: " + charMinMax.min(charArray));
        System.out.println("Max: " + charMinMax.max(charArray));

        // Float array
        Float[] floatArray = {3.5f, 5.7f, 2.2f, 8.8f};
        MinMax<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("\nFloat Array: " + Arrays.toString(floatArray));
        System.out.println("Min: " + floatMinMax.min(floatArray));
        System.out.println("Max: " + floatMinMax.max(floatArray));
    }
}

