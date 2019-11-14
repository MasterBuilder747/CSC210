package Week11.BlackJack;

public class Card {
    private int value; // [1 - 11]
    private int suite; // [1-4]

    private Card() {

    }

    private Card(int value, int suite) throws IllegalArgumentException {
        //handle the value of the card
        if ((value > 0) && (value <= 13)) {
            this.value = value;
        }else {
            throw new IllegalArgumentException("invalid card value");
        }
        //handle the suite of the card
        if ((suite >= 1) && (suite <= 4)) {
            this.suite = suite;
        }else{
            throw new IllegalArgumentException("invalid ard suite");
        }
    }

    //getters are public
    //let the game decide the value of the card
    //this makes it easier to write other games with different values for Jk, Q, K, A, etc
    public int getValue() {
        return value;
    }

    public int getSuite() {
        return suite;
    }

    //override
    //sout takes any value and doesn't cast (coerce) the data
    //sout calls toString anyways when coercing the data types to strings
    //even if its a reference, shows the memory address
    public String toString() {
        String s = value + " of ";
        //handle s to only be in the 1 to 10 range
        switch(value) {
            case 13:
                s = "King";
                break;
            case 12:
                s = "Queen";
                break;
            case 11:
                s = "Jack";
                break;
            case 1:
                s = "Ace";
                break;
            default:
                s = "" + value; // "" + int converts to String
        }

        switch(suite) {
            case 1: s += "Hearts";
            break;
            case 2: s += "Spades";
            break;
            case 3: s += "Diamonds";
            break;
            case 4: s += "Clubs";
            break;
        }
        return s;
    }

    public static void main(String[] args) {



    }
}
