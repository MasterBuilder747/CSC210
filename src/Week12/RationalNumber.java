package Week12;

public class RationalNumber {

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

    public RationalNumber() {
        //yes, this is redundant, but it is important to be here in case it needs to be changed
        this.denominator = 0;
        this.numerator = 1;
    }

    public RationalNumber (int numerator, int denominator) throws IllegalArgumentException {
        if (denominator == 0) {
            throw new IllegalArgumentException("0 denominator");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public static void main(String[] args) {



    }



}
