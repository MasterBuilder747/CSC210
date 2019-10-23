package Week04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        //Scanner r = null;

        //int must have a value before being read or used in the try catch
        int x = 0;
        int y = 0;

        //if else statement but with testing an exception
        //executes once
        try {
            Scanner r = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            x = r.nextInt();
            //int y = 1;
            //y = r.nextInt();
            System.out.println(x / y);
            System.out.println(Math.sqrt(x));
        }
        catch (ArithmeticException a) { //ex: infinity, does NOT handle an NaN
            //still works if first input is wrong data type
            //this gets skipped
            System.out.println("bad arithmetic");
        }
        catch (InputMismatchException a) //exception must be imported to use
        {
            System.out.println("input mismatch");
        }
        //Exception includes all exceptions from java
        //it must be catched last
        catch (Exception a) {
            //Exception is an API object like String
            System.out.println("Exception" + a); //+ a not needed
        }finally{
            //executes last even though the code after still executes
            //not used often but used for cleanup in the statements
            //ex: change x to y
            x = y;
            System.out.println("always do finally");
            //optional, if try catch, it goes here
            //r.close();
        }

        System.out.println(x);

        //optional, if main it goes here
        //r.close();

    }

}
