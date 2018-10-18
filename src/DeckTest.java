import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class DeckTest {

    Deck one = new Deck();
    Deck two = new Deck();

    @Test
    public void shuffle() {
        // before shuffle, both deck's should return the same first card.
        Assert.assertTrue("Error - default instantiation not equal",
                one.draw().toString().equals(two.draw().toString()));
        // It is possible that a shuffled deck will still return the same card. Draw the entire
        // deck after shuffling one of them and assert arrays not equal. The probability of two
        // shuffles being exactly equal is 1 / 51! = ~6.45 x 10^-67. If that occurs, I pray this
        // test suite witnesses it.
        two.shuffle();
        List<String> fromOne = new ArrayList<String> ();
        List<String> fromTwo = new ArrayList<String> ();
        while(!one.isEmpty()) {
            fromOne.add(one.draw().toString());
            fromTwo.add(two.draw().toString());
        }
        Assert.assertNotEquals("Congratulations - both decks are the same after shuffling. :tada:",
                fromOne, fromTwo);
    }

    @Test
    public void draw() {
        // after drawing a card, the size of the deck should decrease by one.
        int expectedSize = 51;
        one.draw();
        Assert.assertEquals("Error - draw() failed, did not remove a card",
                one.cardsInDeck(), expectedSize);
    }

    @Test
    public void isEmptyTrue() {
        // Exhaust one by drawing every card.
        while (!one.isEmpty()) {
            one.draw();
        }
        Assert.assertTrue("Error - isEmpty() on presumably empty deck failed.",
                one.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        // a non exhausted deck.
        Assert.assertFalse("Error - isEmpty() on presumably non empty deck failed.",
                two.isEmpty());
    }

    @Test
    public void cardsInDeck() {
        Assert.assertTrue("Error - cardsLeft failed, did not return 52.",
                one.cardsInDeck() == 52);
    }
}