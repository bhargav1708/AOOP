package javaCodes;

// Define a generic interface for finding min and max
interface MinMax<T> {
    T min(T[] array);
    T max(T[] array);
}