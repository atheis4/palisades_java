package main;

import java.util.Stack;
import java.util.Queue;


public class PalisadesManager {

    private Deck deck;
    private Queue<Player> players;
    private Stack<Card> pile;
    private Stack<Card> discardPile;

    public PalisadesManager() {
        // Our four players
        Player p1 = new Player("player 1");
        Player p2 = new Player("player 2");
        Player p3 = new Player("player 3");
        Player p4 = new Player("player 4");

        // Create the deck & shuffle.
        Deck deck = new Deck();
        deck.shuffle();
    }

    // how do we determine if the game has ended?
    // A game is over if a player no longer has any face down cards.
    private boolean gameOver() {
        return false;
    }

    public void setUpGame() {
        // We need to deal 3 cards to each player's face down.
        // Then we need to deal each player an additional 6 cards.
        // Each player chooses three of those 6 additional cards to treat as the face up cards.
    }

    public void run() {
        while (!gameOver()) {

        }
    }
}
