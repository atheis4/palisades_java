/*

    Deck - Andrew Theis

    The Deck class represents a standard deck of 52 playing cards.

    When a deck is instantiated, all 52 cards are created in order. It must be shuffled before a
game can be played.

    The deck includes a shuffle method which randomizes the order of the cards, a draw method which
returns a single card, an isEmpty method which returns true if all cards have been drawn, and a
size method that returns the number of cards left in the deck.

*/

package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Deck {
    private static final String[] SUITS = {"spades", "hearts", "clubs", "diamonds"};
    private static final int[] VALUES = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    private Queue<Card> cards;

    // Constructs a new instance of a deck.
    public Deck() {
        cards = createCards();
    }

    // Creates and adds all 52 cards for our card game into our deck.
    private Queue<Card> createCards() {
        Queue<Card> deck = new LinkedList<Card>();
        for (String suit : SUITS) {
            for (int value : VALUES) {
                deck.add(new Card(suit, value));
            }
        }
        return deck;
    }

    // Shuffles the deck to randomize card order.
    public void shuffle() {
        List<Card> temp = new ArrayList<Card>();
        while (!cards.isEmpty()) {
            temp.add(cards.remove());
        }
        Collections.shuffle(temp);
        while (!temp.isEmpty()) {
            cards.add(temp.remove(0));
        }
    }

    // Returns the 'top' card from the deck, removing it.
    public Card draw() {
        return cards.remove();
    }

    // Returns true if the deck is empty, else false.
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    // Returns the number of cards left in the deck.
    public int cardsInDeck() {
        return cards.size();
    }
}
