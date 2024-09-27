package testPoker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import poker.Poker;

public class GPT_Test {

    @Test
    public void fullHouseReturnsTrue() {
        Poker poker = new Poker();
        Assertions.assertTrue(poker.isFullHouse(new String[]{"C2", "D2", "H2", "S3", "S3"}, 5));
    }

    @Test
    public void threeOfAKindReturnsTrue() {
        Poker poker = new Poker();
        Assertions.assertTrue(poker.isThreeOfaKind(new String[]{"C2", "D2", "H2", "S3", "S4"}, 5));
    }

    @Test
    public void twoPairsReturnsTrue() {
        Poker poker = new Poker();
        Assertions.assertTrue(poker.isTwoPairs(new String[]{"C2", "D2", "H3", "S3", "S4", "C4"}, 6));
    }

    @Test
    public void fullHouseReturnsFalse() {
        Poker poker = new Poker();
        Assertions.assertFalse(poker.isFullHouse(new String[]{"C2", "D2", "H3", "S3", "S4"}, 5));
    }

    @Test
    public void threeOfAKindReturnsFalse() {
        Poker poker = new Poker();
        Assertions.assertFalse(poker.isThreeOfaKind(new String[]{"C2", "D3", "H3", "S3", "S4"}, 5));
    }

    @Test
    public void twoPairsReturnsFalse() {
        Poker poker = new Poker();
        Assertions.assertFalse(poker.isTwoPairs(new String[]{"C2", "D2", "H3", "S3", "S4", "C5"}, 6));
    }
}
