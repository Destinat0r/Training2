package com.companic;

import java.util.Arrays;

public class IntStreamUtils {

    public static int getAverageUsingAverage(int[] intArray) {
        return (int) Arrays.stream(intArray).average().getAsDouble();
    }
}
