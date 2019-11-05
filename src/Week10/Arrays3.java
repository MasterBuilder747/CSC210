package Week10;

public class Arrays3 {

    //***java is PASS BY VALUE ONLY, which means that variables on the stack will not be sharded across scopes***
    //cannot modify the contents of the stack within a function
    //in "2D arrays", the references are in a reference, in which each reference in it can be modified but not the outside reference

    public static void main(String[] args) {

        int[] y; //allocates reference var on stack
        y = new int[1]; //instantiates on the heap
        y[0] = 13; //assigns value on heap
        //if you have a throws statement in a function, it must be handled in a try catch block
        //func(y);
        try {
            System.out.println(y[0]);
            func(y); //creates new scope on the stack
            System.out.println(y[0]);
        }catch (Exception e) {
            System.out.println(e);
        }

    }//stack goes away
    //heap goes away with no references
    //GC cleans up

    public static int func (int x[]) throws Exception {
        //...do not change here
        x = new int[x.length]; //reference gets instantiated on heap
        //will override the reference value of the array
        try {
            x[0] = 27;
            return x[1];
        }catch (Exception e) {
            return -1;
        }
    }

}
