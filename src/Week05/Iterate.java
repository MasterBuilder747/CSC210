package Week05;

import java.util.Scanner;

public class Iterate {

    public static void main(String[] args) {

        //these are all the same loop

        //for (; i > 10) {
        //}

        int i;
        System.out.println("for");
        for (i = 0; i < 10; i++) //you can put a ; [python]
            {
            // 1 statement which can be a block {}
            System.out.println(i);
        }
        System.out.println("while");

        i = 0;
        while (i < 10) {
            //1 statement which can be a block {}
        System.out.println(i);
            ++i;
        }
        System.out.println("do-while");

        i = 0;
        //if (i < 10) [optional, can check i]
        do {
            // 1 statement which can be a block {}
        System.out.println(i);
            ++i;
        } while (i < 10);

        //do not use: goto

        int N = 9;
        for (int j = 0; j != N; ++j) {
            if (j % 2 == 0) {
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }

        Scanner kb = new Scanner(System.in);
        System.out.println("enter a number between 1 and 10: ");
        int x;
        do {
            x = kb.nextInt();
        }while (x < 1 || x > 10);

        kb.close();
    }

}