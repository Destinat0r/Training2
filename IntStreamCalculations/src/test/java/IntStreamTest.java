import com.companic.IntStreamUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntStreamTest {

    @Test
    public void shouldReturnAverageUsingAverage() {

        int[] intArray = {5, 3, 9, 7};
        int[] intArray2 = {4, 5, 6, 2, 12, 5, 3, 8};
        assertEquals("should return 6", 6,  IntStreamUtils.getAverageUsingAverage(intArray));
        assertEquals("should return 6", 6,  IntStreamUtils.getAverageUsingAverage(intArray2));
    }

    public void shouldReturnAverageUsingCalculation() {
        int[] intArray = {5, 3, 9, 7};
        int[] intArray2 = {4, 5, 6, 2, 12, 5, 3, 8};
        assertEquals("should return 6", 6,  IntStreamUtils.getAverage(intArray));
        assertEquals("should return 6", 6,  IntStreamUtils.getAverage(intArray2));
    }


}
