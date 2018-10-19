package main;

public class Main {

    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.draw();
        System.out.println(c);

    }
}
