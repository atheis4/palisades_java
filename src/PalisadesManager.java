import java.util.Stack;
import java.util.Queue;


public class PalisadesManager {

    private Deck deck;
    private Queue<Player> players;
    private Stack<Card> pile;
    private Stack<Card> discardPile;

    public PalisadesManager() {
        Player p1 = new Player("player 1");
        Player p2 = new Player("player 2");
        Player p3 = new Player("player 3");
        Player p4 = new Player("player 4");
    }

    // Runs the game loop for Palisades.
    public void run() {}
}
