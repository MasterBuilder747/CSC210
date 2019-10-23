package Converter;

import java.util.Scanner;

public class UsdToEuro {

    public static void main(String[] args) {

        //prompt the user for an input
        System.out.println("=USD to Euro Converter=");
        System.out.print("Enter a value in US dollars: ");

        //input
        Scanner reader = new Scanner (System.in);
        double input = reader.nextDouble();

        //process the input
        //converter value from Euro to USD: 0.9
        double output = input  * 0.9;

        //output the result
        System.out.println("$" + input + " = " + "€" + output);

    }

}
