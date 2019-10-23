package Week04;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        int w = 2;
        int v = 4;
        int u = 5;

        if ((w < 20) && (v > 10)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if (x || y) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if (x || y) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }



        if (u < v) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        u = 50;
        v = 75;
        w = 100;
        //incomplete example
        /*
        if ((u < v) || x) v == 10) && y < w) { //short circuit (and/or); condition has a "side effect"
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        */

        System.out.println(u + " " + v + " " + w);

    }

}