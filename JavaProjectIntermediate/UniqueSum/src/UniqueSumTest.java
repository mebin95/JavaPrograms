import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueSumTest {

    @Test
    public void testUniqueSum() {
        UniqueSum u = new UniqueSum();
        Assertions.assertEquals(u.uniqueSum(1,2,3), 6);
        Assertions.assertEquals(u.uniqueSum(3,3,3), 0);
        Assertions.assertEquals(u.uniqueSum(1,1,2), 2);
        Assertions.assertNotEquals(u.uniqueSum(1,1,2), 5);
    }

}
