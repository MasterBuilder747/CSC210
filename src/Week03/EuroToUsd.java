package Week03;

import java.util.Scanner;

public class EuroToUsd {

    public static void main(String[] args) {

        //prompt the user for an input
        System.out.println("=Euro to USD Converter=");
        System.out.print("Enter a value in Euros: ");

        //input
        Scanner reader = new Scanner (System.in);
        double usd = reader.nextDouble();
        double euro = usd * 1.11;
        System.out.println(euro + " €");

        //process the input
        //converter value from USD to Euro: 1.11
        int ieuro = (int)(euro * 100 + 0.5);
        //0.5 adds to the rounding as the conversion rounds any decimal down, 0.5 is the threshold:
        /*
        ex:
        9.005
        900.5
        901
        9.01
         */
        euro = ieuro / 100;

        //output the result
        System.out.println("€" + euro + " = " + "$" + ieuro);

    }

}