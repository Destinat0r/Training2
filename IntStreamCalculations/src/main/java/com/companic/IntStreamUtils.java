package com.companic;

import java.util.Arrays;

public class IntStreamUtils {

    public static int getAverageUsingAverage(int[] intArray) {
        return (int) Math.round(Arrays.stream(intArray).average().getAsDouble());
    }
}
