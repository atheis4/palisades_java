package main;/*
    The main.Player class facilitates the counting and placement of the face down cards, the face up
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

    // Returns the player's name.
    public String getPlayerName() {
        return playerName;
    }

    // Add a single card into the player's hand.
    public void addCard(Card newCard) {
        cards.add(newCard);
    }

    // Add several cards to the player's hand.
    public void addCards(List<Card> newCards) {
        cards.addAll(newCards);
    }

    //
    public int cardsInHand() {
        return cards.size();
    }

    // TODO: Maybe this should just be one function that you give an index and stack type to?
    // TODO: And the up and down cards could be a new private class that has these methods?
    // Returns the face down card located at the provided index.
    // Throws an IllegalStateException if there are still face up cards that can be drawn.
    // Throws an IllegalArgumentException if the index value is below 1 or greater than the number
    // of face down cards.
    public Card getFaceDownCard(int index) {
        if (existsFaceUp()) {
            throw new IllegalStateException(
                    "Face down cards cannot be accessed while there are still face up cards.");
        }
        checkValidIndex(index);
        return faceDownCards.remove(index);
    }

    // Helper method to check that the selected index is valid. Face down cards are one-indexed and
    // total no more than 3 at a time. If the input index is less than one or greater than the
    // number of face down cards left in the player's hand, then an IllegalArgumentException is
    // thrown.
    private void checkValidIndex(int index) {
        if (index < 1 || index > numberOfFaceDown()) {
            throw new IllegalArgumentException(
                    "The index value passed is not valid. ");
        }
    }

    // Return true if there are still face up cards in this player's hand.
    private boolean existsFaceUp() {
        return (!faceUpCards.isEmpty());
    }

    //
    private int numberOfFaceDown() {
        return faceDownCards.size();
    }
}
