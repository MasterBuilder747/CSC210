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
    private int sign; //1 or -1

    public RationalNumber() {
        //yes, this is redundant, but it is important to be here in case it needs to be changed
        this.denominator = 0;
        this.numerator = 1;
        this.sign = 1;
    }

    public RationalNumber (int numerator, int denominator) throws IllegalArgumentException {
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



    }

}
