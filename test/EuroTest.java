import org.junit.*;
import static org.junit.Assert.*;

public class EuroTest {

    @Test
    public void euroShouldEqualEuroWithSameAmount() {

        assertEquals(new Euro(10), new Euro(10));
    }

    @Test
    public void euroShouldNotEqualEuroWithDifferentAmount() {

        assertNotEquals(new Euro(5), new Euro(10));
    }

    @Test
    public void euroShouldNotEqualToNull() {

        assertNotEquals(new Euro(10), null);
    }

    @Test
    public void euroShouldNotEqualToOtherObject() {

        assertNotEquals(new Euro(10), new Object());
    }

    @Test
    public void euroShouldEqualTheSumOfOtherEurosWhenTheAmountIsTheSame() {

        assertEquals(new Euro(10), new Euro(3).add(new Euro(7)));
    }

    @Test
    public void euroShouldNotEqualTheSumOfOtherEurosWhenTheAmountIsNotTheSame() {

        assertNotEquals(new Euro(10), new Euro(5).add(new Euro(2)));
    }

    @Test
    public void euroShouldNotEqualDollarEvenWhenTheAmountIsSame() {

        assertNotEquals(new Euro(10), new Dollar(10));
    }
}
