public class PalisadesCard extends Card {

    public PalisadesCard(String suit, int value) {
        super(suit, value);
    }

    public boolean isTen() {
        return super.getValue() == 10;
    }

    public boolean isTwo() {
        return super.getValue() == 2;
    }
}
