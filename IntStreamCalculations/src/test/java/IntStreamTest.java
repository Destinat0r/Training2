import com.companic.IntStreamUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntStreamTest {

    @Test
    public void shouldReturnAverageUsingAverage() {

        assertEquals("should return 24", 24,  IntStreamUtils.getAverageUsingAverage());
    }
}
