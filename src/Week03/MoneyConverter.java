package Week03;

import java.util.Scanner;

public class MoneyConverter {

    public static void main(String[] args) {
        /*
        Scanner reader = new Scanner(System.in);

        System.out.println("What do you want to convert? Type 1 for euro to usd, 2 for usd to euro");
        int x;
        int y;
        int oper = reader.nextInt(); //1 for euro to usd, 2 for usd to euro
        if (oper == 1) {
            //euro to usd code
            x = 5;
            y = 4;
        }else{
            //usd to euro code
            x = 4;
        }
        */

        /*
        boolean b = true;
        if (b) {
            System.out.println("b is true");
        }else{
            System.out.println("b is false");
        }
        */


        //if else ladder
        int x = 0;
        if (x < 0) {
            System.out.println("b is less");
        }else if(x == 0) {
            System.out.println("b is 0");
        }else if (x > 0) {
            System.out.println("b is greater");
            //last possibility, delete the condition
        }else{
            System.out.println("something else");
            //not possible
        }
    }
}