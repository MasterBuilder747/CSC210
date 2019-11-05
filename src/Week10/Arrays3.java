package Week10;

public class Arrays3 {

    //***java is PASS BY VALUE ONLY, which means that variables on the stack will not be sharded across scopes***

    public static void main(String[] args) {

        int y[] = {133, 0};
        //changes in the function call...
        System.out.println(func(y));
    }

    public static int func (int x[]) {
        //...do not change here
        x = new int[x.length];
        //will override the reference value of the array
        try {
            x[0] = 27;
            return x[1];
        }catch (Exception e) {
            return -1;
        }
    }

}
