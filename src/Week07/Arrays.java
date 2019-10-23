package Week07;

import java.util.Scanner;

//Chapters 7, 8
public class Arrays {

    public static void main(String[] args) {

        int array[]; //reference to an array of int (stack)
        array = new int[5]; //allocate array of 5 ints (heap)
        //defaults to a value of 0

        for (int i = 0; i < array.length; i++) { //array length (total index + 1)
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int v : array) { //for each; assign a number of v to the index value
            //int v : array -> v = array[i]
            System.out.println(v);
        }

        double x[] = new double[4];
        for (int i = 0; i < x.length; i++) { // initialize the array (in heap)
            x[i] = i * 10;
        }

        //only on a declaration line
        int initarray[] = {4, 3, 2, 1, 0};
        for (int v: initarray) {
            System.out.println(v);
        }

        //Illegal, must be on declaration line
        //int initarray1[];
        //initarray = {4, 3, 2, 1, 0};

        //max: as much memory as you have; somewhere around 2 ^ 16 but not dependent on int size

        Scanner kb = new Scanner(System.in); //reference (heap) points to object (stack)
        System.out.println("array size? ");
        int size = kb.nextInt();
        int data[] = new int[size]; //heap only, hasn't been initialized
        /*
        try {
            data[size] = 42;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index too large");
        }
        */

        data = new int[size + 1];


    }

}
