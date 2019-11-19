package Week12.BlackJack2;

public class Deck {

    private Card deck[];

    public Deck() {
        //default deck is 52 cards
        deck = new Card[52]; // this makes 0 cards, they are only references
        //generate "standard" deck of cards
        int i = 0;
        for (int suite = 1; suite <= 4; suite++) {
            for (int value = 1; value <= 13; value++) {
                Card c = new Card(value, suite);
            }
        }
    }

}
