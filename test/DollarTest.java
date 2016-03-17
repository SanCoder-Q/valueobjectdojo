import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DollarTest {

    @Test
    public void dollarShouldEqualDollarWithSameAmount() {

        assertEquals(new Dollar(10), new Dollar(10));
    }
}
