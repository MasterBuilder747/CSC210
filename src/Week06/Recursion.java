package Week06;

public class Recursion {

    //throws will catch the exception when parsed without processing the function
    public static int factorialI(int n) throws IllegalArgumentException {
        if (n < 0) {
            //declares a new exception to parse with IllegalArgumentException to state a message
            throw new IllegalArgumentException("N < 0");
        }
        int fact = 1;
        for (int i = 1; i <= n; ++i) {
            fact = fact * i;
        }
        return fact;
    }

    public static int factorialR(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("N < 0");
        }

        if (n == 0 || n == 1) {
            return 1;
        }else{
            return n * factorialR(n - 1);
        }
    }

    public static void main(String[] args) {

        /*
        System.out.println(factorialI(-5));
        //this will memory overload (stack)
        System.out.println(factorialR(-5));
        */

        int f = -100;
        try {
            f = factorialI(5);
            System.out.println(f);
            f = factorialR(5);
            System.out.println(f);
        }catch (IllegalArgumentException e) {
            System.out.println(f);
            System.out.println(e);
        }

    }

}
