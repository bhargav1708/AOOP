package genericBinarySearch;

public class BinarySearchTest {
    public static void main(String[] args) {
        BinarySearch<Integer> intSearch = new BinarySearch<>();
        Integer[] intArray = {3, 5, 7, 2, 8};
        System.out.println("Index of 7: " + intSearch.binarySearch(intArray, 7));

        BinarySearch<Double> doubleSearch = new BinarySearch<>();
        Double[] doubleArray = {3.5, 5.7, 2.2, 8.8};
        System.out.println("Index of 5.7: " + doubleSearch.binarySearch(doubleArray, 5.7));

        BinarySearch<String> stringSearch = new BinarySearch<>();
        String[] strArray = {"apple", "orange", "banana", "pear"};
        System.out.println("Index of 'banana': " + stringSearch.binarySearch(strArray, "banana"));
    }
}
