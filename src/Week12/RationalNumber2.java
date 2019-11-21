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
            int num = kb.nextInt();
            System.out.println("numerator: ");
            int den = kb.nextInt();
            System.out.println("denominator: ");

            RationalNumber2 r = new RationalNumber2(num, den);
            System.out.println(r);
        }catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println("default: " + new RationalNumber2());
        kb.close();
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

    // -- this + rhs
    public RationalNumber2 add(RationalNumber2 rhs) {
        return new RationalNumber2();
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

}
