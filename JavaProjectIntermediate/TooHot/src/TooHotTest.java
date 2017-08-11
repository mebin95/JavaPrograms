import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TooHotTest {

    @Test
    public void testTooHot() {

        TooHot t = new TooHot();
        Assertions.assertEquals(t.tooHot(60,true), true);
        Assertions.assertEquals(t.tooHot(90,false), true);
        Assertions.assertNotEquals(t.tooHot(91,false), true);

    }

}
