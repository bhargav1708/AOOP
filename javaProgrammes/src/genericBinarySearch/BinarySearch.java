package genericBinarySearch;

import java.util.Arrays;

class BinarySearch<T extends Comparable<T>> {
    public int binarySearch(T[] array, T key) {
        Arrays.sort(array); // Ensure the array is sorted
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else if (array[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else {
                return mid; // Key found
            }
        }
        return -1; // Key not found
    }
}

