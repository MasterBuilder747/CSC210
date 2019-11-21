package Week12;

import java.util.Scanner;

public class RationalNumber2 {

    /*
    NOTES:
    value is an integer over an integer (ratio)

    int numerator
    int denominator

    add
    sub
    mult
    div
     */

    private int numerator;
    private int denominator;
    private int sign; //1 or -1

    public RationalNumber2() {
        //yes, this is redundant, but it is important to be here in case it needs to be changed
        this.denominator = 0;
        this.numerator = 1;
        this.sign = 1;
    }

    public RationalNumber2(int numerator, int denominator) throws IllegalArgumentException {
        if (denominator == 0) {
            throw new IllegalArgumentException("0 denominator");
        }
        this.numerator = numerator;
        this.denominator = denominator;

        //do the math then put in the sign of the number
        if (numerator < 0 && denominator > 0) {
            sign = -1;
            this.numerator = -numerator; //negation operator: "-"
            this.denominator = denominator;
        }else if (numerator > 0 && denominator < 0) {
            sign = -1;
            this.numerator = numerator;
            this.denominator = -denominator;
        }else if (numerator < 0 && denominator < 0) {
            this.sign = 1;
            this.numerator = -numerator;
            this.denominator = -denominator;
        }else{
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public String toString () {
        String s = "";
        if (this.sign < 0) {
            s = s + "-";
        }
        s = s + numerator + "/" + denominator;
        return s;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        try {
            /*
            System.out.println("numerator: ");
            int num = kb.nextInt();
            System.out.println("denominator: ");
            int den = kb.nextInt();

             */

            RationalNumber2 r0 = new RationalNumber2(1, 2);
            RationalNumber2 r1 = new RationalNumber2(3, 2);
            System.out.println("r0: " + r0);
            System.out.println("r1: " + r1);
            System.out.println("add: " + r0.add(r1));
            //System.out.println("sub: " + r0.sub(r1));
            //System.out.println("mul: " + r0.mul(r1));
            //System.out.println("div: " + r0.div(r1));
        }catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        //System.out.println("default: " + new RationalNumber2());
        kb.close();
    }

    // -- this + rhs
    public RationalNumber2 add(RationalNumber2 rhs) {
        int n = 0;
        int d = 0;
        if (this.denominator == rhs.denominator) {
            n = this.numerator + rhs.numerator;
            d = rhs.denominator;
        }else{

        }
        return new RationalNumber2(n, d);
    }

    // -- this - rhs
    public RationalNumber2 sub(RationalNumber2 rhs) {
        return new RationalNumber2();
    }

    // -- this * rhs
    public RationalNumber2 div(RationalNumber2 rhs) {
        return new RationalNumber2();
    }

    // -- this / rhs
    public RationalNumber2 mul(RationalNumber2 rhs) {
        return new RationalNumber2();
    }

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public int getSign() {
        return sign;
    }
    public void setSign(int sign) {
        this.sign = sign;
    }

    //make private for the secret euclid algorithm
    private int gcd(int a, int b) {
        int dividend = a >= b ? a : b;
        int divisor = a <= b ? a : b;
        while(divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }

    private RationalNumber2 flip() {
        int a = this.denominator;
        int b = this.numerator;
        return new RationalNumber2(a, b);
    }

}
