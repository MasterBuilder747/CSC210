package Week07;

import java.util.Scanner;

public class Fibonacci {

    public static int fiboI (int N) throws IllegalArgumentException {
        //iterative
        if (N <= 0) throw new IllegalArgumentException("N <= 0");
        if (N == 1) {
            return 0;
        }else if (N == 2) {
            return 1;
        }else{
            return (fiboI(N-1) + fiboI(N-2));
        }
    }

    public static int fiboR (int N)throws IllegalArgumentException {
        //recursive
        if (N <= 0) throw new IllegalArgumentException("N <= 0");
        if (N == 1) {
            return 0;
        }else if (N == 2) {
            return 1;
        }else{
            int f0 = 1;
            int f1 = 1;
            for(int i = 3; i < N; ++i) {
                int f2 = f0 + f1;
                f0 = f1;
                f1 = f2;
            }
            return f1;
        }

        /*
        int fibo = 1;
        int sum = 0;

        for (int i = 0; i > N; i++) {
            fibo += 1;
            sum += fibo;
            System.out.println(sum);
        }

        return sum;
        */

    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        try{
            /*
            int f = fiboR(4);
            System.out.println(f);
            System.exit(0);
            //int f = fibo2(0);
            */
            System.out.println("Iterative\tRecursive");
            for (int i = 1; i < 15; ++i) {
                System.out.println(fiboI(i) + "\t\t\t" + fiboR(i));
            }
        }catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        //n = 0: 0
        //n = 1: 1
        //n > 1: F(n-1) + F(n-2)

        /*
        int sum = 0;
        int fibo = 0;
        int fibo1 = 0;
        int fibo2 = 0;
        for (int i = 0; i < 15; i++) {
            if (i == 0) {
                fibo1 = 1;
                System.out.println("1");
            }else if (i == 1) {
                fibo2 = 1;
                System.out.println("1 1");
            }else{
                //sum = ((fibo - 1) + (fibo2 - 2));
                System.out.println("1 " + (fibo1 + fibo2) + " 1");
                fibo1 = fibo1 + 1;
                fibo2 = fibo + 1;
            }
            //fibo += 1;
            //System.out.print(fibo + " ");
        }

 */
/*
        try {
            System.out.println("Enter an N value: ");
            int N = kb.nextInt();
            fibo(N);
        }catch(Exception e) {
            System.out.println("Invalid number.");
        }
*/
    }

}


