package com.companic;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class IntStreamUtils {

    public static int getAverageUsingAverage(int[] arr) {
        Objects.requireNonNull(arr, "arr is null");
        return (int) Math.round(Arrays.stream(arr).average().getAsDouble());
    }

    public static int getAverage(int[] arr) {
        Objects.requireNonNull(arr, "array is null");
        return (int) Math.round(Arrays.stream(arr).sum() / (double) arr.length);

    }

    public static int countZeros(int[] arr) {
        Objects.requireNonNull(arr, "array is null");
        return (int) Arrays.stream(arr).filter(x -> x == 0).count();
    }

    public static int countPositives(int[] arr) {
        Objects.requireNonNull(arr, "array is null");
        return (int) Arrays.stream(arr).filter(x -> x > 0).count();
    }

    public static int[] getMinimalAndIndex(int[] arr) {
        Objects.requireNonNull(arr, "array is null");

        int min = Arrays.stream(arr).min().getAsInt();

        return IntStream.range(0, arr.length)
                .mapToObj(n -> new int[]{arr[n], n})
                .filter(elem -> elem[0] == min)
                .findFirst()
                .get();
    }
}
