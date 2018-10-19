/*
    The Player class facilitates the counting and placement of the face down cards, the face up
    cards and the cards that are in the players hand.
*/

import java.util.ArrayList;
import java.util.List;


public class Player {

    private String playerName;
    private List<Card> cards;
    private List<Card> faceDownCards;
    private List<Card> faceUpCards;

    //
    public Player(String name) {
        playerName = name;
        cards = new ArrayList<Card>();
        faceDownCards = new ArrayList<Card>();
        faceUpCards = new ArrayList<Card>();
    }

    //
    public String getPlayerName() {
        return playerName;
    }

    //
    public void addCard(Card newCard) {
        cards.add(newCard);
    }

    //
    public void addCards(List<Card> newCards) {
        cards.addAll(newCards);
    }

    //
    public void addToFaceUp(List<Card> upCards) {
        faceUpCards.addAll(upCards);
    }

    //
    public int cardsInHand() {
        return cards.size();
    }

    //
    public List<Card> getFaceUpCards() {
        return faceUpCards;
    }

    //
    public List<Card> getFaceDownCard(int index) {

    }

    //
    private boolean existsFaceUp() {
        return (!faceUpCards.isEmpty());
    }

    //
    private boolean isValidIndex(int index) {
        if (index < 1 || index > numberOfFaceDown()) {
            throw new IllegalArgumentException(
                    "The index value passed is not valid. "
            );
        }
    }
    
    //
    private int numberOfFaceDown() {
        return faceDownCards.size();
    }
}
