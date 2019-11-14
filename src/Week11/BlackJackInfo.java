package Week11;

public class BlackJackInfo {

    public static void main(String[] args) {

        //research: understanding the problem
        //start of the game:
        //0) shuffle
        //1) deal 1 card to player face down
        //2) deal 1 card to dealer face down
        //3) deal 1 card to player face down
            //3.5) player adds cards [if statement test if blackjack]
        //4) deal 1 card to dealer face down
            //4.5) dealer adds cards [if statement test if blackjack]
        //5) ask if they want another card
            //5.2) want another card
                //while (yes)
            //5.5) deal another card to p face down
        //6) player adds card value to make a decision (sum)
        //7) if sum > 21
            //player declares BUST
        //8) if p <= 21
            //8.5) show dealer cards, ask again
        //9) while (d <16)
        //10) deal card to d face up
        //11) add cards
        //12) if d > 21
            //d declares BUST, game over
        //13) if (21-P) < (21 - D)
            //p wins
            //else if (21-P) > (21-D)
            //D wins
            //else
            //draw

        //***by circling key terms in this pseudo code...***
        //therefore we will need:
        //  a card object
            //value (value)
            //suite (1-4)
            //display (use toString)
        //  adds (amount assigned to dealer and player)
            //hand is an array of cards (max 26)
            //add
            //display
        //  deck
            //array of cards
            //shuffle
            //deal
    }

}
