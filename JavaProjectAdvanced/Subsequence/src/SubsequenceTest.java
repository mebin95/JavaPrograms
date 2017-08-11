import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubsequenceTest {


    @Test
    public void testsubsequence() {
        Subsequence sq = new Subsequence();
        Assertions.assertEquals(sq.findSubsequence("Word", "Words"), "Word");
        Assertions.assertEquals(sq.findSubsequence("Word", "words"), "ord");
        Assertions.assertEquals(sq.findSubsequence("work", "Words"), "or");
        Assertions.assertNotEquals(sq.findSubsequence("Word", "Words"), "Wo");
    }

}
