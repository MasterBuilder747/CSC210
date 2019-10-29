package Week09;

import java.util.Random;

public class TwoDArrays {

    public static void main(String[] args) {

        Random r = new Random();

        //whats happening in the background:
        //stack (compiler operation) = heap (JVM operation)
        int a[][] = new int[3][4];
        int value = 1;
        for (int i = 0; i < a.length; ++i) { //rows
            for (int j = 0; j < a[i].length; ++j) { //cols
                a[i][j] = value++;
            }
        }

        for (int i = 0; i < a.length; ++i) { //rows
            for (int j = 0; j < a[i].length; ++j) { //cols
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        int b[][] = {{3, 3, 3}, {2, 2}, {1}};
        for (int i = 0; i < b.length; ++i) { //rows
            for (int j = 0; j < b[i].length; ++j) { //cols
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        //can change the bounds of the array later once it has been initialized
        b = new int[3][0];
        b[0] = new int[3];
        b[1] = new int[2];
        b[2] = new int[1];
        int l = 3;
        for (int i = 0; i < b.length; ++i) {
            b[i] = new int[l];
            --l;
            switch (i) {
                case 0: value = 3; break;
                case 1: value = 2; break;
                case 2: value = 1; break;
            }
            for (int j = 0; i < b.length; ++i) {
                b[i][j] = value;
            }
        }

        System.out.println("=================");
        value = 42;
        b = new int[(r.nextInt(15))][0];
        for (int i = 0; i < b.length; ++i) { //rows
            b[i] = new int[r.nextInt(15)];
            for (int j = 0; j < b[i].length; ++j) { //cols
                b[i][j] = value;
            }
            System.out.println();
        }
        for (int i = 0; i < b.length; ++i) { //rows
            for (int j = 0; j < b[i].length; ++j) { //cols
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }


    }

}
