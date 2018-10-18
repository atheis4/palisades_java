/*
    The Hand class facilitates the counting and placement of the face down cards, the face up
    cards and the cards that are in the players hand.

    The Hand class is instantiated by passing a list of

*/

import java.util.ArrayList;
import java.util.List;


public class Hand {

    private String playerName;
    private List<Card> cards;
    private List<Card> faceDownCards;
    private List<Card> faceUpCards;

    public Hand() {
        cards = new ArrayList<Card>();
        faceDownCards = new ArrayList<Card>();
        faceUpCards = new ArrayList<Card>();
    }

    public void addCard(Card newCard) {
        cards.add(newCard);
    }

    public void addCards(List<Card> newCards) {
        cards.addAll(newCards);
    }

    public void addToFaceUp(List<Card> upCards) {
        faceUpCards.addAll(upCards);
    }

    public int cardsInHand() {
        return cards.size();
    }

    private boolean faceUpExists() {
        return (!faceUpCards.isEmpty());
    }
}
