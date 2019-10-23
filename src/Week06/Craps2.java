package Week06;

import java.util.Random;

public class Craps2 {

    //public vars

    //public functions

    //main function (calls the functions)

    public static void main(String[] args) {
        //2 dice, 6 sided
        // 1) roll: random number generator
        Random rn = new Random();

        //simulate the actual game (rolling a 1 in 12 is not the same probability as two 6s)
        int sides = 6; //this is still ok as this is out of scope from the function
        int die1, die2;
        die1 = roll(sides); //0 to 7 to 1 to var
        die2 = roll(sides); //0 to 7 to 1 to var
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
                    die1 = roll(sides);
                    die2 = roll(sides);
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

    //can be declared later; compiler doesn't care (only in java)
    //java is a multi-pass compiler
    public static int roll(int sides/*, Random r*/ /*int seed*/) { //calling random from a parameter uses more memory
        Random r = new Random(); //but this has a scope only accessible inside the function
        //^ you can redeclare/set classes only in this scope from outside the scope
        return r.nextInt(sides) + 1;
        //return (int)(Math.random() * sides + 1); //cannot be seeded
        //{int crap;} this is legal to define scope
    }
    //applies to vars and objects
    public static Random r; //= null; //only way (for now) to declare a var or obj outside of funct or main funct
    //class scope

}



