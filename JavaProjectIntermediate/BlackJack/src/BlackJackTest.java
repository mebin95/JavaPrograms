import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackTest {

    @Test
    public void testBlackJack() {
        BlackJack b = new BlackJack();
        Assertions.assertEquals(b.blackJack(18, 21), 21);
        Assertions.assertEquals(b.blackJack(20, 18), 20);
        Assertions.assertEquals(b.blackJack(22, 22), 0);
        Assertions.assertNotEquals(b.blackJack(21, 22), 22);
    }

}
