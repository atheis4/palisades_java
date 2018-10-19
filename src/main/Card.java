package main;/*
    Represents a single playing card with a suit and a value.

    Values are 2 (*), 3, 4, 5, 6, 7, 8, 9, 10 (*), 11 (J), 12 (Q), 13 (K), and 14 (A).
    Suits are "spades", "hearts", "clubs", and "diamonds".
*/


public class Card implements Comparable<Card> {

    private String suit;
    private int value;

    // Constructs a new card instance.
    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    // Returns the string representation of the card.
    public String toString() {
        String res = "";
        if (value > 10) {
            String face;
            if (value == 11) {
                face = "Jack";
            } else if (value == 12) {
                face = "Queen";
            } else if (value == 13) {
                face = "King";
            } else {
                face = "Ace";
            }
            res += face;
        } else {
            res += value;
        }
        res += " of " + suit;
        return res;
    }

    // Returns the suit of this card.
    public String getSuit() {
        return suit;
    }

    // Returns the value of this card.
    public int getValue() {
        return value;
    }

    // Return true if the value of the card is 10. -- should be separated from card class
    public boolean isTen() {
        return value == 10;
    }

    // Return true if the value of the card is 2. -- should be separated from card class
    public boolean isTwo() {
        return value == 2;
    }

    // The cards value is the only field that determines the equality of two cards.
    public int compareTo(Card other) {
        return value - other.value;
    }
}
