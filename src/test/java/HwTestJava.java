import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by labib's pc on 2/26/2017.
 */
public class HwTestJava {
    private HW obj;

    @Before
    public void setUp() {
        obj = new HW();
    }

    @Test
    public void testSqrt() {
        int result = obj.sqrt(100);
        int expectation = 10;
        Assert.assertEquals(expectation, result);
    }

    @Test
    public void sumTest() {
        int result = obj.sum(5,5);
        int expectation = 10;
        Assert.assertEquals(expectation, result);
    }
    @Test
    public void sumTestOne() {
        int result = obj.sum(Integer.MAX_VALUE,Integer.MAX_VALUE);
        int expectation = -2;
        Assert.assertEquals(expectation, result);
    }
}
