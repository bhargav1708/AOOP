package javaCodes;

import java.util.Arrays;
import java.util.Comparator;

class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
    @Override
    public T min(T[] array) {
        return Arrays.stream(array).min(Comparator.naturalOrder()).orElse(null);
    }

    @Override
    public T max(T[] array) {
        return Arrays.stream(array).max(Comparator.naturalOrder()).orElse(null);
    }
}
