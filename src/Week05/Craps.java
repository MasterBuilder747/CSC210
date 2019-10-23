package Week05;

import java.util.Random;

public class Craps {

    public static void main(String[] args) {

        //2 dice, 6 sided
        // 1) roll: random number generator
        Random rn = new Random();

        //simulate the actual game (rolling a 1 in 12 is not the same probability as two 6s)
        int die1, die2;
        die1 = rn.nextInt(6) + 1; //0 to 7 to 1 to var
        die2 = rn.nextInt(6) + 1; //0 to 7 to 1 to var
        // 2) add
        int sum  = die1 + die2;
        System.out.println(die1 + " " + die2 + " " + sum);

        // 3) check sum

        //sum is the var to test
        // 4) determine outcome
        switch (sum) {
            //lose
            case 2:
            case 3:
            case 12: System.out.println("LOSE");
            break;
            //win
            case 7:
            case 11: System.out.println("WINNER");
            break;
            //continue
            default: System.out.println("CONTINUE");
                    int point = sum;
                    do {
                        die1 = rn.nextInt(6) + 1;
                        die2 = rn.nextInt(6) + 1;
                        sum = die1 + die2;
                        System.out.println(die1 + " " + die2 + " " + sum);
                    } while ((sum != point) && (sum != 7) && (sum !=11));
                    if (sum == point) {
                        System.out.println("WINNER");
                    }else {
                        System.out.println("LOSE");
                    }
        }

        //2)

    }

}
