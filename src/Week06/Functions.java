package Week06;

import java.util.Random;

public class Functions {

    public static void main(String[] args) {

        //Call functions here
        for (int i = 0; i < 6; i++) {
            int value = rollDie();
            System.out.println(value);
        }
        System.out.println();
        int x = 10;
        System.out.println("before function: " + x);
        addOne(x);
        System.out.println("after function: " + x);
    }

    //Functions (methods)
    //      cannot be nested
    //      must be within a class
    //      must have a name, same convention as variables
    //      must have an argument list contained in () and separated by commas, can be empty
    //      must have a return value, but can be void (nothing), or a class (ex: string)
    //      can only return 1 value
    //      must contain a body within {}
    //      name need not be unique as long as the signatures are "significantly" different
    //      signature -> return type, name, argument list
    //      arguments cannot be modified (pass by value)


    //you can put the same function and can put in different parameter combinations/data types (unless significantly different)
    //this is called overloading a function
    public static int rollDie() {
        Random r = new Random(); //this cannot be used outside the function (or any variable in the function), public doesn't do anything
        return r.nextInt(6) + 1;
    }
    public static int rollDie(int sides) {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
    public static int rollDie(Random r) { //no need to call the new statement when loading an object/class
        return r.nextInt(6) + 1;
    }
    public static void printString(String s, boolean newline) {
        if (newline) {
            System.out.println(s);
            //return;
        }else {
            System.out.print(s);
            //return;
        }

    }

    public static void addOne(int value) {
        value = value + 1;
        System.out.println("in fucntion addOne " + value);
    }

}
