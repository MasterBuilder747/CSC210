package Week10;

public class GCtest {

    public static void main(String[] args) {

        int x[]; //x is reference to int
        for(int i = 0; i < 1000; ++i) {
            x = new int[1000]; //heap, allocate new
            x[0] = 0;

            //object/class reference = heap object/class(parameter list);
        }

    }

    //you are already creating an object when defining a new class, so therefore this name of this function already exists
    //defining this as an override must be correct, see the java code when doing so

    //as of java 9, this NOT LONGER WORKS!!!
    //therefore changing this does nothing
    //it has a @depreciated in source
    public void finalize() {
        //garbage collection
        System.out.println("Garbage Collection!!!");
    }

}
