import com.companic.IntStreamUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntStreamTest {

    @Test
    public void shouldReturnAverageUsingAverage() {

        int[] intArray = {5, 3, 9, 7};
        assertEquals("should return 6", 6,  IntStreamUtils.getAverageUsingAverage(intArray));
    }
}
