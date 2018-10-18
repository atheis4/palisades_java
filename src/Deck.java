import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Deck {
    public static final String[] SUITS = {"spades", "hearts", "clubs", "diamonds"};
    public static final int[] VALUES = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

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

    public Card draw() {
        return cards.remove();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public int cardsInDeck() {
        return cards.size();
    }
}
