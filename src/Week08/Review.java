package Week08;

public class Review {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x + " before call to method"); //stores value to stack
        //x = method(x);
        System.out.println("x = " + x + " after call to method"); //
        //method(x);

        double a[];
        a = new double[3];
        for (int i = 0; i < a.length; ++i) {
            a[i] = i;
        }

        a = new double[x];
        try {

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds index");
        }catch (Exception e) {
            System.out.println("general exception");
        }
        finally {
            System.out.println("Finally");
        }

        float b[] = {0, 1, 2};
        char c[] = {'a', 'b', 'c'};

        try {
            int y = method(-1);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static int method(int x) throws Exception {
        System.out.println("x = " + x + " at start of method"); //has value from argument
        x = x * 10;
        System.out.println("x = " + x + " at end of method"); //has the new value
        return x;
    }
}
