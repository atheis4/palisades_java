package main;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    Card aceSpades = new Card("spades", 14);
    Card tenHearts = new Card("hearts", 10);
    Card twoClubs = new Card("clubs", 2);
    Card tenDiamonds = new Card("diamond", 10);

    @Test
    public void testToString() {
        String expected = "Ace of spades";
        Assert.assertEquals("Error - toString() failed.", aceSpades.toString(), expected);
    }

    @Test
    public void testGetSuit() {
        String expected = "clubs";
        Assert.assertEquals("Error - getSuit() failed.", twoClubs.getSuit(), expected);
    }

    @Test
    public void testGetValue() {
        int expected = 10;
        Assert.assertEquals("Error - getValue() failed.", tenHearts.getValue(), expected);
    }

    @Test
    public void testCompareTo() {
        // main.test first less than second
        Assert.assertTrue("Error - first less than second failed.",
                twoClubs.compareTo(aceSpades) < 0);
        // main.test first greater than second
        Assert.assertTrue("Error - first greater than second failed.",
                aceSpades.compareTo(tenDiamonds) > 0);
        // main.test first equal to second
        Assert.assertTrue("Error - first equals second failed.",
                tenDiamonds.compareTo(tenHearts) == 0);
    }
}