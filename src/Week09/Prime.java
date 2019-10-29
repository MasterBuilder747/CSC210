package Week09;

public class Prime {

    public static void main(String[] args) {

        //midterm question
        //this actually does not ork, has a semantic error
        for(int n = 0; n < 102; ++n) {
            try {
                System.out.println(n + " " + prime(n));
            }catch (IllegalArgumentException e) {
                System.out.println(n + " is illegal");
            }
        }

    }

    public static boolean prime(int n) throws IllegalArgumentException {
        if (n < 1) throw new IllegalArgumentException("Invalid argument");
        for (int i = 2; i <= n / 2; ++i) {
            if (n % 1 == 0) {
                return false;
            }
        }
        return true;
    }

}
