import com.companic.IntStreamUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class IntStreamTest {

    @Test
    public void shouldReturnAverageUsingAverage() {

        int[] intArray = {5, 3, 9, 7};
        int[] intArray2 = {4, 5, 6, 2, 12, 5, 3, 8};
        assertEquals("should return 6", 6,  IntStreamUtils.getAverageUsingAverage(intArray));
        assertEquals("should return 6", 6,  IntStreamUtils.getAverageUsingAverage(intArray2));
    }

    @Test
    public void shouldReturnAverageUsingCalculation() {
        int[] intArray = {5, 3, 9, 7};
        int[] intArray2 = {4, 5, 6, 2, 12, 5, 3, 8};
        assertEquals("should return 6", 6,  IntStreamUtils.getAverage(intArray));
        assertEquals("should return 6", 6,  IntStreamUtils.getAverage(intArray2));
    }

    @Test
    public void shouldCountZerosCorrectly() {
        int[] array = {1, 3, 5, 6, 0, 1, 0, 14, 5, 0};

        assertEquals("should return 3", 3,  IntStreamUtils.countZeros(array));
    }

    @Test
    public void shouldCountPositiveElementsCorrectly() {
        int[] array = {1, -1, 4, 53, -7, 1, -5, 0, 1};

        assertEquals("should return 5", 5,  IntStreamUtils.countPositives(array));
    }

    @Test
    public void shoundReturnMinElementAndItsIndex() {
        int[] array = {1, -1, 4, 53, -7, 1, -5, 0, 1};

        assertArrayEquals("should be element -7 and index 4", new int[]{-7, 4}, IntStreamUtils.getMinimalAndIndex(array));
    }

}
