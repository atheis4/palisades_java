import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EuchreCard extends Card {

    private static final Map<String, List<String>> COLOR_TO_SUIT;
    private String color;

    static {
        COLOR_TO_SUIT = new HashMap<String, List<String>>() {{
            put("black", Arrays.asList("spades", "clubs"));
            put("red", Arrays.asList("hearts", "diamonds"));
        }};
    }

    public EuchreCard(String suit, int value) {
        super(suit, value);
        this.color = getColor();
    }

    private String getColor() {
        if (this.getSuit().equals("spades") || this.getSuit().equals("clubs")) {
            return "black";
        } else {
            return "red";
        }
    }
}
