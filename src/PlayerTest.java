import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class PlayerTest {

    Player p1 = new Player("Daryl");

    @Test
    public void testGetName() {
        String expected = "Daryl";
        Assert.assertEquals("Error - getPlayerName() failed.", p1.getPlayerName(), expected);
    }

    @Test
    public void testAddCard() {
        int before = p1.cardsInHand();
        p1.addCard(new Card("spades", 10));
        int after = p1.cardsInHand();
        Assert.assertNotEquals("Error - addCard() failed.", before, after);
    }

    @Test
    public void testAddCards() {
        List<Card> cards = new ArrayList<Card>();
        int cardCount = 0;
        for (int i = 2; i < 10; i++) {
            cards.add(new Card("hearts", i));
            cardCount++;
        }
        int before = p1.cardsInHand();
        p1.addCards(cards);
        int after = p1.cardsInHand();
        Assert.assertEquals("Error - addCards() failed.", before + cardCount, after);
    }

    @Test
    public void testAddToFaceUp() {

    }

    @Test
    public void testCardsInHand() {}

    @Test
    public void testExistsFaceUp() {}
}
